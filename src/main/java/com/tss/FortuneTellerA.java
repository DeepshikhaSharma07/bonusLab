package com.tss;

import java.util.Scanner;

public class FortuneTellerA {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to FORTUNE TELLER! Let's see what's there in your future");
        System.out.println("In order for me to calculate your fortunes, I'll need some information!");

/*
Part 1
Ask the user for the user’s first name.
Ask the user for the user’s last name.
Ask the user for the user’s age.
Ask the user for the user’s birth month (as an ‘int’).
Ask the user for the user’s favorite ROYGBIV color.
If the user does not know what ROYGBIV is, ask the user to enter to get a list of the ROYGBIV colors.
Ask the user for the user’s number of siblings.
 */
        System.out.println("What is your first name?");
        String firstName = input.next();
        if (firstName.toLowerCase().equals("quit")) {
            System.out.println("Thanks for your time.");
            System.exit(0);
        }

        System.out.println("What is your last name?");
        String lastName = input.next();
        if (lastName.toLowerCase().equals("quit")) {
            System.out.println("Nobody likes a quitter.");
            System.exit(0);
        }

        System.out.println("What is your age?");
        String numberAge = input.next();
        if (numberAge.toLowerCase().equals("quit")) {
            System.out.println("Nobody likes a quitter.");
            System.exit(0);
        }
        int foo = Integer.parseInt(numberAge);

        System.out.println("What is your birth month? (1-12)");
        String birthMonth = input.next().toLowerCase();
        if (birthMonth.toLowerCase().equals("quit")) {
            System.out.println("Nobody likes a quitter.");
            System.exit(0);
        }
        int birth = Integer.parseInt(birthMonth);

        System.out.println("What is your favorite ROYGBIV color? Unsure what ROYGBIV is? Type Help!");
        String favoriteColor = input.next().toLowerCase();

        String needHelp = "";
        while (favoriteColor.toLowerCase().equals("help")) {
            needHelp = "Red, Orange, Yellow, Green, Blue, Indigo, Violet";
            System.out.println(needHelp);

            favoriteColor = input.next();

        }

        System.out.println("How many siblings do you have?");
        String numberSibling = input.next().toLowerCase();
        if (numberSibling.toLowerCase().equals("quit")) {
            System.out.println("Nobody likes a quitter.");
            System.exit(0);
        }
        int sibling = Integer.parseInt(numberSibling);

//Part 2
        String yearsRetirement = "";
        System.out.println("Years until retirement:");
        if (foo % 2 == 0) {
            yearsRetirement = "10";
        } else {
            yearsRetirement = "15";
        }
        System.out.println(yearsRetirement);

        String vacationLocation = "";
        System.out.println("Vacation Home Location:");
        if (sibling == 0) {
            vacationLocation = "Boca Raton, FL";
        } else if(sibling < 0) {
            vacationLocation = " Chernobyl, Ukraine";
        }
        else if (sibling == 1) {
            vacationLocation = "Nassau, Bahamas";
        } else if (sibling == 2) {
            vacationLocation = "Ponta Negra, Brazil";
        } else if (sibling == 3) {
            vacationLocation = "Portland, Oregon";
        } else if (sibling > 3) {
            vacationLocation = "Baton Rouge, LA";
        }

        System.out.println(vacationLocation);

        String transportationMode = "";
        System.out.println("Mode of transportation:");
        if (favoriteColor.equals("red")) {
            transportationMode = "Maserati";
        } else if (favoriteColor.equals("orange")) {
            transportationMode = "stallion";
        } else if (favoriteColor.equals("yellow")) {
            transportationMode = "chariot";
        } else if (favoriteColor.equals("green")) {
            transportationMode = "taxi";
        } else if (favoriteColor.equals("blue")) {
            transportationMode = "rickshaw";
        } else if (favoriteColor.equals("indigo")) {
            transportationMode = "motor scooter";
        } else if (favoriteColor.equals("violet")) {
            transportationMode = "flying saucer";
        }
        System.out.println(transportationMode);


        String bankBalance = "";
        if ((birth == 1) || (birth == 2) || (birth == 3) || (birth == 4) ) {
            bankBalance = "$256,000.76";
        } else if ( (birth >= 5) && (birth <= 8)) {
            bankBalance = "$3,687,105.42";
        } else if ((birth >= 9) && (birth <= 12)) {
            bankBalance = "$86.23";
        }
          else if ((birth > 12) || (birth < 1)) {
            bankBalance = "$0.00";
        }


        System.out.println(bankBalance);

//Part 3
        String myOutput = firstName + " " + lastName + " will retire in " + yearsRetirement + " years with "
                + bankBalance + " in the bank, a vacation home in " + vacationLocation + " and travel by "
                + transportationMode + ".";
        System.out.println(myOutput);

        input.close();


    }

}
