package com.mycompany.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class SqrtTest {
    private static final double DELTA = 0.0001;

    @Test
    public void testCalcPerfectSquare() {
        Sqrt sqrt = new Sqrt(9.0);
        assertEquals(3.0, sqrt.calc(), DELTA);
    }

    @Test
    public void testCalcNonPerfectSquare() {
        Sqrt sqrt = new Sqrt(2.0);
        assertEquals(1.4142, sqrt.calc(), DELTA);
    }

    @Test
    public void testCalcZero() {
        Sqrt sqrt = new Sqrt(0.0);
        assertEquals(0.0, sqrt.calc(), DELTA);
    }

    @Test
    public void testCalcVerySmallNumber() {
        Sqrt sqrt = new Sqrt(0.000001);
        assertEquals(0.001, sqrt.calc(), DELTA);
    }

    @Test
    public void testAverageSimple() {
        Sqrt sqrt = new Sqrt(0);
        assertEquals(3.0, sqrt.average(2.0, 4.0), DELTA);
    }

    @Test
    public void testAverageSameNumbers() {
        Sqrt sqrt = new Sqrt(0);
        assertEquals(5.0, sqrt.average(5.0, 5.0), DELTA);
    }

    @Test
    public void testGoodExactMatch() {
        Sqrt sqrt = new Sqrt(0);
        assertTrue(sqrt.good(2.0, 4.0));
    }

    @Test
    public void testConstructor() {
        Sqrt sqrt = new Sqrt(10.0);
        assertEquals(10.0, sqrt.arg, DELTA);
    }

    @Test
    public void testImprove() {
        Sqrt sqrt = new Sqrt(0);
        assertEquals(1.5, sqrt.improve(1.0, 2.0), DELTA);
    }

    @Test
    public void testIterOneStep() {
        Sqrt sqrt = new Sqrt(0);
        assertEquals(1.5, sqrt.iter(1.0, 2.25), DELTA);
    }
}
