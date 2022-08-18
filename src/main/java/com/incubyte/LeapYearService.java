package com.incubyte;

public class LeapYearService {

    public boolean isLeapYear(int year) {
        if (year < 0) {
            throw new IllegalArgumentException("A year cannot be negative: " + year + ". Did you mean " + Math.abs(year) + "?");
        }
        if (isDivisibleBy100AndNotBy400(year)) {
            return false;
        }
        return isDivisible(year, 4) || isDivisible(year, 400);
    }

    private boolean isDivisibleBy100AndNotBy400(int year) {
        return isDivisible(year, 100) && isNotDivisible(year, 400);
    }

    private boolean isDivisible(int dividend, int divisor) {
        return dividend % divisor == 0;
    }

    private boolean isNotDivisible(int dividend, int divisor) {
        return !isDivisible(dividend, divisor);
    }
}
