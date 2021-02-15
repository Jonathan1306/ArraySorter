package com.company;

import java.util.*;


public class Main {


    public static void main(String[] args) {
        int[] myArray = getIntegers(5);
        printArray(myArray);
        printArray(sortArray(myArray));
    }

    public static int[] getIntegers(int size){
        int[] arrayOfInt = new int[size];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < arrayOfInt.length; i++){
            arrayOfInt[i] = scanner.nextInt();
        }
        return arrayOfInt;
    }
    public static void printArray(int[] myArray){
        for(int i = 0; i < myArray.length; i++){
            System.out.print(myArray[i]);
        }
    }

    public static int[] sortArray(int[] myArray){
        int[] mySortedArray = new int[myArray.length];
        for(int i = 0; i<mySortedArray.length; i++){
            mySortedArray[i] = myArray[i];
        }
        int nextNumber = 0;
        boolean flag = true;

        while(flag) {
            flag = false;
            for (int i = 0; i < mySortedArray.length - 1; i++) {
                if (mySortedArray[i] < mySortedArray[i + 1]) {
                    nextNumber = mySortedArray[i];
                    mySortedArray[i] = mySortedArray[i + 1];
                    mySortedArray[i + 1] = nextNumber;
                    flag = true;
                }
            }
        }


        return mySortedArray;
    }
}
