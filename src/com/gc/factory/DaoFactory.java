package com.gc.factory;

import com.gc.dao.CountryDao;
import com.gc.dao.FileDao;
import com.gc.dao.JDBCDao;

/**
 * Created by Steve on 7/20/2017.
 */
public class DaoFactory {

    public static CountryDao getDaoInstance(int fileDao) {

        switch (fileDao) {
            case CountryDao.TEXT_DAO:
                return new FileDao();
            case CountryDao.JDBC_DAO:
                return new JDBCDao();
            default:
                return null;
        }
    }

}
