package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void square() {
        int p = 6;
        int k = 2;
        double expected = 2;
        double result = SqArea.square(p, k);
        Assert.assertEquals(expected, result, 0.01);
    }
}