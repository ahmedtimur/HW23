package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayList<Integer> randNumbers = new ArrayList<>();
        fillArrayListWithRandomNumbers(randNumbers);
        printAllRandomArrayListElements(randNumbers);

        System.out.println("---------------------------------------------------");

        ArrayList<Integer> oddNumbers = new ArrayList<>();
        arrayListWithOddNumbers(oddNumbers, randNumbers);
        oddNumbersPrintAllElements(oddNumbers);

        System.out.println("---------------------------------------------------");

        ArrayList<Integer> evenNumbers = new ArrayList<>();
        arrayListWithEvenNumbers(evenNumbers, randNumbers);
        printAllEvenNumbersArrayList(evenNumbers);


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

    public static void printAllRandomArrayListElements(ArrayList<Integer> randNumbers) {
        int counter = 1;
        for(int i: randNumbers) {
            System.out.println(counter + " number: " + i);
            counter++;
        }
    }

    public static void oddNumbersPrintAllElements(ArrayList<Integer> oddNumbers) {
        int counter = 1;
        for(int i: oddNumbers) {
            System.out.println(counter + " number: " + i + " ");
            counter++;
        }
    }

    public static void printAllEvenNumbersArrayList(ArrayList<Integer> evenNumbers) {
        int counter = 1;
        for(int i: evenNumbers) {
            System.out.println(counter + " number: " + i);
            counter++;
        }
    }
}
