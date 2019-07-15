package com.tws.refactoring;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PoliceTest {
    @Test
    void should_return_true_when_driver_age_more_than_18() {
        Driver driver = new Driver(20);
        Police police = new Police();

        boolean result = police.checkDriver(driver);
        Assertions.assertTrue(result);
    }
    @Test
    void should_return_true_when_driver_age_is_18() {
        Driver driver = new Driver(18);
        Police police = new Police();

        boolean result = police.checkDriver(driver);
        Assertions.assertTrue(result);
    }
    @Test
    void should_return_true_when_driver_age_less_than_18() {
        Driver driver = new Driver(17);
        Police police = new Police();

        boolean result = police.checkDriver(driver);
        Assertions.assertFalse(result);
    }
}