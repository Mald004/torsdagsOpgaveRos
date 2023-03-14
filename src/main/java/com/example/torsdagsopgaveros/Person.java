package com.example.torsdagsopgaveros;

import java.util.ArrayList;

public class Person extends Bruger {
    private String navn;
    private String kodeord;

    private ArrayList<String> huskeliste;

    public Person(String navn, String kodeord) {
        this.navn = navn;
        this.kodeord = kodeord;
        this.huskeliste = new ArrayList<>();
    }
    @Override
    public ArrayList<String> getHuskeliste() {
        return huskeliste;
    }

    @Override
    public ArrayList<Bruger> getBrugere() {
        return null;
    }

    @Override
    public String getNavn() {
        return navn;
    }
    @Override
    public void setNavn(String navn) {
        this.navn = navn;
    }
    @Override
    public String getKodeord() {
        return kodeord;
    }
    @Override
    public void setKodeord(String kodeord) {
        this.kodeord = kodeord;
    }
}
