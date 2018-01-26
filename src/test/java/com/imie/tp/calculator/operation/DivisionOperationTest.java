package com.imie.tp.calculator.operation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.imie.tp.calculator.operation.DivisionOperation;

public class DivisionOperationTest {

    private DivisionOperation div;

    @Before
    public void setUp() throws Exception {
        this.div = new DivisionOperation(10);
    }


    @Test
    public void testMake() {
        this.div.make(2);

        Assert.assertNotNull(this.div);
        Assert.assertEquals(5, this.div.currentValue, 0);
    }

    @Test
    public void testMakeWithZero() {
        this.div.make(0);

        Assert.assertNotNull(this.div);
        Assert.assertEquals(Integer.MIN_VALUE, this.div.currentValue, 0);
    }

    @Test
    public void testGetValue() {
        Assert.assertNotNull(this.div);
        Assert.assertEquals(10, this.div.getCurrentValue(), 0);
    }

}
