import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // implicit casting
        // byte > short > int > long
        short xx = 1;
        int yy = xx + 2;
        String x = "1.1";
        double y = Double.parseDouble(x) + 2;
        int result = (int) Math.ceil(1.1F);
        int result1 = (int) Math.max(1, 2);
        int random = (int) Math.round(Math.random() * 100);

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String curr = currency.format(1234567.891);
        NumberFormat percent = NumberFormat.getPercentInstance();
        String formPerc = NumberFormat.getPercentInstance().format(0.1);
        String perc = percent.format(1234567.891);
        Scanner scanner = new Scanner(System.in);
        // System.out.print("Name: ");
        // String name = scanner.nextLine().trim();

        // System.out.println("You are " + name);

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterest = scanner.nextFloat();
        float monthlyInterest = annualInterest / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period (Years): ");
        byte years = scanner.nextByte();
        int numberOfPayments = years * MONTHS_IN_YEAR;

        double mortgage = principal
                * (monthlyInterest * Math.pow(1 * monthlyInterest, numberOfPayments) - 1)
                / (Math.pow(1 * monthlyInterest, numberOfPayments) - 1);

        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);
    }
}