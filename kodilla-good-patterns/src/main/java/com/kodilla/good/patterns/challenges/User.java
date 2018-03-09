package com.kodilla.good.patterns.challenges;

public class User {

    private String Name;
    private String Surname;
    private String Mail;

    public User(final String name, final String surname, final String mail) {
        Name = name;
        Surname = surname;
        Mail = mail;
    }

    public String getName() {
        return Name;
    }

    public String getSurname() {
        return Surname;
    }

    public String getMail() {
        return Mail;
    }
}
