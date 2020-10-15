package com.codersbay;

import java.time.LocalDate;
import java.util.ArrayList;

public class Personenverwaltung {

    ArrayList<Person> persons;

    public Personenverwaltung(ArrayList<Person> persons) {
        this.persons = persons;
    }

    public void addPerson(Person person) {


        persons.add(person);
    }

    public void removePerson(int index){
        persons.remove(index);
    }

    public void printList(){
        for (Person person:persons){
            System.out.println(person);
        }
    }

    @Override
    public String toString() {
        return "Personenverwaltung{" +
                "persons=" + persons +
                '}';
    }
}
