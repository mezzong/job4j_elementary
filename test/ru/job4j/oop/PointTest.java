package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void when123456then2() {
        int x1 = 1;
        int y1 = 2;
        int z1 = 3;
        int x2 = 4;
        int y2 = 5;
        int z2 = 6;
        double expected = 5.2;
        Point point1 = new Point(x1, y1, z1);
        Point point2 = new Point(x2, y2, z2);
        double result = point1.distance3d(point2);
        Assert.assertEquals(expected, result, 0.01);
    }
}