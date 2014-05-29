//****************************************************************
//* Copyright (c) 2014 Ford Motor Company. All Rights Reserved.
//****************************************************************
package com.ford.scm.accurev.util;

import java.io.File;
import java.io.InputStream;
import java.io.StringBufferInputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.ford.scm.util.Issue;
import com.ford.scm.util.SCMUtil;

public class AccuRevUtil {
    public static String LOGIN = "accurev login %s %s";
    public static String LOGOUT = "accurev logout";
    public static String ADD_NEW = "accurev add -x -c \"From RTC: %s\"";
    public static String DEFUNCT = "accurev defunct -c \"From RTC: %s\" %s";
    public static String KEEP_CHANGES =
            "accurev keep -c \"From RTC: %s\" -m -n";
    public static String PROMOTE_CHANGES =
            "accurev promote -c \"From RTC: %s\" -d -I %s";

    public static String MISSING = "accurev stat --outgoing";
    public static String CREATE_NEWISSUE = "accurev xml -l %s";
    public static String WORK_SPACE = "C:/dataRTC/data";
    public static String CREATE_SNAPSHOT =
            "accurev mksnap -s %s -b EDU_Sync_RTC_DEV -t now";
    public static String STREAM_NAME = "EDU_Sync_RTC_DEV";

    public static boolean addNew(final String comment) {
        final String add = String.format(ADD_NEW, new String[] {comment});
        ProcessBuilder pb;

        System.out.println(add);
        pb = new ProcessBuilder("CMD", "/C", add);
        pb.directory(new File(WORK_SPACE));
        pb.redirectErrorStream(true);
        SCMUtil.executeCommand(pb);

        return true;
    }

    public static boolean keepChanges(final String comment) {

        final String keep = String.format(KEEP_CHANGES, new String[] {comment});
        ProcessBuilder pb;
        System.out.println(keep);
        pb = new ProcessBuilder("CMD", "/C", keep);
        pb.directory(new File(WORK_SPACE));
        pb.redirectErrorStream(true);
        SCMUtil.executeCommand(pb);

        return true;

    }

    public static boolean checkinChanges(final String comment,
            final String issue) {

        final String checkin =
                String.format(PROMOTE_CHANGES, new String[] {comment, issue});
        ProcessBuilder pb;

        System.out.println(checkin);
        pb = new ProcessBuilder("CMD", "/C", checkin);
        pb.directory(new File(WORK_SPACE));
        pb.redirectErrorStream(true);
        SCMUtil.executeCommand(pb);

        return true;

    }

    public static String getMissingFiles() {
        ProcessBuilder pb;

        System.out.println(MISSING);
        pb = new ProcessBuilder("CMD", "/C", MISSING);
        pb.directory(new File(WORK_SPACE));
        pb.redirectErrorStream(true);
        final String out = SCMUtil.executeCommand(pb);
        final String[] missingFiles = out.split("\n");
        final StringBuffer files = new StringBuffer();

        if (missingFiles != null) {
            System.out.println("files number:" + missingFiles.length);
            for (String file : missingFiles) {
                System.out.println("file:" + file);
                if (!file.contains("EDU_Sync_RTC_DEV"))
                    continue;
                file = file.trim();
                file =
                        file.substring(0, file.indexOf("EDU_Sync_RTC_DEV") - 1)
                                .trim();
                file = file.replace('\\', '/');
                files.append("\"" + file + "\" ");
                System.out.println("missing file:" + file);

            }
        }

        System.out.println("missing files:" + files.toString().trim());
        return files.toString().trim();
    }

    /*
     * paras: comment, file1, file2...
     */
    public static boolean defunct(final String comment, final String files) {
        if (files == null)
            return true;
        final String defunct =
                String.format(DEFUNCT, new String[] {comment, files});
        ProcessBuilder pb;

        System.out.println(defunct);
        pb = new ProcessBuilder("CMD", "/C", defunct);
        pb.directory(new File(WORK_SPACE));
        pb.redirectErrorStream(true);
        SCMUtil.executeCommand(pb);

        return true;
    }

    public static boolean login(final String user, final String password) {

        System.out.println(LOGIN);
        final String login =
                String.format(LOGIN, new String[] {user, password});
        ProcessBuilder pb;
        pb = new ProcessBuilder("CMD", "/C", login);
        pb.directory(new File(WORK_SPACE));
        pb.redirectErrorStream(true);
        SCMUtil.executeCommand(pb);

        return true;
    }

    public static boolean logout() {
        ProcessBuilder pb;
        System.out.println(LOGOUT);
        pb = new ProcessBuilder("CMD", "/C", LOGOUT);
        pb.directory(new File(WORK_SPACE));
        pb.redirectErrorStream(true);
        SCMUtil.executeCommand(pb);

        return true;
    }

    public static String createNewIssue(final String xmlFile) {
        final String newIssue =
                String.format(CREATE_NEWISSUE, new String[] {xmlFile});
        ProcessBuilder pb;

        System.out.println(newIssue);
        pb = new ProcessBuilder("CMD", "/C", newIssue);
        pb.directory(new File(WORK_SPACE));
        pb.redirectErrorStream(true);
        final String out = SCMUtil.executeCommand(pb);
        final Issue issue = getNewIssue(new StringBufferInputStream(out));

        return issue.getIssueNum();
    }

    public static Issue getNewIssue(final InputStream input) {

        try {

            final JAXBContext jaxbContext =
                    JAXBContext.newInstance(Issue.class);

            final Unmarshaller jaxbUnmarshaller =
                    jaxbContext.createUnmarshaller();
            final Issue issue = (Issue)jaxbUnmarshaller.unmarshal(input);
            // System.out.println(issue.getShortDescription());
            // System.out.println(issue.getSubmittedBy());
            // System.out.println(issue.getTransNum());
            System.out.println("new issue#: " + issue.getIssueNum());

            return issue;

        } catch (final JAXBException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static String createSnapshot(final String name) {
        final String createSnapshot =
                String.format(CREATE_SNAPSHOT, new String[] {STREAM_NAME + "_"
                                                             + name});
        ProcessBuilder pb;

        System.out.println(createSnapshot);
        pb = new ProcessBuilder("CMD", "/C", createSnapshot);
        pb.directory(new File(WORK_SPACE));
        pb.redirectErrorStream(true);
        return SCMUtil.executeCommand(pb);
        // return "";

    }

}
