package it.develhope.arraysAndLists;

import java.util.Arrays;

public class Start {
    public static void main(String[] args) {

        System.out.println("----------Creating the arrays----------------");

        String[] aliceToDos = new String[]{"Coding", "Reading", "Learning"};
        System.out.println("These are Alice's tasks: " + Arrays.toString(aliceToDos));

        String[] bobToDos = new String[]{"Reading", "Coding", "Learning", "Sleeping"};
        System.out.println("These are Bob's tasks: " + Arrays.toString(bobToDos));

        String[] timToDos = new String[]{"Reading", "Learning", "Coding"};
        System.out.println("And finally, Tim's tasks: " + Arrays.toString(timToDos));

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



