package com.codersbay;

public class Adresse {

    public int plz;
    public String ort;
    public String strassenname;
    public int hausnummer;

    public Adresse(int plz, String ort, String strassenname, int hausnummer) {
        this.plz = plz;
        this.ort = ort;
        this.strassenname = strassenname;
        this.hausnummer = hausnummer;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "plz=" + plz +
                ", ort='" + ort + '\'' +
                ", strassenname='" + strassenname + '\'' +
                ", hausnummer=" + hausnummer +
                '}';
    }
}
