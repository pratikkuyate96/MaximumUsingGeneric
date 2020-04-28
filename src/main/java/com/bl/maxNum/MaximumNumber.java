package com.bl.maxNum;

import java.util.Arrays;

public class MaximumNumber<E extends Comparable<E>> {

    private E firstValue;
    private E secondValue;
    private E thirdValue;

    public MaximumNumber() {

    }

    public E findMaximum() {
        return findMaximum(firstValue, secondValue, thirdValue);
    }

    public static <V extends Comparable<V>> V findMaximum(V... valuesArray) {

        Arrays.sort(valuesArray);
        V maximumValue = valuesArray[valuesArray.length-1];
        printMaximumValue(maximumValue);
        return valuesArray[valuesArray.length-1];
    }

    private static <E> void printMaximumValue(E maximumValue) {
        System.out.println("Maximum value: " + maximumValue);
    }
}