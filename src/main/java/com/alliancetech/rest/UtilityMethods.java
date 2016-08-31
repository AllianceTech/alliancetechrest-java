package com.alliancetech.rest;

import java.util.Random;

/*
 * UtilityMethods.java
 * 
 * (c) Alliance Tech 2009.
 * ---------------------------------------------------------------------
 * Change History:
 * Name			Date		Description
 * ------------ -----------	----------------------------------------
 * Jeff S.		08/01/2007	Created Class.
 * Ge S.		01/25/2010  Added retrieveBadgeID() method.
 * ---------------------------------------------------------------------
 */

/**
 * The UtilityMethods class provides static helper methods for the this
 * Application.
 *
 * @author Jeff Seifert <br>
 *         Creation Date: 08/01/2007 15:50:00
 * @version Ver 1.0.1 12/21/2007
 */

public class UtilityMethods {
    /**
     * UtilityMethods constructor comment.
     */
    public UtilityMethods() {
        super();
    }

    /**
     * Used to generate a string with random numbers
     *
     * @param aiLength Length
     * @return String
     */
    public static String generateRandomNumber(int aiLength) {
        StringBuffer lsRandomString = new StringBuffer();
        if (aiLength > 0) {
            Random laRandom = new Random();
            int liLow = 0;
            int liHigh = 9;
            for (int idx = 1; idx <= aiLength; ++idx) {
                lsRandomString.append(laRandom.nextInt(liHigh - liLow) + liLow);
            }
        }
        return lsRandomString.toString();
    }

    /**
     * Genrates a random number.
     *
     * @param aiLow  int
     * @param aiHigh int
     * @return int
     */
    public static int generateRandomNumber(int aiLow, int aiHigh) {
        Random laRandom = new Random();
        return laRandom.nextInt(aiHigh - (aiLow - 1)) + aiLow;
    }

    /**
     * Used to generate a string with random characters.
     *
     * @param aiLengh int
     * @return String
     */
    public static String generateRandomString(int aiLengh) {
        String lsRandomString = "";
        if (aiLengh > 0) {
            char[] larrRandomChar = new char[aiLengh];
            int c = 'A';
            int r1 = 0;
            for (int i = 0; i < aiLengh; i++) {
                r1 = (int) (Math.random() * 3);
                switch (r1) {
                    case 0:
                        c = '0' + (int) (Math.random() * 10);
                        break;
                    case 1:
                        c = 'a' + (int) (Math.random() * 26);
                        break;
                    case 2:
                        c = 'A' + (int) (Math.random() * 26);
                        break;
                }
                larrRandomChar[i] = (char) c;
            }
            lsRandomString = new String(larrRandomChar);
        }
        return lsRandomString;
    }

    /**
     * Returns true if the String is not Null and has the length &gt; 0.
     *
     * @param asString String
     * @return boolean
     */
    public static boolean isValidString(String asString) {
        if (asString != null && asString.trim().length() > 0) {
            return true;
        } else {
            return false;
        }
    }
}