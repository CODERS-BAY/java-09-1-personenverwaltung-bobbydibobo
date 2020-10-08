package com.codersbay;

import java.time.LocalDate;
import java.util.ArrayList;

public class Personenverwaltung {

    ArrayList<Person> persons;

    public Personenverwaltung(ArrayList<Person> persons) {
        this.persons = persons;
    }


    public void createAndAddPerson(String vorname, String nachname, String geburtsdatum, Gender gender, int plz, String ort, String straße, int hausnummer) {

        Person person = new Person(vorname, nachname, geburtsdatum, gender, plz, ort, straße, hausnummer);
        persons.add(person);
    }

    public void createAndAddPerson(String vorname, String nachname) {

        Person person = new Person(vorname, nachname);
        persons.add(person);
    }

    public void createAndAddPerson(String vorname, String nachname, String geburtsdatum, Gender gender) {

        Person person = new Person(vorname, nachname, geburtsdatum, gender);
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
