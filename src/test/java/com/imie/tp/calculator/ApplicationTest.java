package com.imie.tp.calculator;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.imie.tp.calculator.operation.AdditionOperation;

public class ApplicationTest {

    private AdditionOperation add;

    @Before
    public void setUp() throws Exception {
        this.add = new AdditionOperation(10);
    }


    @Test
    public void testMake() {
        this.add.make(2);

        Assert.assertNotNull(this.add);
        Assert.assertEquals(12, this.add.currentValue, 0);
    }

    @Test
    public void testGetValue() {
        Assert.assertNotNull(this.add);
        Assert.assertEquals(10, this.add.getCurrentValue(), 0);
    }

}
