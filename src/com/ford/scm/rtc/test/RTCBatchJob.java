//****************************************************************
//* Copyright (c) 2014 Ford Motor Company. All Rights Reserved.
//****************************************************************
package com.ford.scm.rtc.test;

import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.ford.scm.accurev.util.AccuRevUtil;
import com.ford.scm.util.SCMUtil;

/**
 * TODO - Place class description here
 */
public class RTCBatchJob {

    public static String SOURCE_STREAM_UUID = "1033";
    public static String WORKSPACE_ROOT = "c:/dataRTC/data";
    public static String RTC_URL = "https://ahivas02498.ahi.ford.com:9443/ccm";
    public static String LOGIN =
            "lscm login -r https://ahivas02498.ahi.ford.com:9443/ccm -u admin -P admin";
    public static String SHOW_STATUS =
            "lscm show status -u admin -P admin -w -v";
    public static String ACCEPT_CHANGESET =
            "lscm accept -s %s -t RTCWorkspace -r https://ahivas02498.ahi.ford.com:9443/ccm -c %s";
    public static String ACCEPT_BASELINE =
            "lscm accept -s %s -t RTCWorkspace -r https://ahivas02498.ahi.ford.com:9443/ccm -b %s";
    public static String LOGOUT =
            "lscm logout -r https://ahivas02498.ahi.ford.com:9443/ccm";
    public static String STOP_ALL = "scm daemon stop --all";
    public static String LIST_SNAPSHOTS =
            "lscm list snapshots -r https://ahivas02498.ahi.ford.com:9443/ccm -m 100";
    public static String LIST_BASELINE = "lscm list baseline -s %s";
    public static String LIST_BASELINE_J = "lscm list baselines -j -s %s";
    public static String developer = "swang42";
    public static String pwd = "...";
    public static String leader = "skasarla";
    public static String lpwd = "...";
    public static String LIST_CHANGESETS =
            "lscm list changesets -r https://ahivas02498.ahi.ford.com:9443/ccm --created-after %s";

    /**
     * TODO - Place method description here
     * 
     * @param args
     */
    public static void main(final String[] args) {

        final RTCBatchJob job = new RTCBatchJob();

        job.start();

        /*
        job.login(developer, pwd);
        job.removeExistingSnapshots(job.getIncomingBaselines(),
                job.getAllBaselines(job.getSnapshots()));
        // job.getIncomingBaselines();
        // job.getIncomingChangesets();
        // job.getBaseline("1154");
        job.logout();
        */
        /*
        AccuRevUtil.login(developer, pwd);
        AccuRevUtil.addNew("test");
        AccuRevUtil.keepChanges("test keep");
        // final String issueNum = AccuRevUtil.createNewIssue(NEW_ISSUE_XML);
        AccuRevUtil.checkinChanges("test", "22");
        AccuRevUtil.defunct("test", AccuRevUtil.getMissingFiles());
        AccuRevUtil.checkinChanges("delete", "22");

        AccuRevUtil.logout();
        */

    }

    public void start() {

        final List task = new ArrayList<SCMChange>();

        try {
            final ProcessBuilder pb;

            login("", "");

            final List<RTCSnapshot> snapshots =
                    getIncomingSnapshots(getIncomingBaselines(),
                            getAllBaselines(getSnapshots()));

            // Get incoming change sets
            final List<String> incomingChangesets = getIncomingChangesets();

            if (incomingChangesets != null) {

                AccuRevUtil.login(developer, pwd);
                // Write log
                for (int i = incomingChangesets.size() - 1; i >= 0; i--) {
                    final String changeSetNum =
                            getIncomingChangesetNumber(incomingChangesets.get(i));

                    final Date changesettime =
                            getIncomingChangesetTime(incomingChangesets.get(i));
                    // Check snapshot
                    createSnapshot(snapshots, changesettime);

                    // Accept incoming change set
                    System.out.println("get changes in Change set: "
                                       + changeSetNum);
                    if (!acceptChangeset(changeSetNum))
                        continue;
                    // TODO: find and copy different files into another ws,
                    // delete those files which are deleted

                    // Check in new changes into AccuRev
                    AccuRevUtil.addNew(incomingChangesets.get(i));
                    // Write log
                    AccuRevUtil.keepChanges(incomingChangesets.get(i));
                    // Write log
                    final String issueNum =
                            AccuRevUtil.createNewIssue(AccuRevUtil.NEW_ISSUE_XML);

                    // Checkin all kept files(the new files and mofidified
                    // files)
                    AccuRevUtil.checkinChanges(incomingChangesets.get(i),
                            issueNum);

                    AccuRevUtil.defunct(incomingChangesets.get(i),
                            AccuRevUtil.getMissingFiles());
                    AccuRevUtil.checkinChanges(incomingChangesets.get(i),
                            issueNum);

                }

                if (snapshots != null && !snapshots.isEmpty()) {
                    createSnapshot(snapshots, new Date());
                }

                // TODO: Move new changes into working copy for recovery

                AccuRevUtil.logout();

            }

        } catch (final Exception e) {
            // Write log, send email
            e.printStackTrace();
        } finally {
            // Write log
            logout();
        }
    }

