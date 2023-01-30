package it.develhope.arraysAndLists;

import java.util.Arrays;

public class Start {
    public static void main(String[] args) {

        System.out.println("----------Creating the arrays----------------");

        String[] aliceToDos = new String[]{"Coding", "Reading", "Learning"};
        System.out.println(Arrays.toString(aliceToDos));

        String[] bobToDos = new String[]{"Reading", "Coding", "Learning", "Sleeping"};
        System.out.println(Arrays.toString(bobToDos));

        String[] timToDos = new String[]{"Reading", "Learning", "Coding"};
        System.out.println(Arrays.toString(timToDos));

        System.out.println("-------Comparing the arrays' properties--------");

        System.out.println("Is Alice's array equal to Bob's? " + Arrays.equals(aliceToDos, bobToDos));
        System.out.println("Is Alice's array equal to Tim's? " + Arrays.equals(aliceToDos, timToDos));
        System.out.println("Is Alice's array as long as Bob's? " + (aliceToDos.length == bobToDos.length));
        System.out.println("Is Alice's array as long as Tim's? " + (aliceToDos.length == timToDos.length));

        Arrays.sort(aliceToDos);
        Arrays.sort(bobToDos);
        Arrays.sort(timToDos);

        System.out.print("Is Alice having the same tasks of Bob? ");

        if (Arrays.compare(aliceToDos, bobToDos) == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");}

        System.out.print("Is Alice having the same tasks of Tim? ");

        if (Arrays.compare(aliceToDos, timToDos) == 0) {
            System.out.println("True");
        } else {
            System.out.println("False");}

        System.out.println("-------------------------------------------------");

        }
    }



/*
define a testing class with a main() method where you:
define 3 arrays of strings called aliceToDos, bobToDos and timToDos
aliceToDos has the following tasks in this order: Coding, Reading and Learning
bobToDos has the following tasks in this order: Reading, Coding, Learning and Sleeping
timToDos has the following tasks in this order: Reading, Learning and Coding
you print in console - using the right java.util.Arrays methods and array's attribute - the answers of the following questions:
Is Alice's array equal to Bob array? - use a specific method from java.util.Arrays
Is Alice's array equal to Tim array? - use a specific method from java.util.Arrays
Is Alice's array having the same length of Bob's array? - use a specific attribute of the array
Is Alice's array having the same length of Tim's array? - use a specific attribute of the array
Is Alice having the same tasks of Bob? - use 2 specific methods from java.util.Arrays
Is Alice having the same tasks of Tim? - use 2 specific methods from java.util.Arrays
 */