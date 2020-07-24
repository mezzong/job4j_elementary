package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void whenManHeight187() {
        double height = 187;
        double expected = 100.05;
        double result = Fit.manWeight(height);
        Assert.assertEquals(expected, result, 0.01);
    }

    @Test
    public void whenWomanHeight160() {
        double height = 160;
        double excepted = 57.49;
        double result = Fit.womanWeight(height);
        Assert.assertEquals(excepted, result, 0.01);

    }
}