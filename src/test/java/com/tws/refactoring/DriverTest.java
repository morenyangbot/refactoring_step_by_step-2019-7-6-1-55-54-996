package com.tws.refactoring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DriverTest {

    private static Driver driver;

    @BeforeEach
    public void init() {
        driver = new Driver();
    }

    @Test
    void should_return_true_when_driver_age_more_than_18() {
        driver.setAge(20);
        boolean result = driver.isLegalDriver();
        Assertions.assertTrue(result);
    }

    @Test
    void should_return_true_when_driver_age_is_18() {
        driver.setAge(18);
        boolean result = driver.isLegalDriver();
        Assertions.assertTrue(result);
    }

    @Test
    void should_return_true_when_driver_age_less_than_18() {
        driver.setAge(17);
        boolean result = driver.isLegalDriver();
        Assertions.assertFalse(result);
    }
}