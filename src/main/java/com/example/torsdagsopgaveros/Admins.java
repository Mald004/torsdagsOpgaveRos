package com.example.torsdagsopgaveros;

import java.util.ArrayList;

public class Admins extends Bruger {
    private String navn;
    private String kodeord;
    private ArrayList<Bruger> brugere;
    private ArrayList<String> huskeliste;

    public Admins(String navn, String kodeord, ArrayList<Bruger> brugere) {
        this.navn = navn;
        this.kodeord = kodeord;
        this.brugere = brugere;
        huskeliste = new ArrayList<>();
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

    @Override
    public ArrayList<String> getHuskeliste() {
        return huskeliste;
    }

    public ArrayList<Bruger> getBrugere() {
        return brugere;
    }

}
