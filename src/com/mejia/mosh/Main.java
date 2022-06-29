package com.mejia.mosh;

import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.StreamSupport;

public class Main {

    public static void main(String[] args) {
        // int age = 30; int - numbers without decimals    = to initialize variable
        // age = 35;
        // int myAge = 30;
        // int herAge = myAge;
        // byte age = 30;
        // int viewsCount = 123_456_789; // underscore work like commas
        // long viewsCount = 3123456789L; // capital L as suffix for large numbers
        // double price = 10.99;
        // float price = 10.99F; // capital F as suffix for float
        // char letter = 'A'; char is for 1 character
        // boolean isEligible = true;
        // System.out.println(isEligible);
        // Date now = new Date();
        // System.out.println(now);
        // byte x = 1;  // primitive type store simple values
        // byte y = x;
        // x = 2;
        // System.out.println(x); // x returns 2, y returns 1 . primitive type are completely independent of each other
        // Point point1 = new Point(1, 1); // reference type store complex objects
        // Point point2 = point1;
        // point1.x = 2;
        // System.out.println(point2); // reference type can influence each other
        // String message = "  Hello   World" + "!!   ";  // string is reference type but no 'new' operator needed. string literal
        // System.out.println(message.length()); // find the length f string
        // System.out.println(message.indexOf("e")); // find index of letter
        // System.out.println(message.replace("!", "*")); // replace character
        // System.out.println(message.toLowerCase()); // change all to lowercase
        // System.out.println(message.trim()); // removes extra spacing at begin and end
        // String message = "Hello \"Mosh\""; // use a backslash \ to excape them and  add quotes to string
        // String mwssage = "c:\\Windows\\...."; // escape a a backlash
        // String message = "c:\nWindows\\...."; // /n to add new line to string
        // String message = "c:\tWindows\\...."; // /t to add tab to string
        // System.out.println(message);
        // int[] numbers = { 2, 3, 5, 1, 4 }; // creating an array. arrays have a fixed length
        // Arrays.sort(numbers);
        // System.out.println(Arrays.toString(numbers)); // getting length of array
        // int[][] numbers = { { 1, 2, 3}, {  4, 5, 6} }; // multidimensional arrays
        // System.out.println(Arrays.deepToString(numbers)); // deepToString method for multi array
        //  final float PI = 3.14F; // final variable or constant cannot be reinitialized. use capital letters to initialized constant varibles
        // int result = 10 / 3; // results of division is a whole number
        // double result = (double)10 / (double)3;
        // int x = 1;
        // int y = ++x;
        //x++;     // increment operator. postfix or prefix
        // int x = 1;
        // x += 2; // augmented operators x -= 2, x *= 2, x /= 2
        // int x = (10 + 3) * 2;
        // System.out.println(x);
        // implicit casting
        // byte > short > int > long > float > double
        // short x = 1;
        // int y = x + 2;
        // double x = 1.1;
        // double y = x + 2; // 2.0
        // explicit casting
        // int y = (int)x + 2;
        //String x = "1";
        //int y = Integer.parseInt(x) + 2;
        // String x = "1.1";
        //double y = Double.parseDouble(x) + 2;
        // int result = (int)Math.ceil(1.1F);
        // int result = (int)Math.floor(1.1F);
        // int result = (int)Math.max(1, 2);
        //double result = (int)Math.random(1.1F);
        // double result = (int) (Math.random() * 100);
        // System.out.println(result);
        // $122,345
        // 10%;
        // NumberFormat currency = NumberFormat.getCurrencyInstance();
        // NumberFormat percent = NumberFormat.getPercentInstance();
        // String result = percent.format(0.1);
        // String result = NumberFormat.getPercentInstance().format(0.1);
        // System.out.println(result);
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Name: ");
//        String name = scanner.nextLine().trim();
//        System.out.println("Your name is " + name);
//        final byte MONTHS_IN_YEAR = 12;
//        final byte PERCENT = 100;
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Principle: ");
//        int principle = scanner.nextInt();
//
//        System.out.println("Annual Interest Rate: ");
//        float annualInterest = scanner.nextFloat();
//        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
//
//        System.out.println("Period (Years): ");
//        byte years = scanner.nextByte();
//        int numberOfPayments = years * MONTHS_IN_YEAR;
//
//        double mortgage = principle
//                * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
//                / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
//
//        String mortgageFormatted = NumberFormat.getCurrencyInstance().format();
//        System.out.println("Mortgage: " + mortgageFormatted);
//        int x = 1;
//        int y = 2;
//        System.out.println(x != y); // boolean expression
//            int temperature = 22;
//            boolean isWarm = temperature > 20 && temperature < 30;
//        System.out.println(isWarm);
//        boolean hasHighIncome = false;
//        boolean hasGoodCredit = true;
//        boolean hasCriminalRecord = false;
//        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
//        System.out.println(isEligible);
//        int temp = 32;
//        if (temp > 30) {
//            System.out.println("Its a hot day");
//            System.out.println("Drink Water");
//        }
//        else if (temp > 20)
//            System.out.println("Beautiful day");
//        else
//            System.out.println("Cold Day");
//        int income = 120_000;
//        boolean hasHighIncome = (income > 100_000);
//        int income = 120_000;
//        String className = income > 100_000 ? "First" : "Economy";
//        String role = "admin";
//
//        switch (role) {
//            case "admin":
//                System.out.println("Your an admin");
//                break;
//
//            case "moderator":
//                System.out.println("Your an moderator");
//                break;
//
//            default:
//                System.out.println("Your a guest");
//
//        }
//
//        if (role == "admin")
//            System.out.println();
//        else if (role == "moderator") {
//            System.out.println();
//        else
//            System.out.println();
//        }

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Number: ");
//        int number = scanner.nextInt();
//
//        if (number % 5 == 0) {
//            if (number % 3 == 0)
//                System.out.println("FizzBuzz");
//            else
//                System.out.println("Fizz");
//        }
//        else if (number % 3 == 0)
//            System.out.println("Buzz");
//        else
//            System.out.println(number);
//        for (int i = 5; i > 0; i--)
//            System.out.println("hs" + i);
//        Scanner scanner = new Scanner(System.in);
//        String input = "";
//        while (true) {
//            System.out.print("Input: ");
//            input = scanner.next().toLowerCase();
//            if (input.equals("pass"))
//                continue;
//            if (input.equals("quit"))
//                break;
//            System.out.println(input);
//        }
//        do {
//            while (!input.equals("quit"))
//
//        String[] fruits = {"apples", "mango", "orange" };
//
//        for (int i = 0; i < fruits.length; i++)
//        System.out.println(fruits[i]);

//        for (String fruit : fruits)
//            System.out.println(fruit);

//        final byte MONTHS_IN_YEAR = 12;
//        final byte PERCENT = 100;
//        int principle = 0;
//        float monthlyInterest = 0;
//        int numberOfPayments = 0;
//
//
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            System.out.println("Principle: ");
//            if (principle >= 1000 && principle <= 1_000_000)
//                break;
//            System.out.println("Enter between 1000 and 1000000");
//        }
//
//        while (true) {
//            System.out.println("Annual Interest Rate: ");
//            float annualInterest = scanner.nextFloat();
//            if (annualInterest >= 1 && annualInterest <= 30) {
//                monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
//            }
//            break;
//        }
//        System.out.println("between 1 and 30");
//
//    while (true) {
//        System.out.println("Period (Years): ");
//        byte years = scanner.nextByte();
//        if (years >= 1 && years <= 30) {
//        numberOfPayments = years * MONTHS_IN_YEAR;
//        break;
//            System.out.println("between 1 and 30");
//    }
//    double mortgage = principle
//           * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments))
//           / (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
//
//        String mortgageFormatted = NumberFormat.getCurrencyInstance().format();
//        System.out.println("Mortgage: " + mortgageFormatted);
   }
}