    /*
    private List<String> getIncomingChangesets() {

        ProcessBuilder pb;
        System.out.println("lscm show status ...");// SHOW_STATUS);
        pb = new ProcessBuilder("CMD", "/C", SHOW_STATUS);
        pb.directory(new File(WORKSPACE_ROOT));
        pb.redirectErrorStream(true);
        final String output = SCMUtil.executeCommand(pb);

        String[] incomingChangesets;

        if (!output.contains("Incoming:"))
            return null;

        String incomingString = output.substring(output.indexOf("Incoming:"));
        if (incomingString != null) {
            incomingString =
                    incomingString.substring(incomingString.indexOf("Change sets:") + 14);
            if (incomingString.contains("Baselines")) {
                incomingString =
                        incomingString.substring(incomingString.indexOf("("),
                                incomingString.indexOf("Baselines"));
            }
        }
        incomingChangesets = incomingString.split("\n\n");
        final List<String> changesets = new ArrayList<String>();
        int i = 0;
        for (final String setStr : incomingChangesets) {
            if (setStr == null || setStr.trim().length() == 0)
                continue;

            changesets.add(setStr.trim().replace("\"", "\\\""));
            System.out.println("change set string" + i + ": "
                               + changesets.get(i));
            i++;
        }

        return changesets;
    }
    
    */

    private List<String> getIncomingChangesets() {

        final String nowStr = SCMUtil.getDateStr(new Date(), "yyyy/MM/dd");
        ProcessBuilder pb;
        final String listchangesets =
                String.format(LIST_CHANGESETS, new String[] {nowStr});
        System.out.println(listchangesets);
        pb = new ProcessBuilder("CMD", "/C", listchangesets);
        pb.directory(new File(WORKSPACE_ROOT));
        pb.redirectErrorStream(true);
        final String output = SCMUtil.executeCommand(pb);

        String[] incomingChangesets;

        if (!output.contains("Change sets:"))
            return null;

        incomingChangesets = output.split("\n\n");
        final List<String> changesets = new ArrayList<String>();
        int j = 0;
        for (int i = 1; i < incomingChangesets.length; i++) {
            System.out.println("change set string" + i + ": "
                               + incomingChangesets[i].trim());
            if (incomingChangesets[i] == null
                || incomingChangesets[i].trim().length() == 0)
                continue;
            changesets.add(incomingChangesets[i].trim().replace("\"", "\\\""));
            System.out.println("change set string" + i + ": "
                               + changesets.get(j));
            j++;

        }

        return changesets;
    }

    private String getIncomingChangesetNumber(final String setStr) {
        System.out.println("change set: " + setStr);
        System.out.println("setStr.indexOf('('): " + setStr.indexOf('(') + 1);
        System.out.println("setStr.indexOf(')'): " + setStr.indexOf(')'));

        final String incomingChangesetNumber =
                setStr.substring(setStr.indexOf('(') + 1, setStr.indexOf(')'));
        System.out.println("change set#: " + incomingChangesetNumber);

        return incomingChangesetNumber;
    }

    private Date getIncomingChangesetTime(final String setStr) {
        final String incomingChangesetTimeStr =
                setStr.substring(setStr.lastIndexOf('"') + 1);

        System.out.println("incomingChangesetTimeStr: "
                           + incomingChangesetTimeStr);
        final Date incomingChangesetTime =
                SCMUtil.getDateFromString(incomingChangesetTimeStr,
                        "dd-MMM-yyyy hh:mm aa");
        System.out.println("change set time: " + incomingChangesetTime);

        return incomingChangesetTime;
    }

    private List<RTCSnapshot> getIncomingSnapshots(
            final List<String> incomings, final List<RTCSnapshot> allList) {

        if (allList == null || allList.isEmpty())
            return null;

        if (incomings == null || incomings.isEmpty())
            return null;
        final List<RTCSnapshot> incomingList = new ArrayList<RTCSnapshot>();

        for (final RTCSnapshot s : allList) {

            if (incomings.contains(s.getBaselineUUID())) {
                incomingList.add(s);
                System.out.println("incoming baseline: " + s.getBaselineUUID());
            }

        }
        return incomingList;
    }

