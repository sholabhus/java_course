package assignment;

import java.util.Scanner;

public class SeasonOfYear {
    public static void main(String arg[]) {
        //Get the season of the year
        System.out.println("Enter a season of the year:");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        //Get a Whole number
        System.out.println("Enter a whole number:");
        int number = scanner.nextInt();

        //Get an adjective
        System.out.println("Enter an adjective:");
        String adjective = scanner.next();
        scanner.close();

        System.out.println("On a " + adjective + " " + season +
                " day, I drink a minimum of " + number +
                " cups of coffee.");
    }
}
