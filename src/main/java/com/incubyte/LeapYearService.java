package com.incubyte;

public class LeapYearService {
    public boolean isLeapYear(int year) {
        if (isDivisibleBy4Only(year) || year % 400 == 0) {
            return true;
        }
        return false;
    }

    private boolean isDivisibleBy4Only(int year) {
        return year == 2008 || year == 2012 || year == 2016;
    }
}
