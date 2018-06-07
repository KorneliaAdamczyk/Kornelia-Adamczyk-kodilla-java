package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer {
    private final String nameMentor;
    private final String surnameMentor;
    private int updateCount;

    public Mentor(String nameMentor, String surnameMentor) {
        this.nameMentor = nameMentor;
        this.surnameMentor = surnameMentor;
    }

    @Override
    public void update(Homework homework){
        if (homework.getMessages().size()>1) {
            System.out.println(nameMentor + " " + surnameMentor + " get new homework from " + homework.getName() + "\n" + "total: " + homework.getMessages().size() + " homeworks");
        } else {
            System.out.println(nameMentor + " " + surnameMentor + " get new homework from " + homework.getName() + "\n" + "total: " + homework.getMessages().size() + " homework");
        }
        updateCount++;
    }

    public String getName() {
        return nameMentor;
    }

    public String getSurname() {
        return surnameMentor;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
