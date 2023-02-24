package src.util;

import java.util.Scanner;

public class Input {

    private static Scanner scanner = new Scanner(System.in);

    public static String getString(){
        return scanner.nextLine();
    }

    public static boolean yesNo(){
        String userInput = scanner.nextLine();
        return userInput.equalsIgnoreCase("yes") || userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("si");
    }

    public static int getInt(int min, int max){
        System.out.printf("Enter a number between %d and %d", min, max);
        int userNumber = scanner.nextInt();
        if(userNumber < min || userNumber > max){
            getInt(min, max);
        }
        return userNumber;

    }

    public static int getInt(){
        System.out.println("Enter an integer value");
        String stringVal = getString();
        try{
            return Integer.valueOf(stringVal);
        }catch (NumberFormatException e){
            System.out.println("You had an invalid input, try again");
            return getInt();
        }
    }

    public static double getDouble(double min, double max){
        System.out.printf("Enter a number between %s and %s", min, max);
        double userNumber = scanner.nextDouble();
        if(Double.compare(userNumber, min) < 0 || Double.compare(userNumber, max) > 0 ){
            getDouble(min, max);
        }
        return userNumber;
    }

    public static double getDouble(){
        System.out.println("Enter an double value");
        String stringVal = getString();
        double doubleVal = 0;
        try{
            return Double.valueOf(stringVal);
        }catch (NumberFormatException e) {
            System.out.println("Invalid input");
            return getDouble();
        }
    }

}


//public class Main {
//    public static void main(String[] args) {
//        int[][] primes = new int[3][3];
//        primes[2][2] = 1;
//
//        System.out.println(primes[1][2]);
//    }
//}