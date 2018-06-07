package com.kodilla.patterns2.observer.homework;

public interface Observable {
    void registerMentor(Mentor mentor);
    void removeMentor (Mentor mentor);
    void notifyMentors();
}
