package AssignmentOne;
// Class:			Data Structures W02
// Term:			Summer 2022
// Name:			Michael Adams
// Program Number:	1
// IDE: 			Visual Studio Code 1.67.2

import java.util.Scanner;
public class PrintReverseMichaelAdams {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Will continue looping program until user enters "N"
        String tryAgain;
        do {

            // Outputs user entered string
            System.out.println("Entered string:\t\t\t\t");
            // User inputs string
            String str = input.nextLine();

            // Reverse string
            String strReversed = printCharsReverse(str);
            // Print reversed string
            System.out.println("Reversed string:\t\t\t" + strReversed);

            // Ask user to try again
            System.out.println("Try again(Y/N):\t\t\t");
            tryAgain = input.nextLine();
        } while(tryAgain.equalsIgnoreCase("Y"));

        input.close();
    }

    // Print Characters Reversed method
    public static String printCharsReverse(String str) {

        // base case, if string is empty then return the string because it cannot be reversed
        if (str.isEmpty()) {
            return str;
        }

        // returns a substring with the string's first character to the printCharsReverse() method
        return printCharsReverse(str.substring(1)) + str.charAt(0);
    }
}
