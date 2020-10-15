package com.codersbay;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class PersonenverwaltungTest {

    @Test
    void testEmptyPersonManagement() {
        ArrayList<Person> myFamily = new ArrayList<>();

        Personenverwaltung allThemPeople = new Personenverwaltung(myFamily);
        assertTrue(allThemPeople.persons.isEmpty());
    }

    @Test
    void testAddPerson() {
        ArrayList<Person> myFamily = new ArrayList<>();

        Personenverwaltung allThemPeople = new Personenverwaltung(myFamily);

        Person gunther = new Person("Gunther", "Mayer", "07.09.1882", Gender.valueOf("MALE"), 4020, "Linz", "Paracelsusstrasse", 37);
        Person oliver = new Person("Oliver", "Mayer", "07.09.1882", Gender.valueOf("MALE"), 4020, "Linz", "Paracelsusstrasse", 37);

        allThemPeople.addPerson(gunther);
        assertFalse(allThemPeople.persons.isEmpty());
        assertEquals(1, allThemPeople.persons.size());

        allThemPeople.addPerson(oliver);
        assertEquals(2, allThemPeople.persons.size());
        assertEquals("Gunther" , allThemPeople.persons.get(0).vorname);
        assertEquals("Oliver" , allThemPeople.persons.get(1).vorname);
    }

    @Test
    void testRemovePerson(){
        ArrayList<Person> myFamily = new ArrayList<>();

        Personenverwaltung allThemPeople = new Personenverwaltung(myFamily);

        Person gunther = new Person("Gunther", "Mayer", "07.09.1882", Gender.valueOf("MALE"), 4020, "Linz", "Paracelsusstrasse", 37);
        Person oliver = new Person("Oliver", "Mayer", "07.09.1882", Gender.valueOf("MALE"), 4020, "Linz", "Paracelsusstrasse", 37);

        allThemPeople.addPerson(gunther);
        allThemPeople.addPerson(oliver);

        allThemPeople.removePerson(0);
        assertEquals(1, allThemPeople.persons.size());
    }
}