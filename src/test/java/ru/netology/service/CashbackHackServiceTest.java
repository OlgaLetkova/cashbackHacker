package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldCalculateRemainForAmountLowerThan1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(400);
        int expected = 600;
        assertEquals(actual,expected);
    }

    @Test
    public void shouldCalculateRemainForAmountIs1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual,expected);
    }

    @Test
    public void shouldCalculateRemainForAmountHigher1000() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1600);
        int expected = 400;
        assertEquals(actual,expected);
    }

    @Test
    public void shouldCalculateRemainForAmountIs999() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(999);
        int expected = 1;
        assertEquals(actual,expected);
    }

    @Test
    public void shouldCalculateRemainForAmountIs1001() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1001);
        int expected = 999;
        assertEquals(actual,expected);
    }
}