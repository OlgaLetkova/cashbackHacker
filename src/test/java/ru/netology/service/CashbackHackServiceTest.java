package ru.netology.service;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldCalculateRemainForAmountLowerThan1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(400);
        int expected = 600;
        assertEquals(expected,actual);
    }

    @Test
    public void shouldCalculateRemainForAmountIs1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(expected,actual);
    }

    @Test
    public void shouldCalculateRemainForAmountHigher1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1600);
        int expected = 400;
        assertEquals(expected,actual);
    }

    @Test
    public void shouldCalculateRemainForAmountIs999() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(999);
        int expected = 1;
        assertEquals(expected,actual);
    }

    @Test
    public void shouldCalculateRemainForAmountIs1001() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1001);
        int expected = 999;
        assertEquals(expected,actual);
    }
}