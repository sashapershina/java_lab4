package com.java.CSV;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person implements AbstractPerson {
    int ID;
    String name;
    Gender gender;
    Date date;
    Department department;
    int income;

    public Person(int ID, String name, Gender gender, Date date, Department department, int income) {
        this.ID = ID;
        this.name = name;
        this.gender = gender;
        this.date = date;
        this.department = department;
        this.income = income;
    }

    @Override
    public int getID() {
        return ID;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Gender getGender() {
        return gender;
    }

    @Override
    public Date getDate() {
        return date;
    }

    @Override
    public Department getDivision() {
        return department;
    }

    @Override
    public int getIncome() {
        return income;
    }

    @Override
    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public void setDivision(Department department) {
        this.department = department;
    }

    @Override
    public void setIncome(int income) {
        this.income = income;
    }

    @Override
    public void print() {
        SimpleDateFormat date_format = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println(ID + "     " + name + "     " + gender + "     " + date_format.format(date) + "     " + department.getName() + "     " + income);
    }
}
