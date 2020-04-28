package com.bl.maxNum;

import org.junit.Assert;
import org.junit.Test;

public class MaximumNumberTest {

    MaximumNumber maximumNumber = new MaximumNumber();

    @Test
    public void givenThreeIntegers_findMaximum_atFirstPosition() {
        Comparable maximum=maximumNumber.findMaximum(30,20,10);
        Assert.assertEquals(30,maximum);
    }

    @Test
    public void givenThreeIntegers_findMaximum_atSecondPosition() {
        Comparable maximum=maximumNumber.findMaximum(10,30,20);
        Assert.assertEquals(30,maximum);
    }

    @Test
    public void givenThreeIntegers_findMaximum_atThirdPosition() {
        Comparable maximum=maximumNumber.findMaximum(10,20,30);
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
    public void givenThreeInteger_shouldReturnMaximumInteger() {
        Comparable maximumValue = maximumNumber.findMaximum(10,20,30,40,50);
        Assert.assertEquals(50,maximumValue);
    }

    @Test
    public void givenThreeFloat_shouldReturnMaximumFloat() {
        Comparable maximumValue = maximumNumber.findMaximum(10.1,20.1,30.1,40.1,50.1);
        Assert.assertEquals(50.1, maximumValue);
    }

    @Test
    public void givenThreeString_shouldReturnMaximumString() {
        Comparable maximumValue = maximumNumber.findMaximum("BridgeLabz","Accenture","Capgiminai","Expleo");
        Assert.assertEquals("Expleo", maximumValue);
    }
}