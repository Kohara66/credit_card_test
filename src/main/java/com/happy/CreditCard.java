package com.happy;

import java.util.Scanner;

/**
 * Created by we4954cp on 8/31/2016.
 */
public class CreditCard {

    static Scanner stringScanner = new Scanner(System.in);

    public static void main(String[] args) {

        //Ask user for credit card number. store number as a String.
        System.out.println("Please enter the credit card number, digits only:");
        String cardNumber = stringScanner.nextLine();
        boolean isValid = isValidCreditCard(cardNumber);

        if (isValid) {
            System.out.println("This seems to be a valid credit card number");
        } else {
            System.out.println("This is **not** a valid credit card number.");
        }

        stringScanner.close();
    }


    public static boolean isValidCreditCard(String cardNumber) {


        if (cardNumber.startsWith("4") && cardNumber.length() == 16) return true;
        else {
            return false;
        }

    }

}







