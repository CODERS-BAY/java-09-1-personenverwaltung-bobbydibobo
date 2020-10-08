package com.codersbay;

import java.time.LocalDate;


public class Person {

    public String vorname;
    public String nachname;
    public String geburtsdatum;
    public Gender gender;
    public Adresse adresse;


    public Person(String vorname, String nachname, String geburtsdatum, Gender gender, int plz, String ort, String strassenname, int hausnummer) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsdatum = geburtsdatum;
        this.gender = gender;
        this.adresse = new Adresse(plz, ort, strassenname, hausnummer);
    }

    public Person(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public Person(String vorname, String nachname, String geburtsdatum, Gender gender) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsdatum = geburtsdatum;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "vorname='" + vorname + '\'' +
                ", nachname='" + nachname + '\'' +
                ", geburtsdatum='" + geburtsdatum + '\'' +
                ", gender='" + gender + '\'' +
                ", adresse=" + adresse +
                '}';
    }
}
