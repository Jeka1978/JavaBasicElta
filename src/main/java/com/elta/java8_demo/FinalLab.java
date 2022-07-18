package com.elta.java8_demo;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/**
 * @author Evgeny Borisov
 */
public class FinalLab {


    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate localDate = now.minusDays(10);
        long between = ChronoUnit.DAYS.between(localDate, now);
        System.out.println(now.getDayOfWeek().getDisplayName(TextStyle.SHORT, Locale.CANADA_FRENCH));
        System.out.println("between = " + between);
    }

    public void printBlackFriday(int startYear, int endYear) {
        LocalDate now = LocalDate.now();

        //example  1900,1920
        // [1904:3,1909:3,1911:3,1901:2,1907:2,1910:1...]
    }
}
