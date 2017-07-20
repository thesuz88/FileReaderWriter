package com.gc.dao;

import com.gc.dto.CountryDto;
import java.io.File;
import java.util.List;

/**
 * Created by Steve on 7/20/2017.
 */
public class JDBCDao implements CountryDao {
    @Override
    public void addCountry() {

    }

    @Override
    public List<File> readCountry() {
        return null;
    }

    @Override
    public void updateCountry(int keyIndex, CountryDto countryDto) {

    }

    @Override
    public void deleteCountry(int keyIndex) {

    }
}
