// Class:			Data Structures W02
// Term:			Summer 2022
// Name:			Michael Adams
// Program Number:	3
// IDE: 			Visual Studio Code 1.68.1

import java.util.Scanner;

public class TestStackMichaelAdams {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Holds sentinel value
        int userInput;

        // Creates Stack
        MyStackMichaelAdams<String> stack = new MyStackMichaelAdams<>();

        do {
            // Menu options
            System.out.println("-----MAIN MENU-----");
            System.out.println("0 - Exit Program");
            System.out.println("1 – Push");
            System.out.println("2 - Pop");
            System.out.println("3 – Peek (Top)");
            System.out.println("4 - Size");
            System.out.println("5 – Is Empty?");
            System.out.println("6 – Print Stack");
            System.out.println("Choose menu:");

            // User input will be next number entered
            userInput = input.nextInt();

            switch (userInput) {

                // Allows user to enter a string and pushes its content to top of stack
                case 1:
                    System.out.println("Enter element to push");
                    String inputtedElement = input.next();
                    stack.push(inputtedElement);
                    break;

                // Removes and returns top element in stack
                case 2:
                    System.out.println(stack.pop());

                    // Returns top element of stack
                case 3:
                    System.out.println(stack.peek());

                    // Returns size of stack
                case 4:
                    System.out.println(stack.size());

                    // Is the stack empty?
                case 5:
                    if (stack.isEmpty()) {
                        System.out.println("The stack is empty.");
                    } else {
                        System.out.println("The stack is not empty.");
                    }

                    // Prints contents of stack
                case 6:
                    System.out.println(stack.toString());

                default:
                    break;
            }

            // User will enter 0 when they want to exit the program
        } while (userInput != 0);
        input.close();
    }

}
