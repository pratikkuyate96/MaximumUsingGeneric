package com.bl.maxNum;

import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest {
    MaximumNumber maximumNumber = new MaximumNumber();

    @Test
    public void givenThreeIntegers_findMaximum_atFirstPosition() {
        Comparable maximum=maximumNumber.findMaximum(30,30,10);
        Assert.assertEquals(30,maximum);
    }

    @Test
    public void givenThreeIntegers_findMaximum_atSecondPosition() {
        Comparable maximum=maximumNumber.findMaximum(10,30,20);
        Assert.assertEquals(30,maximum);
    }

    @Test
    public void givenThreeIntegers_findMaximum_atThirdPosition() {
        Comparable maximum =maximumNumber.findMaximum(10,20,30);
        Assert.assertEquals(30,maximum);
    }
}