    private List<String> getIncomingBaselines() {

        ProcessBuilder pb;
        System.out.println("lscm show status ...");// SHOW_STATUS);
        pb = new ProcessBuilder("CMD", "/C", SHOW_STATUS);
        pb.directory(new File(WORKSPACE_ROOT));
        pb.redirectErrorStream(true);
        final String output = SCMUtil.executeCommand(pb);

        final String[] incomingBaselines;

        if (!output.contains("Incoming:"))
            return null;

        String incomingString = output.substring(output.indexOf("Incoming:"));

        if (incomingString.contains("Baselines")) {
            incomingString =
                    incomingString.substring(incomingString.indexOf("Baselines"));
        }

        System.out.println(incomingString);

        incomingBaselines = incomingString.split("\n\n");
        final List<String> baselines = new ArrayList<String>();
        final int i = 0;
        for (final String setStr : incomingBaselines) {
            System.out.println("setStr " + setStr);
            if (setStr == null || setStr.trim().length() == 0)
                continue;

            System.out.println("setStr2 " + setStr);
            if (setStr.indexOf('(') >= 0) {
                final String s =
                        setStr.substring(setStr.indexOf('(') + 1,
                                setStr.indexOf(')'));
                baselines.add(s);
                System.out.println("baseline id: " + s);
            }
        }

        return baselines;
    }

    public void login(final String user, final String password) {
        try {
            System.out.println("lscm login RTC ... ");// LOGIN);
            final ProcessBuilder pb = new ProcessBuilder("CMD", "/C", LOGIN);
            pb.directory(new File("c:/dataRTC/data"));
            pb.redirectErrorStream(true);
            SCMUtil.executeCommand(pb);

        } catch (final Exception e) {

        }

    }

    public boolean acceptChangeset(final String changeSetNum) {
        try {
            final String accept =
                    String.format(ACCEPT_CHANGESET,
                            new String[] {SOURCE_STREAM_UUID, changeSetNum});
            System.out.println(accept);
            final ProcessBuilder pb = new ProcessBuilder("CMD", "/C", accept);
            pb.directory(new File(WORKSPACE_ROOT));
            pb.redirectErrorStream(true);
            final String output = SCMUtil.executeCommand(pb);
            if (output != null && output.contains("unchanged"))
                return false; // no change
            else
                return true;

        } catch (final Exception e) {

        }
        return false;
    }

    public void acceptBaseline(final String baseline) {
        try {
            final String accept =
                    String.format(ACCEPT_BASELINE,
                            new String[] {SOURCE_STREAM_UUID, baseline});
            System.out.println(accept);
            final ProcessBuilder pb = new ProcessBuilder("CMD", "/C", accept);
            pb.directory(new File(WORKSPACE_ROOT));
            pb.redirectErrorStream(true);
            SCMUtil.executeCommand(pb);

        } catch (final Exception e) {

        }

    }

    public void logout() {
        try {
            System.out.println(LOGOUT);
            ProcessBuilder pb = new ProcessBuilder("CMD", "/C", LOGOUT);
            pb.directory(new File("c:/dataRTC/data"));
            pb.redirectErrorStream(true);
            SCMUtil.executeCommand(pb);
            System.out.println(STOP_ALL);
            pb = new ProcessBuilder("CMD", "/C", STOP_ALL);
            pb.redirectErrorStream(true);
            SCMUtil.executeCommand(pb);

        } catch (final Exception e) {

        }

    }

    public String[] getSnapshots() {

        ProcessBuilder pb;
        System.out.println(LIST_SNAPSHOTS);
        pb = new ProcessBuilder("CMD", "/C", LIST_SNAPSHOTS);
        pb.directory(new File(WORKSPACE_ROOT));
        pb.redirectErrorStream(true);
        final String output = SCMUtil.executeCommand(pb);

        String[] snapshots;

        if (output == null)
            return null;
        if (output.contains("No snapshots found"))
            return null;

        snapshots = output.split("\n\n");

        int i = 0;
        for (final String snapshot : snapshots) {
            if (snapshot.contains("(")) {
                snapshots[i] =
                        snapshot.substring(snapshot.indexOf('(') + 1,
                                snapshot.indexOf(')'));
                System.out.println(snapshots[i]);
                i++;
            }
        }

        return snapshots;
    }

    public List<RTCSnapshot> getAllBaselines(final String[] snapshots) {

        if (snapshots == null || snapshots.length == 0)
            return null;

        final List<RTCSnapshot> baselines = new ArrayList<RTCSnapshot>();
        int i = 0;
        for (final String snapshot : snapshots) {
            baselines.add(getBaseline(snapshot));
            System.out.println("baseline date: " + baselines.get(i).getDate());
            i++;
        }
        return baselines;

    }

