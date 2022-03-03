package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayList<Integer> randNumbers = new ArrayList<>();
        fillArrayListWithRandomNumbers(randNumbers);

        ArrayList<Integer> oddNumbers = new ArrayList<>();
        arrayListWithOddNumbers(oddNumbers, randNumbers);

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        arrayListWithEvenNumbers(evenNumbers, randNumbers);

        printElementsOfArrayList(randNumbers, oddNumbers, evenNumbers);

    }
    public static void printElementsOfArrayList (ArrayList<Integer> randNumbers,
                                                 ArrayList<Integer> oddNumbers,
                                                 ArrayList<Integer> evenNumbers) {
        int counterOdd = 1, counterEven = 1, counterAll = 1;

        for(int i: randNumbers) {
            System.out.println(counterAll + " number: " + i);
            counterAll++;
        }

        System.out.println("---------------------------------------------------");

        for (int i : oddNumbers) {
            System.out.println(counterOdd + " number: " + i + " ");
            counterOdd++;
        }

        System.out.println("---------------------------------------------------");

        for (int i : evenNumbers) {
            System.out.println(counterEven + " number: " + i);
            counterEven++;
        }
    }

    public static void arrayListWithEvenNumbers(ArrayList<Integer> evenNumbers, ArrayList<Integer> randNumbers) {
        int counter = 0;
        for(int i: randNumbers) {
            if(i % 2 == 1) {
                evenNumbers.add(counter, i);
                counter++;
            }
        }
    }

    public static void arrayListWithOddNumbers(ArrayList<Integer> oddNumbers, ArrayList<Integer> randNumbers) {
        int counter = 0;
        for(int i: randNumbers) {
            if(i % 2 == 0) {
                oddNumbers.add(counter, i);
                counter++;
            }
        }
    }

    public static void fillArrayListWithRandomNumbers(ArrayList<Integer> numbers) {
        Random random = new Random();
        for(int i = 0; i < 50; i++) {
            numbers.add(i, random.nextInt(1,100));
        }
    }

}
