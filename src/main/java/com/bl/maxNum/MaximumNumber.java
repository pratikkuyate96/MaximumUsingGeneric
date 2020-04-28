package com.bl.maxNum;

public class MaximumNumber {

    public int findMaximum(Integer firstNumber,Integer secondNumber,Integer thirdNumber) {

        if (firstNumber.compareTo(secondNumber) >= 0 && firstNumber.compareTo(thirdNumber) >= 0) {
            return firstNumber;
        }
        else if (secondNumber.compareTo(firstNumber) >= 0 && secondNumber.compareTo(thirdNumber) >= 0) {
            return secondNumber;
        }
        else {
            return thirdNumber;
        }
    }

    public float findMaximum(Float firstNumber,Float secondNumber,Float thirdNumber) {

        if (firstNumber.compareTo(secondNumber) >= 0 && firstNumber.compareTo(thirdNumber) >= 0) {
            return firstNumber;
        }
        else if (secondNumber.compareTo(firstNumber) >= 0 && secondNumber.compareTo(thirdNumber) >= 0) {
            return secondNumber;
        }
        else {
            return thirdNumber;
        }
    }
}
