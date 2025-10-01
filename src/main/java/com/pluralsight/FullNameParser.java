package com.pluralsight;

import java.util.Arrays;
import java.util.Scanner;

public class FullNameParser {

    //create the scanner to capture user input
    public static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {

        //ask the user for the full name using our askQuestion method
        String fullName = askQuestion("Please enter your name: ");

       // Dana L. Wyatt
        //break the name into pieces
        String[] namePieces = fullName.split(" ");

        switch (namePieces.length){
            case 2:
                System.out.println("First Name: " + namePieces[0]);
                System.out.println("Middle Name: (None)");
                System.out.println("Last Name: " + namePieces[1]);
                break;
            case 3:
                System.out.println("First Name: " + namePieces[0]);
                System.out.println("Middle Name: " + namePieces[1]);
                System.out.println("Last Name: " + namePieces[2]);
                break;
            default:
                System.out.println("You provided an invalid name");
        }

        //print out the answer for now to test the above code
        System.out.println("The name provided was:" + fullName);

    }

    //here is a method that is really good at asking a question
    public static String askQuestion(String theQuestion){

        //ask the passed in question
        System.out.println(theQuestion);

        //store the answer
        String answer = myScanner.nextLine();

        //retrun the answer trimmed (white space removed from the right and left
        return answer.trim();

    }


}
