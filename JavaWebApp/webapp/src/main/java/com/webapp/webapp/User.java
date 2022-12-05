package com.webapp.webapp;
//Model Class for User 

import java.sql.Date;

public class User {
    private String fName; 
    private String lName; 
    private String username; 
    private String password; 
    private String gender; 

    private Date dob;

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String toString(){
    String output = ""; 

    output += "First Name: " + fName; 
    output += "\nLast Name: " + lName; 
    output += "\nUsername: " + username; 
    output += "\nPassword: " + password; 
    output += "\nGender: " + gender; 
    output += "\nDateOfBirth: " + dob; 

    return output; 
    }
}
