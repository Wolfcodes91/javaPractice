import java.text.NumberFormat;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // implicit casting
        // byte > short > int > long
        // short xx = 1;
        // int yy = xx + 2;
        // String x = "1.1";
        // double y = Double.parseDouble(x) + 2;
        // int result = (int) Math.ceil(1.1F);
        // int result1 = (int) Math.max(1, 2);
        // int random = (int) Math.round(Math.random() * 100);

        // NumberFormat currency = NumberFormat.getCurrencyInstance();
        // String curr = currency.format(1234567.891);
        // NumberFormat percent = NumberFormat.getPercentInstance();
        // String formPerc = NumberFormat.getPercentInstance().format(0.1);
        // // String perc = percent.format(1234567.891);
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Name: ");
        // String name = scanner.nextLine().trim();

        // System.out.println("You are " + name);

        // int temperature = 22;
        // boolean isWarm = temperature > 20 && temperature < 30;
        // int income = 12_000;
        // boolean hasHighIncome = (income > 100_000);
        // String className = income > 100_000 ? "First" : "Economy";
        // System.out.println(className);
        // String role = "admin";

        // switch (role) {
        // case "admin":
        // System.out.println("You're an admin");
        // break;
        // case "moderator":
        // System.out.println("You're a moderator");
        // break;
        // default:
        // System.out.println("You're a guest");
        // }

        // if (role == "admin")
        // System.out.println("You're an admin");
        // else if (role == "moderator")
        // System.out.println("You're a moderator");
        // else
        // System.out.println("You're a guest");

        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Number: ");
        // int number = scanner.nextInt();

        // if (number % 5 == 0 && number % 3 == 0)
        // System.out.println("Fizzbuzz");
        // else if (number % 5 == 0)
        // System.out.println("Fizz");
        // else if (number % 3 == 0)
        // System.out.println("Buzz");
        // else {
        // System.out.println(number);
        // }
        // scanner.close();

        // for (int i = 5; i >= 1; i--) {
        // System.out.println(i);
        // }
        // int i = 4;
        // while (i > 0) {
        // System.out.println("bing bong");
        // i--;
        // }

        // Scanner scanner = new Scanner(System.in);
        // String input = "";
        // while (true){
        // System.out.print("Input: ");
        // input = scanner.next().toLowerCase();
        // if(input.equals("pass"))
        // continue;
        // if (input.equals("quit"))
        // break;
        // System.out.println(input);
        // }

        // do {
        // System.out.print("Input: ");
        // input = scanner.next().toLowerCase();
        // System.out.println(input);
        // } while (!input.equals("quit"));

        // String[] fruits = { "Apple", "Mango", "Orange" };
        // for (String fruit : fruits) {
        // System.out.println(fruit);
        // }

        // for (int i = fruits.length - 1; i >= 0; i--) {
        // System.out.println(fruits[i]);
        // }

        // // Mortgage Calculator
        // Scanner scanner = new Scanner(System.in);
        // final byte MONTHS_IN_YEAR = 12;
        // final byte PERCENT = 100;
        // int principal = 0;
        // float annualInterest = 0;
        // float monthlyInterest = 0;
        // int numberOfPayments = 0;

        // while (true) {
        // System.out.print("Principal ($1K - $1M): ");
        // principal = scanner.nextInt();
        // if (principal >= 1000 && principal <= 1_000_000)
        // break;
        // System.out.println("Enter a number between 1,000 and 1,000,000");
        // }
        // while (true) {
        // System.out.print("Annual Interest Rate: ");
        // annualInterest = scanner.nextFloat();
        // if (annualInterest > 0 && principal <= 30) {
        // monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;
        // break;
        // }
        // System.out.println("Enter a value between 1 and 30.");
        // }
        // while (true) {
        // System.out.print("Period (Years): ");
        // byte years = scanner.nextByte();
        // if (years >= 1 && years <= 30) {
        // numberOfPayments = years * MONTHS_IN_YEAR;
        // break;
        // }
        // System.out.println("Enter a value between 1 and 30.");
        // }

        // double mortgage = principal
        // * (monthlyInterest * Math.pow(1 * monthlyInterest, numberOfPayments) - 1)
        // / (Math.pow(1 * monthlyInterest, numberOfPayments) - 1);

        // String mortgageFormatted =
        // NumberFormat.getCurrencyInstance().format(mortgage);
        // System.out.println("Mortgage: " + mortgageFormatted);
        // scanner.close();

        // arrays
        // arrays in java don't change size
        // String[] friendsArray = new String[4];
        String[] friendsArray = { "John", "Chris", "Eric", "Leah" };

        // array lists
        // array lists in java can change size
        // ArrayList<String> friendsArrayList = new ArrayList<>();
        ArrayList<String> friendsArrayList = new ArrayList<>(Arrays.asList("John", "Chris", "Eric", "Leah"));

        // System.out.println(friendsArray[1]);
        
        // System.out.println(friendsArray.length);
        // System.out.println(friendsArrayList.size());

        // add element to array list
        friendsArrayList.add("Bork");
        
        //change element in array or array list
        friendsArray[0] = "Carl";
        System.out.println(friendsArray[0]);
        friendsArrayList.set(2, "Groq");
        
        System.out.println(friendsArrayList.get(2));

        friendsArrayList.remove(0);
        friendsArrayList.remove("Leah");
        
        System.out.println(friendsArray);
        System.out.println(friendsArrayList);
        
    }
}