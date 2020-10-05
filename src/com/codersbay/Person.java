package com.codersbay;

import java.time.LocalDate;


public class Person {

    public String vorname;
    public String nachname;
    public String geburtsdatum;
    public String gender; //true = weiblich | false = männlich
    public Adresse adresse;


    public Person(String vorname, String nachname, String geburtsdatum, String gender, int plz, String ort, String straßenname, int hausnummer) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsdatum = geburtsdatum;
        this.gender = gender;
        this.adresse = new Adresse(plz, ort, straßenname, hausnummer);
    }

    public Person(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public Person(String vorname, String nachname, String geburtsdatum, String gender) {
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
