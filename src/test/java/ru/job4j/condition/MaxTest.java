package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1to2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void when2to1Then2() {
        int result = Max.max(2, 1);
        assertThat(result, is(2));
    }

    @Test
    public void whenMax1to1Then1() {
        int result = Max.max(1, 1);
        assertThat(result, is(1));
    }

    @Test
    public void whenMax1to3Then3() {
        int result = Max.max(1, 2, 3);
        assertThat(result, is(3));
    }

    @Test
    public void when3to1Then3() {
        int result = Max.max(3, 2, 1);
        assertThat(result, is(3));
    }

    @Test
    public void whenMax111Then1() {
        int result = Max.max(1, 1, 1);
        assertThat(result, is(1));
    }

    @Test
    public void whenMax1to4Then4() {
        int result = Max.max(1, 2, 3, 4);
        assertThat(result, is(4));
    }

    @Test
    public void when4to1Then4() {
        int result = Max.max(4, 3, 2, 1);
        assertThat(result, is(4));
    }

    @Test
    public void whenMax1111Then1() {
        int result = Max.max(1, 1, 1, 1);
        assertThat(result, is(1));
    }
}