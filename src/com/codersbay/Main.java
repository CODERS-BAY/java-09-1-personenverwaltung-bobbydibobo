package com.codersbay;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        //Familie Mayer
        Person gunther = new Person("Gunther", "Mayer", "07.09.1872", Gender.valueOf("MALE"), 4020, "Linz", "Paracelsusstrasse", 37);
        Person oliver = new Person("Oliver", "Mayer", "04.06.1998", Gender.valueOf("MALE"), 4020, "Linz", "Paracelsusstrasse", 37);
        Person sarah = new Person("Sarah", "Mayer", "12.03.2002", Gender.valueOf("FEMALE"), 4020, "Linz", "Paracelsusstrasse", 37);
        Person lisl = new Person("Lisl", "Mayer", "24.12.1875", Gender.valueOf("FEMALE"), 4020, "Linz", "Paracelsusstrasse", 37);
        Person doggoButStillPerson = new Person("Dexter", "Mayer", "15.07.2014", Gender.valueOf("OTHER"), 4020, "Linz", "Paracelsusstrasse", 37);

        ArrayList<Person> myFamily = new ArrayList<>();
        Personenverwaltung allThemPeople = new Personenverwaltung(myFamily);

        allThemPeople.addPerson(gunther);
        allThemPeople.addPerson(oliver);
        allThemPeople.addPerson(sarah);
        allThemPeople.addPerson(lisl);
        allThemPeople.addPerson(doggoButStillPerson);

        allThemPeople.printList();

        allThemPeople.removePerson(4);

        allThemPeople.printList();



    }
}


