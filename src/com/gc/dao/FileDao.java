package com.gc.dao;

import com.gc.dto.CountryDto;
import java.io.*;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Steve on 7/20/2017.
 */
public class FileDao implements CountryDao {
    Scanner scan = new Scanner(System.in);

    @Override
    public void addCountry() {
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

    @Override
    public List<File> readCountry() {
        System.out.println("Current List of Countries:");
        File countryFile = new File("countries.txt");

        //if the file has not yet been created then tells user list is empty
        if(!countryFile.exists()){
            System.out.println("List is currently empty");
        }
        else {
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
        return null;
    }

    @Override
    public void updateCountry(int keyIndex, CountryDto productDto) {

    }

    @Override
    public void deleteCountry(int keyIndex) {
        
    }
}
