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


    @Test
    public void givenThreeFloat_findMaximum_atFirstPosition() {
        Comparable maximum=maximumNumber.findMaximum(30.1f,20.1f,10.2f);
        Assert.assertEquals(30.1f,maximum);
    }

    @Test
    public void givenThreeFloat_findMaximum_atSecondPosition() {
        Comparable maximum=maximumNumber.findMaximum(10.2f,30.1f,20.1f);
        Assert.assertEquals(30.1f,maximum);
    }
    
    @Test
    public void givenThreeFloat_findMaximum_atThirdPosition() {
        Comparable maximum =maximumNumber.findMaximum(10.1f,20.1f,30.1f);
        Assert.assertEquals(30.1f,maximum);
    }
}