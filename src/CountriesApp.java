import java.io.*;
import java.util.Scanner;

/**
 * Created by Steve on 7/11/2017.
 */
public class CountriesApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int menuNum = 0;

        System.out.println("Welcome to the Countries Maintenance Application!");
        System.out.println("1 - See the list of countries\n2 - Add a country\n3 - Exit");
        do {
            System.out.println("\nEnter menu number");

            menuNum = scan.nextInt();

            while (menuNum != 1 && menuNum != 2 && menuNum != 3) {
                System.out.println("Invalid menu choice.");
                System.out.println("1 - See the list of countries\n2 - Add a country\n3 - Exit");
                System.out.println("\nEnter menu number");
                menuNum = scan.nextInt();
            }

            if (menuNum == 1) {
                //show list of countries (filereader)
                System.out.println("Current List of Countries:");
                File countryFile = new File("countries.txt");
                try {
                    FileReader reader = new FileReader(countryFile);
                    BufferedReader buff = new BufferedReader(reader);
                    String line;
                    while ((line = buff.readLine()) != null) {
                        System.out.println(line);
                    }
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }

            } else if (menuNum == 2) {
                //add a country (filewriter)
                System.out.println("Enter Country: ");
                scan.nextLine();
                String countryAdd = scan.nextLine();
                try {
                    FileWriter newCountry = new FileWriter("countries.txt", true);
                    newCountry.write(countryAdd + "\n");
                    newCountry.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }


            }


//        try {
//            FileWriter countries = new FileWriter("countries.txt", true);
//
//        }
//        catch (IOException e) {
//            e.printStackTrace();
//        }

        }while(menuNum != 3);

        System.out.println("Happy travels!");
    }

}
