package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when0020then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2.0;
        Point point1 = new Point(x1, y1);
        Point point2 = new Point(x2, y2);
        double result = point1.distance(point2);
        Assert.assertEquals(expected, result, 0.01);
    }
}