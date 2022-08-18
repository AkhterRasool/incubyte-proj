package com.incubyte;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.AssertTrue.assertTrue;

public class LeapYearServiceTest {

    private LeapYearService subject = new LeapYearService();

    @Test
    void yearShouldBeLeapYearWhenDivisibleBy400() {
        assertTrue(subject.isLeapYear(400));
    }
}
