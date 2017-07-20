package com.gc.dao;
import com.gc.dto.CountryDto;
import java.io.File;
import java.util.List;

/**
 * Created by Steve on 7/20/2017.
 * Create
 * Read
 * Update
 * Delete
 */
public interface CountryDao {

    public int TEXT_DAO = 1;
    public int JDBC_DAO = 2;

    //create
    public void addCountry();

    //Read
    public List<File> readCountry();

    //Update
    public void updateCountry(int keyIndex, CountryDto countryDto);

    //Delete
    public void deleteCountry(int keyIndex);

}
