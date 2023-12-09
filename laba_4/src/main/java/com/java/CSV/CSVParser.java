package com.java.CSV;
import com.opencsv.CSVParserBuilder;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CSVParser implements CSVParserI {

    ArrayList<Person> people;
    ArrayList<Department> departments;

    private int findInDepartments(String dep_name) {
        for (int i = 0; i < departments.size(); i++)
            if (departments.get(i).getName().equals(dep_name))
                return i;
        return -1;
    }

    public CSVParser() {
        people = new ArrayList<>();
        departments = new ArrayList<>();
    }

    @Override
    public void read(String path) {
        int id, salary, division_id;
        String name;
        Gender gender;
        Date date;
        Department department;
        try {
            com.opencsv.CSVParser parser = new CSVParserBuilder().withSeparator(';').build();
            CSVReader csvReader = new CSVReaderBuilder(new FileReader(path)).withCSVParser(parser).build();
            List<String[]> table = csvReader.readAll();

            for (String[] row : table.subList(1, table.size())) {
                id = Integer.parseInt(row[0]);
                name = row[1];
                gender = Gender.valueOf(row[2]);
                date = new SimpleDateFormat("dd.MM.yyyy").parse(row[3]);
                division_id = findInDepartments(row[4]);
                if (division_id == -1) {
                    division_id = departments.size();
                    department = new Department(division_id, row[4]);
                    departments.add(department);
                }
                else
                    department = new Department(division_id, row[4]);
                salary = Integer.parseInt(row[5]);
                people.add(new Person(id, name, gender, date, department, salary));
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

        @Override
        public void print() {
            for (int i = 0; i < people.size(); i++)
                people.get(i).print();
        }
}
