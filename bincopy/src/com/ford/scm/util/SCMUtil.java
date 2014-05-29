//****************************************************************
//* Copyright (c) 2014 Ford Motor Company. All Rights Reserved.
//****************************************************************
package com.ford.scm.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * TODO - Place class description here
 */
public class SCMUtil {

    public static String executeCommand(final ProcessBuilder pb) {

        final StringBuffer output = new StringBuffer();

        Process p;
        try {
            // System.out.println("Before start");
            p = pb.start();
            // System.out.println("after start");
            // p.waitFor(); // not work for dir, not work sometimes for all
            // commands, never comes back
            // System.out.println("after waitFor");
            final BufferedReader reader =
                    new BufferedReader(
                            new InputStreamReader(p.getInputStream()));
            /*
            String line = reader.readLine();
            while (line != null && line.length() > 0) {
                output.append(line + "\n");
                line = reader.readLine();
            }
            */

            String line = "";
            // System.out.println("Before read while");
            while ((line = reader.readLine()) != null) {
                output.append(line + "\n");
                // System.out.println("inside reade while");
                if (!reader.ready()) {
                    // System.out.println("inside not ready");
                    Thread.sleep(3000);
                    if (!reader.ready()) {
                        // System.out.println("not ready break");
                        break;
                    }

                    /*
                    if (p.exitValue() == 0) {
                        System.out.println("ready break");
                        break;
                    } else {
                        // reader.wait(3000);
                        if (!reader.ready()) {
                            System.out.println("not ready break");
                            break;
                        }
                    }*/
                }

            }
            final int i = p.exitValue();
            System.out.println("Retrun code: " + i);
            // if (i != 0)
            // throw new Exception("failed to call the CMD.");

        } catch (final Exception e) {
            e.printStackTrace();
        }

        System.out.println(output.toString());
        return output.toString();

    }

    public static String executeCommand(final Runtime r, final String command) {

        final StringBuffer output = new StringBuffer();

        Process p;
        try {
            System.out.println(command);
            p = r.exec("cmd /C " + command);
            // p.waitFor();//not work for dir

            final BufferedReader reader =
                    new BufferedReader(
                            new InputStreamReader(p.getInputStream()));

            String line = reader.readLine();
            while (line != null && line.length() > 0) {
                output.append(line + "\n");
                line = reader.readLine();
            }

            /*
            final BufferedReader readerErr =
                    new BufferedReader(
                            new InputStreamReader(p.getErrorStream()));

            if (readerErr == null) {
                String lineErr = "";
                while ((lineErr = readerErr.readLine()) != null) {
                    output.append(lineErr + "\n");
                }
            }
            */
        } catch (final Exception e) {
            e.printStackTrace();
        }

        return output.toString();

    }

    public static Date getDateFromString(final String dateStr,
            final String pattern) {
        final String METHOD_NAME = "getDatefromString";
        final SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        Date date = null;
        try {
            date = dateFormat.parse(dateStr);
        } catch (final Exception e) {
            e.printStackTrace();
        }

        return date;
    }

    public static String getDateStr(final Date date, final String pattern) {
        final String METHOD_NAME = "getDateStr";

        final SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        String dateStr = null;
        try {
            dateStr = dateFormat.format(date);
        } catch (final Exception e) {
            e.printStackTrace();
        }

        return dateStr;
    }

    /**
     * TODO - Place method description here
     * 
     * @param args
     */
    public static void main(final String[] args) {
        System.out.println(SCMUtil.getDateFromString("May 8, 2014 1:37:23 AM",
                "MMM d, yyyy hh:mm:ss aa"));
    }
}