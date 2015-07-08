package com.ubielabs;

import com.sun.org.apache.xpath.internal.operations.Div;

import java.util.ArrayList;

/**
 * Created by Putra Prima A on 6/24/2015.
 */
public class Liga {
    private String namaLiga;
    ArrayList<Divisi> daftarDivisi = new ArrayList<Divisi>();
    ArrayList<Klub> daftarKlub = new ArrayList<Klub>();

    public Liga(String namaLiga) {
        this.namaLiga = namaLiga;
    }

    public String getNamaLiga() {
        return namaLiga;
    }

    public void setNamaLiga(String namaLiga) {
        this.namaLiga = namaLiga;
    }

    public ArrayList<Divisi> getDaftarDivisi() {
        return daftarDivisi;
    }

    public void setDaftarDivisi(Divisi divisi)
    {
        this.daftarDivisi.add(divisi);
    }

    public ArrayList<Klub> getDaftarKlub() {
        return daftarKlub;
    }

    public void setDaftarKlub (Klub klub) {
        this.daftarKlub.add(klub);
    }

    @Override
    public String toString() {
        return "Liga{" +
                "namaLiga='" + namaLiga + '\'' +
                '}';
    }
}
