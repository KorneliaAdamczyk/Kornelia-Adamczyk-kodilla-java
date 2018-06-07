package com.kodilla.patterns2.observer.homework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Homework implements Observable{
    private final List<Mentor> mentors;
    private final ArrayDeque<String> messages;
    private final String name;
    private final String surname;

    public Homework(String name, String surname) {
        mentors = new ArrayList<>();
        messages = new ArrayDeque<>();
        this.name = name;
        this.surname = surname;
    }

    public void addHomework(String homework){
        messages.add(homework);
        notifyMentors();
    }
    @Override
    public void registerMentor(Mentor mentor){
        mentors.add(mentor);
    }

    @Override
    public void removeMentor(Mentor mentor){
        mentors.remove(mentor);
    }

    @Override
    public void notifyMentors() {
        for (Mentor mentor : mentors) {
            mentor.update(this);
        }
    }
        public ArrayDeque<String> getMessages() {
            return messages;
        }

        public String getName() {
            return name;
        }

    }

