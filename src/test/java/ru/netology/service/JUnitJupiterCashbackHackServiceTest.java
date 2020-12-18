package ru.netology.service;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JUnitJupiterCashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Nested
    class AmountLowerThan1000 {

        @Test
        void shouldCalculateRemainForAmountIs400() {
            int actual = service.remain(400);
            int expected = 600;
            assertEquals(expected, actual);
        }

        @Test
        void shouldCalculateRemainForAmountIs999() {
            int actual = service.remain(999);
            int expected = 1;
            assertEquals(expected, actual);
        }
    }

    @Nested
    class AmountIs1000 {

        @Test
        void shouldCalculateRemainForAmountIs1000() {
            int actual = service.remain(1000);
            int expected = 0;
            assertEquals(expected, actual);
        }
    }

    @Nested
    class AmountHigherThan1000 {
        @Test
        void shouldCalculateRemainForAmountIs1001() {
            int actual = service.remain(1001);
            int expected = 999;
            assertEquals(expected, actual);
        }

        @Test
        void shouldCalculateRemainForAmountIs1600() {
            int actual = service.remain(1600);
            int expected = 400;
            assertEquals(expected, actual);
        }
    }
}