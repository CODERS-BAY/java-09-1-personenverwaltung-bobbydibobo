package com.codersbay;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Personenverwaltung personenverwaltung = new Personenverwaltung(new ArrayList<>());

        Scanner scan = new Scanner(System.in);


            System.out.println("Person hinzufügen: type (+)");
            System.out.println("Person entfernen: type (-)");

            String choice = scan.nextLine();

            if (choice.equals("+")) {
                System.out.println("Person mit Allem -> Type: '1'");
                System.out.println("Person mit Name -> Type: '2'");
                System.out.println("Person mit Name, Geschlecht und Geburtsdatum -> Type: '3'");
                int anotherChoice = scan.nextInt();

                if (anotherChoice == 1) {
                    System.out.println("Gib den Vornamen ein!");
                    String v1 = scan.nextLine();

                    System.out.println("Gib den Nachnamen ein!");
                    String n1 = scan.nextLine();

                    System.out.println("Gib das Geburtsdatum ein!");
                    String geb1 = scan.nextLine();

                    System.out.println("Gib das Geschlecht ein!");
                    String gen1 = scan.nextLine();

                    System.out.println("Gib die PLZ ein!");
                    int plz1 = scan.nextInt();

                    System.out.println("Gib den Ort ein!");
                    String ort1 = scan.nextLine();

                    System.out.println("Gib die Straße ein!");
                    String street1 = scan.nextLine();

                    System.out.println("Gib den Hausnummer ein!");
                    int h1 = scan.nextInt();

                    personenverwaltung.createAndAddPerson(v1, n1, geb1, gen1, plz1, ort1, street1, h1);
                } else if (anotherChoice == 2){
                    System.out.println("Gib den Vornamen ein!");
                    String v2 = scan.nextLine();

                    System.out.println("Gib den Nachnamen ein!");
                    String n2 = scan.nextLine();

                    personenverwaltung.createAndAddPerson(v2, n2);
                }else if (anotherChoice == 3){
                    System.out.println("Gib den Vornamen ein!");
                    String v3 = scan.nextLine();

                    System.out.println("Gib den Nachnamen ein!");
                    String n3 = scan.nextLine();

                    System.out.println("Gib das Geburtsdatum ein!");
                    String geb3 = scan.nextLine();

                    System.out.println("Gib das Geschlecht ein!");
                    String gen3 = scan.nextLine();

                    personenverwaltung.createAndAddPerson(v3, n3, geb3,gen3);
                }
            }


        personenverwaltung.printList();

        }

    }


