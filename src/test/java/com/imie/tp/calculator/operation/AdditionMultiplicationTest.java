package com.imie.tp.calculator.operation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.imie.tp.calculator.operation.MultiplicationOperation;

public class AdditionMultiplicationTest {

    private MultiplicationOperation mult;

    @Before
    public void setUp() throws Exception {
        this.mult = new MultiplicationOperation(10);
    }


    @Test
    public void testMake() {
        this.mult.make(2);

        Assert.assertNotNull(this.mult);
        Assert.assertEquals(20, this.mult.currentValue, 0);
    }

    @Test
    public void testGetValue() {
        Assert.assertNotNull(this.mult);
        Assert.assertEquals(10, this.mult.getCurrentValue(), 0);
    }

}
