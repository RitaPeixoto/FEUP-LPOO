package com.aor.numbers;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class PositiveFilterTest {

    @Test
    public void acceptPositive() {
        PositiveFilter filter = new PositiveFilter();

        assertTrue(filter.accept(1));
    }

    @Test
    public void acceptNegative() {
        PositiveFilter filter = new PositiveFilter();

        assertFalse(filter.accept(-1));
    }

    @Test
    public void acceptZero() {
        PositiveFilter filter = new PositiveFilter();

        assertFalse(filter.accept(0));
    }
}