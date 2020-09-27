package model;

import java.io.Serializable;
import java.util.Date;

public class Employee implements Serializable {
//    instance variable properties
    private long empNo;
    private String firstName;
    private String lastName;
    private char gender;
    private Date birthDate;
    private Date hireDate;

//    default constructor
    public Employee() {  }

//constructor contains all the properties
    public Employee(long empNo, String firstName, String lastName, char gender, Date birthDate, Date hireDate) {
        this.empNo = empNo;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
    }

//    getter and setter
    public long getEmpNo() {
        return empNo;
    }

    public void setEmpNo(long empNo) {
        this.empNo = empNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
}