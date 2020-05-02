package com.company;

import com.sun.deploy.security.SelectableSecurityManager;

import javax.naming.Name;

public class Center extends Super_Valentine {
    private Double gpa;
    private String faculty;

    public Center(String name, int age, int position, Double gpa, String faculty) {
        super(name, age, position);
        this.gpa = gpa;
        this.faculty = faculty;
    }

    @Override
    public void printInfo() {
        System.out.println("Name : " + getName());
        System.out.println("Age : " + getAge());
        System.out.println("Position : " + getPosition());
        System.out.println("Gpa : " + gpa);
        System.out.println("Faculty : " + faculty);
    }

    @Override
    public void singName() {
        System.out.print(getName() + " Ka " + getName() + " Ka " + getName() + " Ka ");
        System.out.println(" Nue Chue " + getName());
    }

    public int honor() {
        if (gpa >= 3.6) {
            return 1;
        }
        else if (gpa >= 3.2) {
            return 2;
        }
        else {
            return 3;
        }
    }

    public Double getGpa(){
        return gpa;
    }
    public String getFaculty(){
        return faculty;
    }
}
