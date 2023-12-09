package com.java.CSV;

public interface CSVParserI {

    /**
     * Entering data from a .csv file
     * @param path path to .csv file
     */
    void read(String path);

    /**
     * Outputting data to the console
     */
    void print();
}
