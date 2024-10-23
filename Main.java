import java.util.*;

public class Main {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

//      1. Write a program that prints the numbers from 1 to 100 such that:
//      If the number is multiple of 3, you need to print "Fizz" instead of that number.
//
//      If the number is multiple of 5, you need to print "Buzz" instead of that number.
//
//      If the number is a multiple of both 3 and 5, you need to print "FizzBuzz" instead
//      of that number.

        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
                continue;
            }
            if (i % 3 == 0) {
                System.out.println("Fizz");
                continue;
            }
            if (i % 5 == 0) {
                System.out.println("Buzz");
                continue;
            }
            System.out.println(i);
        }

        System.out.println("------------------------------------------------");


//      2. Write a Java program to reverse a string.

        System.out.println("Please, enter a string to write its reverse: ");
        String sentence = input.nextLine();

        for (int i = sentence.length() - 1; i >= 0; i--)
            System.out.print(sentence.charAt(i));

        System.out.println("\n------------------------------------------------");


//      3. Write a program to find the factorial value of any number entered
//      through the keyboard.

        System.out.println("Please, enter a number to find its factorial: ");
        int num = input.nextInt();
        int factorialNum = num;

        for (int i = num; i > 1; i--) {
            factorialNum *= i-1;
        }
        System.out.println(factorialNum);

        System.out.println("------------------------------------------------");


//      4. Two numbers entered through the keyboard. Write a program to find
//      the value of one number raised to the power of another. (Do not use Java
//      built-in method)

        System.out.print("Please, enter the first number (base): ");
        int baseNum = input.nextInt();

        System.out.print("Please, enter the second number (power): ");
        int powerNum = input.nextInt();
        int result = baseNum;

        if (powerNum > 0) {
            for (int i = 2; i <= powerNum; i++)
                result *= baseNum;
            System.out.println("The result = " + result);
        }
        else System.out.println("The result = 1");

        System.out.println("------------------------------------------------");


//      5. Write a program that reads a set of integers, and then prints the sum
//      the even and odd integers.

         int num2 = 0, evenSum = 0, oddSum = 0;

         do {
             System.out.print("Please, enter a number or 0 to quit: ");
             num2 = input.nextInt();

             if (num2 % 2 == 0)
                 evenSum += num2;

             else oddSum += num2;
         } while (num2 != 0);

        System.out.println("\nThe sum of even numbers = " + evenSum
                + "\nThe sum of odd number = " + oddSum);

        System.out.println("------------------------------------------------");


//      6. Write a program that prompts the user to input a positive integer. It
//      should then output a message indicating whether the number is a prime number.

        System.out.print("Please, enter a positive number: ");
        int prime = input.nextInt();

        int counter = 0;
        for (int i = prime; i > 0; i--) {
            if (prime % i == 0)
                counter++;
        }
        if (counter > 2)
            System.out.println("\nThe number is not a prime number");

        else System.out.println("\nThe number is a prime number!");

        System.out.println("------------------------------------------------");


//      7. User a for loop to print headings for four weeks (Weeks 1 - 4). Then use
//      another for loop to print the day (Days 1 - 7) for each week.

        for (int i = 1; i <= 4; i++) {
            System.out.println("Week " + i);
            for (int j = 1; j <= 7; j++)
                System.out.println("Day " + j);
        }

        System.out.println("------------------------------------------------");


//      8. Write a program thats check if the word is a palindrome or not. Hint: A
//      string is said to be a palindrome if it is the same if we start reading it from
//      left to right or right to left.

        System.out.println("Please, enter a word to check if it's a palindrome: ");
        String palindromWord = input.next();

        String isPalidrome = "";

        for (int i = palindromWord.length() - 1; i >= 0; i--) {
            isPalidrome += palindromWord.charAt(i);
        }

        if (palindromWord.equalsIgnoreCase(isPalidrome))
            System.out.println("It is a palindrome word!");

        else System.out.println("It is NOT a palindrome word");
    }
}
