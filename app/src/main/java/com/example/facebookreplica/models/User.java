package com.example.facebookreplica.models;

public class User {

    private String firstname;
    private String lastname;
    private String dob;
    private String phone;
    private String gender;
    private String email;
    private String password;
    private String image;

    public User(String firstname, String lastname, String dob, String phone, String gender, String email, String password, String image) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.dob = dob;
        this.phone = phone;
        this.gender = gender;
        this.email = email;
        this.password = password;
        this.image = image;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getDob() {
        return dob;
    }

    public String getPhone() {
        return phone;
    }

    public String getGender() {
        return gender;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getImg() {
        return image;
    }
}
