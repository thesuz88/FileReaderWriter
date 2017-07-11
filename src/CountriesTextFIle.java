import java.io.*;
import java.util.Scanner;

/**
 * Created by Steve on 7/11/2017.
 */
public class CountriesTextFIle {
    Scanner scan = new Scanner(System.in);

    public void readFromFile() {
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
    }

    public void writeToFile() {
        //write list of countries (FileWriter)
        System.out.println("Enter Country: ");
        String countryAdd = scan.nextLine();
        try {
            FileWriter newCountry = new FileWriter("countries.txt", true);
            newCountry.write(countryAdd + "\n");
            newCountry.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
