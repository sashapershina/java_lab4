package com.java.CSV;

public interface DepartmentI {

    /**
     * Returns the ID of the department
     * @return ID of the department
     */
    int getID();

    /**
     * Sets a new ID for the department
     * @param ID new ID for the department
     */
    void setID(int ID);

    /**
     * Returns the name of the department
     * @return the name of the department
     */
    String getName();

    /**
     * Sets a new name for the department
     * @param name a new name for the department
     */
    void setName(String name);
}
