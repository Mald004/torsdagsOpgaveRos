package com.example.torsdagsopgaveros;

import java.util.ArrayList;

public abstract class Bruger {



    public abstract String getNavn();

    public abstract void setNavn(String navn);

    public abstract String getKodeord();

    public abstract void setKodeord(String kodeord);
    public abstract ArrayList<String> getHuskeliste();

    public abstract ArrayList<Bruger> getBrugere();

}
