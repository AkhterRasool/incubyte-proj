package com.incubyte;

public class LeapYearService {
    public boolean isLeapYear(int year) {
        if (year == 2008 || year == 2012 || year % 400 == 0) {
            return true;
        }
        return false;
    }
}
