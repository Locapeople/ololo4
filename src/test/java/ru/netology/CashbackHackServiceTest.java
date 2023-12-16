package ru.netology;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void remainOnZeroAmount() {
        CashbackHackService service = new CashbackHackService();

        int expected = 1000;
        int actual = service.remain(0);
        assertEquals(expected, actual);
    }

    @Test
    public void remainOnCommonAmount() {
        CashbackHackService service = new CashbackHackService();

        int expected = 555;
        int actual = service.remain(445);
        assertEquals(expected, actual);
    }

    @Test
    public void remainOnFullBoundaryAmount() {
        CashbackHackService service = new CashbackHackService();

        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(expected, actual);
    }
}