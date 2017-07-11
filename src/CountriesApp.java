import java.io.*;
import java.util.Scanner;

/**
 * Created by Steve on 7/11/2017.
 */
public class CountriesApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        CountriesTextFIle countryFile = new CountriesTextFIle();
        int menuNum = 0;

        System.out.println("Welcome to the Countries Maintenance Application!");
        do {
            System.out.println("\nEnter menu number");
            System.out.println("1 - See the list of countries\n2 - Add a country\n3 - Exit");

            menuNum = scan.nextInt();

            menuNum = validateMenuNum(scan, menuNum);

            if (menuNum == 1) {
                countryFile.readFromFile();

            } else if (menuNum == 2) {
                //add a country (filewriter)
                countryFile.writeToFile();
            }
        } while (menuNum != 3);

        System.out.println("Happy travels!");
    }

    private static int validateMenuNum(Scanner scan, int menuNum) {
        while (menuNum != 1 && menuNum != 2 && menuNum != 3) {
            System.out.println("Invalid menu choice.");
            System.out.println("1 - See the list of countries\n2 - Add a country\n3 - Exit");
            System.out.println("\nEnter menu number");
            menuNum = scan.nextInt();
        }
        return menuNum;
    }


}
