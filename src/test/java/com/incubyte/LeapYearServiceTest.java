package com.incubyte;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearServiceTest {

    private LeapYearService subject = new LeapYearService();

    @Test
    void yearShouldBeLeapYearWhenDivisibleBy400() {
        assertTrue(subject.isLeapYear(2000));
    }


    @Test
    void yearShouldNotBeLeapYearIfDivisibleBy100AndNotBy400() {
        assertFalse(subject.isLeapYear(1800));
        assertFalse(subject.isLeapYear(1700));
        assertFalse(subject.isLeapYear(1900));
        assertFalse(subject.isLeapYear(2100));
    }


    @Test
    void yearShouldBeLeapYearIfDivisibleBy4ButNotBy100() {
        assertTrue(subject.isLeapYear(2008));
        assertTrue(subject.isLeapYear(2012));
        assertTrue(subject.isLeapYear(2016));
    }
}
