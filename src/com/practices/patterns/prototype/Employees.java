package com.practices.patterns.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {

    private List<String> empList;

    public Employees() {
        empList = new ArrayList<>();
    }

    public Employees(List<String> empList) {
        this.empList = empList;
    }

    public void loadData() {
        //read all employees from database and put into the list
        empList.add("Andres");
        empList.add("Ana");
        empList.add("Juan");
        empList.add("Liz");
    }

    public List<String> getEmpList() {
        return empList;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<>();
        for (String s : this.getEmpList()) {
            temp.add(s);
        }

        return new Employees(temp);
    }
}
