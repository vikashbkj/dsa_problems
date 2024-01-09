package org.example.leetcode;

import java.util.HashMap;

public class DayOfTheYear_1154 {

    public static void main(String[] args) {

//        String date = "2019-01-09";
//        String date = "2019-02-10";
//        String date = "2004-03-01";
        String date = "2008-10-10";
        int dayOfYear = findDaysOfYear(date);
        System.out.println(dayOfYear);
    }

    private static int findDaysOfYear(String date) {
        String[] strDate = date.split("-");
        boolean isLeapY = isLeapYear(Integer.parseInt(strDate[0]));

        HashMap<String, Integer> monthDaysMap = new HashMap<>(12);
        monthDaysMap.put("01", 31);

        if (isLeapY)
            monthDaysMap.put("02", 29);
        else
            monthDaysMap.put("02", 28);

        monthDaysMap.put("03", 31);
        monthDaysMap.put("04", 30);
        monthDaysMap.put("05", 31);
        monthDaysMap.put("06", 30);
        monthDaysMap.put("07", 31);
        monthDaysMap.put("08", 31);
        monthDaysMap.put("09", 30);
        monthDaysMap.put("10", 31);
        monthDaysMap.put("11", 30);
        monthDaysMap.put("12", 31);

        int monthDay = 0, dayOfYear = 0;

        try {
            String month = strDate[1];

            switch (month) {
                case "01":
                    dayOfYear = Integer.parseInt(strDate[2]);
                    break;
                case "02":
                    monthDay = numberOfDaysTillJan(monthDaysMap);
                    dayOfYear = monthDay + Integer.parseInt(strDate[2]);
                    break;
                case "03":
                    monthDay = numberOfDaysTillFeb(monthDaysMap, strDate[0]);
                    dayOfYear = monthDay + Integer.parseInt(strDate[2]);
                    break;
                case "04":
                    monthDay = numberOfDaysTillMar(monthDaysMap);
                    dayOfYear = monthDay + Integer.parseInt(strDate[2]);
                    break;
                case "05":
                    monthDay = numberOfDaysTillApr(monthDaysMap);
                    dayOfYear = monthDay + Integer.parseInt(strDate[2]);
                    break;
                case "06":
                    monthDay = numberOfDaysTillMay(monthDaysMap);
                    dayOfYear = monthDay + Integer.parseInt(strDate[2]);
                    break;
                case "07":
                    monthDay = numberOfDaysTillJun(monthDaysMap);
                    dayOfYear = monthDay + Integer.parseInt(strDate[2]);
                    break;
                case "08":
                    monthDay = numberOfDaysTillJul(monthDaysMap);
                    dayOfYear = monthDay + Integer.parseInt(strDate[2]);
                    break;
                case "09":
                    monthDay = numberOfDaysTillAug(monthDaysMap);
                    dayOfYear = monthDay + Integer.parseInt(strDate[2]);
                    break;
                case "10":
                    monthDay = numberOfDaysTillSep(monthDaysMap);
                    dayOfYear = monthDay + Integer.parseInt(strDate[2]);
                    break;
                case "11":
                    monthDay = numberOfDaysTillOct(monthDaysMap);
                    dayOfYear = monthDay + Integer.parseInt(strDate[2]);
                    break;
                case "12":
                    monthDay = numberOfDayTillNov(monthDaysMap);
                    dayOfYear = monthDay + Integer.parseInt(strDate[2]);
                    break;
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return dayOfYear;
    }

    private static Integer numberOfDaysTillJan(HashMap<String, Integer> monthDaysMap) {
        return monthDaysMap.get("01");
    }

    private static int numberOfDaysTillFeb(HashMap<String, Integer> monthDaysMap, String year) {
        return monthDaysMap.get("01") + monthDaysMap.get("02");
    }

    private static int numberOfDaysTillMar(HashMap<String, Integer> monthDaysMap) {
        return monthDaysMap.get("01") +
                monthDaysMap.get("02") +
                monthDaysMap.get("03");
    }

    private static int numberOfDaysTillApr(HashMap<String, Integer> monthDaysMap) {
        return monthDaysMap.get("01") +
                monthDaysMap.get("02") +
                monthDaysMap.get("03") +
                monthDaysMap.get("04");
    }

    private static int numberOfDaysTillMay(HashMap<String, Integer> monthDaysMap) {
        return monthDaysMap.get("01") +
                monthDaysMap.get("02") +
                monthDaysMap.get("03") +
                monthDaysMap.get("04") +
                monthDaysMap.get("05");
    }

    private static int numberOfDaysTillJun(HashMap<String, Integer> monthDaysMap) {
        return monthDaysMap.get("01") +
                monthDaysMap.get("02") +
                monthDaysMap.get("03") +
                monthDaysMap.get("04") +
                monthDaysMap.get("05") +
                monthDaysMap.get("06");
    }

    private static int numberOfDaysTillJul(HashMap<String, Integer> monthDaysMap) {
        return monthDaysMap.get("01") +
                monthDaysMap.get("02") +
                monthDaysMap.get("03") +
                monthDaysMap.get("04") +
                monthDaysMap.get("05") +
                monthDaysMap.get("06") +
                monthDaysMap.get("07");
    }

    private static int numberOfDaysTillAug(HashMap<String, Integer> monthDaysMap) {
        return monthDaysMap.get("01") +
                monthDaysMap.get("02") +
                monthDaysMap.get("03") +
                monthDaysMap.get("04") +
                monthDaysMap.get("05") +
                monthDaysMap.get("06") +
                monthDaysMap.get("07") +
                monthDaysMap.get("08");
    }

    private static int numberOfDaysTillSep(HashMap<String, Integer> monthDaysMap) {
        return monthDaysMap.get("01") +
                monthDaysMap.get("02") +
                monthDaysMap.get("03") +
                monthDaysMap.get("04") +
                monthDaysMap.get("05") +
                monthDaysMap.get("06") +
                monthDaysMap.get("07") +
                monthDaysMap.get("08") +
                monthDaysMap.get("09");
    }

    private static int numberOfDaysTillOct(HashMap<String, Integer> monthDaysMap) {
        return monthDaysMap.get("01") +
                monthDaysMap.get("02") +
                monthDaysMap.get("03") +
                monthDaysMap.get("04") +
                monthDaysMap.get("05") +
                monthDaysMap.get("06") +
                monthDaysMap.get("07") +
                monthDaysMap.get("08") +
                monthDaysMap.get("09") +
                monthDaysMap.get("10");
    }

    private static int numberOfDayTillNov(HashMap<String, Integer> monthDaysMap) {
        return monthDaysMap.get("01") +
                monthDaysMap.get("02") +
                monthDaysMap.get("03") +
                monthDaysMap.get("04") +
                monthDaysMap.get("05") +
                monthDaysMap.get("06") +
                monthDaysMap.get("07") +
                monthDaysMap.get("08") +
                monthDaysMap.get("09") +
                monthDaysMap.get("10") +
                monthDaysMap.get("11");
    }

    private static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }
}
