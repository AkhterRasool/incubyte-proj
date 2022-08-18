package com.incubyte;

public class LeapYearService {
    public boolean isLeapYear(int year) {
        if (isDivisibleBy100AndNotBy400(year)) {
            return false;
        }
        return isDivisibleBy4Only(year) || year % 400 == 0;
    }

    private boolean isDivisibleBy4Only(int year) {
        return year % 4 == 0;
    }

    private boolean isDivisibleBy100AndNotBy400(int year) {
        return year % 100 == 0 && year % 400 != 0;
    }
}