    public RTCSnapshot getBaseline(final String snapshot) {

        final RTCSnapshot baseline = new RTCSnapshot();
        final String baselineId = getBaselineId(snapshot);
        if (baseline == null)
            return null;

        baseline.setBaselineUUID(baselineId);
        ProcessBuilder pb;
        final String listBaseline =
                String.format(LIST_BASELINE_J, new String[] {snapshot});
        System.out.println(listBaseline);

        pb = new ProcessBuilder("CMD", "/C", listBaseline);
        pb.directory(new File(WORKSPACE_ROOT));
        pb.redirectErrorStream(true);
        final String output = SCMUtil.executeCommand(pb);

        if (output == null)
            return null;

        baseline.setId(snapshot);

        System.out.println("getBaseline:" + output);
        if (output.contains("baselines")) {
            String baseString = output.substring(output.indexOf("baselines"));
            System.out.println("getBaseline baseString:" + baseString);
            baseString =
                    baseString.substring(baseString.indexOf('{') + 1,
                            baseString.indexOf('}'));
            baseString = baseString.replace("\"", "");
            final String[] baselines = baseString.split("\n");
            int i = 0;
            baseline.setComment(baseString);
            baseline.setId(snapshot);
            for (final String base : baselines) {
                // baseline.setComment(baseline.getComment() + base.trim());
                System.out.println("base:" + base);

                if (base.contains("creationDate")) {
                    baseline.setDateStr(base.substring(base.indexOf(':') + 1,
                            base.length() - 1).trim());

                }
                if (base.contains("contributor")) {
                    baseline.setUser(base.substring(base.indexOf(':') + 1,
                            base.length() - 1)
                            .replace("\"", "")
                            .trim());

                }
                if (base.contains("name")) {
                    baseline.setName(base.substring(base.indexOf(':') + 1,
                            base.length() - 1)
                            .replace("\"", "")
                            .trim());

                }
                i++;
            }
            System.out.println("From RTC: " + baseline.getComment());
            System.out.println("date: " + baseline.getDateStr());
            System.out.println("user: " + baseline.getUser());

            baseline.setDate(SCMUtil.getDateFromString(baseline.getDateStr()
                    .trim(), "MMM d, yyyy hh:mm:ss aa"));
            System.out.println("date: " + baseline.getDate());

        }

        return baseline;

    }

    public String getBaselineId(final String snapshot) {

        ProcessBuilder pb;
        final String listBaseline =
                String.format(LIST_BASELINE, new String[] {snapshot});
        System.out.println(listBaseline);

        pb = new ProcessBuilder("CMD", "/C", listBaseline);
        pb.directory(new File(WORKSPACE_ROOT));
        pb.redirectErrorStream(true);
        final String output = SCMUtil.executeCommand(pb);

        if (output.contains("Baseline")) {
            String baseString = output.substring(output.indexOf("Baseline"));
            baseString =
                    baseString.substring(baseString.indexOf('(') + 1,
                            baseString.indexOf(')'));

            System.out.println("baseline id: " + baseString);
            return baseString;

        }
        return null;

    }

    public void createSnapshot(final List<RTCSnapshot> changes, final Date time) {

        if (changes == null || changes.isEmpty())
            return;

        AccuRevUtil.logout();
        AccuRevUtil.login(leader, lpwd);
        for (int i = changes.size() - 1; i >= 0; i--) {

            if (changes.get(i) != null) {
                if (changes.get(i).getDate().before(time)) {

                    acceptBaseline(changes.get(i).getBaselineUUID());

                    AccuRevUtil.createSnapshot(changes.get(i).getName()
                                               + "_"
                                               + changes.get(i).getUser()
                                               + "_"
                                               + changes.get(i)
                                                       .getDateStr()
                                                       .replace(", ", "_")
                                                       .replace(' ', '_')
                                                       .replace(':', '-') + "_"
                                               + changes.get(i).getId());
                    changes.remove(i);
                }
            }

        }
        AccuRevUtil.logout();
        AccuRevUtil.login(developer, pwd);
    }

    public void test() {
        final String testCMD =
                "lscm get change -w 1033 -o 1202 \"/WebExpressKey.jpg\" \"c:\\dataRTCCopy\\WebExpressKeyTest.jpg\"";
        try {
            System.out.println(testCMD);
            final ProcessBuilder pb = new ProcessBuilder("CMD", "/C", testCMD);
            pb.directory(new File("c:/dataRTC/data"));
            pb.redirectErrorStream(true);
            SCMUtil.executeCommand(pb);
        } catch (final Exception e) {

        }

    }

}