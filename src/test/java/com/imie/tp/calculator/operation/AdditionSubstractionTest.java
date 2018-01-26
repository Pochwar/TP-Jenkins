package com.imie.tp.calculator.operation;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.imie.tp.calculator.operation.SubstractionOperation;

public class AdditionSubstractionTest {

    private SubstractionOperation sub;

    @Before
    public void setUp() throws Exception {
        this.sub = new SubstractionOperation(10);
    }


    @Test
    public void testMake() {
        this.sub.make(2);

        Assert.assertNotNull(this.sub);
        Assert.assertEquals(8, this.sub.currentValue, 0);
    }

    @Test
    public void testGetValue() {
        Assert.assertNotNull(this.sub);
        Assert.assertEquals(10, this.sub.getCurrentValue(), 0);
    }

}
