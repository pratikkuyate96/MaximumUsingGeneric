package com.bl.maxNum;

import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest {
    MaximumNumber maximumNumber = new MaximumNumber();

    @Test
    public void givenThreeIntegers_findMaximum_atFirstPosition() {
        Assert.assertEquals(30,maximumNumber.findMaximum(30,30,10));
    }

    @Test
    public void givenThreeIntegers_findMaximum_atSecondPosition() {
        Assert.assertEquals(30,maximumNumber.findMaximum(10,30,20));
    }

    @Test
    public void givenThreeIntegers_findMaximum_atThirdPosition() {
        Assert.assertEquals(30,maximumNumber.findMaximum(10,20,30));
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

    @Test
    public void givenThreeString_findMaximum_atFirstPosition(){
        Comparable maximum=maximumNumber.findMaximum("BridgeLabz","Capgiminai","Accenture");
        Assert.assertEquals("Capgiminai",maximum);
    }

    @Test
    public void givenThreeString_findMaximum_atSecondPosition(){
        Comparable maximum=maximumNumber.findMaximum("BridgeLabz","Capgiminai","Accenture");
        Assert.assertEquals((String) "Capgiminai",maximum);
    }

    @Test
    public void givenThreeString_findMaximum_atThirdPosition(){
        Comparable maximum=maximumNumber.findMaximum("BridgeLabz","Accenture","Capgiminai");
        Assert.assertEquals((String) "Capgiminai",maximum);
    }

    @Test
    public void givenMoreThanThreeIntegers_shouldReturnMaximumInteger() {
        Comparable maximumValue = maximumNumber.findMaximum(5, 2, 3, 4, 1);
        Assert.assertEquals(5, maximumValue);
    }

    @Test
    public void givenMoreThanThreeFloats_shouldReturnMaximumFloat() {
        Comparable maximumValue = maximumNumber.findMaximum(5.1, 2.1, 3.1, 4.1, 1.1);
        Assert.assertEquals(5.1, maximumValue);
    }

    @Test
    public void givenMoreThanThreeStrings_shouldReturnMaximumString() {
        Comparable maximumValue = maximumNumber.findMaximum("apple", "banana", "peach", "mango", "watermelon");
        Assert.assertEquals("watermelon", maximumValue);
    }

}