package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumNumbersFromSixToTwentyThenSixtyThree() {
        int start = 6;
        int finish = 12;
        int result = Counter.sum(start, finish);
        int expected = 63;
        Assert.assertEquals(expected, result);
    }
}