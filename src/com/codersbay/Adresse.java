package com.codersbay;

public class Adresse {

    public int plz;
    public String ort;
    public String straßenname;
    public int hausnummer;

    public Adresse(int plz, String ort, String straßenname, int hausnummer) {
        this.plz = plz;
        this.ort = ort;
        this.straßenname = straßenname;
        this.hausnummer = hausnummer;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "plz=" + plz +
                ", ort='" + ort + '\'' +
                ", straßenname='" + straßenname + '\'' +
                ", hausnummer=" + hausnummer +
                '}';
    }
}
