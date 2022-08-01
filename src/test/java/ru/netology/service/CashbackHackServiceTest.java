package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;
@Test
public class CashbackHackServiceTest {
    public void remain (){
        CashbackHackService service =  new CashbackHackService();
        int actual = service.remain(900);
        int expected = 100;
        assertEquals(actual,expected);
    }

    @Test
    public void calcRemainIfAmount0(){
        CashbackHackService service =  new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual,expected);

    }



}