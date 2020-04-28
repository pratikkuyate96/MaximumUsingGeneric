package com.bl.maxNum;

import java.util.Arrays;

public class MaximumNumber<E extends Comparable<E>> {

    private E firstNumber;
    private E secondNumber;
    private E thirdNumber;

    public MaximumNumber() {

    }

    public E findMaximum() {
        return findMaximum(firstNumber, secondNumber, thirdNumber);
    }

    public static <E extends Comparable<E>> E findMaximum(E... valuesArray) {
        Arrays.sort(valuesArray);
        E maximumValue = valuesArray[valuesArray.length-1];
        printMaximumValue(maximumValue);
        return valuesArray[valuesArray.length-1];
    }

    private static <E> void printMaximumValue(E maximumValue) {
        System.out.println("Maximum value: " + maximumValue);
    }
}