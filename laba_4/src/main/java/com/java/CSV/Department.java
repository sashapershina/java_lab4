package com.java.CSV;

public class Department implements DepartmentI {
    int ID;
    String name;

    public Department(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    @Override
    public int getID() {
        return ID;
    }

    @Override
    public void setID(int ID) {
        this.ID = ID;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
