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
    //
//    public float findMaximum(Float firstNumber,Float secondNumber,Float thirdNumber) {
//
//        if (firstNumber.compareTo(secondNumber) >= 0 && firstNumber.compareTo(thirdNumber) >= 0) {
//            return firstNumber;
//        }
//        else if (secondNumber.compareTo(firstNumber) >= 0 && secondNumber.compareTo(thirdNumber) >= 0) {
//            return secondNumber;
//        }
//        else {
//            return thirdNumber;
//        }
//    }
//
//    public String findMaximum(String firstWord,String secondWord,String thirdWord) {
//
//        if (firstWord.compareTo(secondWord) >= 0 && firstWord.compareTo(thirdWord) >= 0) {
//            return firstWord;
//        }
//        else if (secondWord.compareTo(firstWord) >= 0 && secondWord.compareTo(thirdWord) >= 0) {
//            return secondWord;
//        }
//        else {
//            return thirdWord;
//        }
//    }
//}
