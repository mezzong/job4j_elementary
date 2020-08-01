
package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MultiMaxTest {
    @Test
    public void whenFirstMax() {
        int result = MultiMax.max(3, 2, 1);
        assertThat(result, is(3));
    }

    @Test
    public void whenSecondMax() {
        int result = MultiMax.max(1, 3, 2);
        assertThat(result, is(3));
    }

    @Test
    public void whenThirdMax() {
        int result = MultiMax.max(1, 2, 3);
        assertThat(result, is(3));
    }

    @Test
    public void whenAllEquals() {
        int result = MultiMax.max(3, 3, 3);
        assertThat(result, is(3));
    }
}