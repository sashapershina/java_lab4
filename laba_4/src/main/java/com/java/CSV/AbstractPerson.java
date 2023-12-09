package com.java.CSV;

import java.util.Date;

public interface AbstractPerson {

    /**
     * Returns the ID of the person
     * @return ID of the person
     */
    int getID();

    /**
     * Returns the name of the person
     * @return the name of the person
     */
    String getName();

    /**
     * Returns the gender of the person
     * @return the gender of the person
     */
    Gender getGender();

    /**
     * Returns the date for the person
     * @return the date for the person
     */
    Date getDate();

    /**
     * Returns the person's department
     * @return the person's department
     */
    Department getDivision();

    /**
     * Returns the salary of the person
     * @return the salary of the person
     */
    int getIncome();

    /**
     * Sets a new ID value of the person
     * @param ID a new ID value of the person
     */
    void setID(int ID);

    /**
     * Sets a new name for the person
     * @param name a new name for the person
     */
    void setName(String name);

    /**
     * Sets the new gender of the person
     * @param gender the new gender of the person
     */
    void setGender(Gender gender);

    /**
     * Sets a new date for the person
     * @param date a new date for the person
     */
    void setDate(Date date);

    /**
     * Sets a new department for the person
     * @param department a new department for the person
     */
    void setDivision(Department department);

    /**
     * Sets a new salary for the person
     * @param income a new salary for the person
     */
    void setIncome(int income);

    /**
     * Displaying the data of a given person to the console
     */
    void print();
}
