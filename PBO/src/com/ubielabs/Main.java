package com.ubielabs;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Liga Italy = new Liga("Italy");
        Liga Terserah = new Liga("Terserah");

        Divisi SerieA = new Divisi("Serie A");
        Divisi SerieB = new Divisi("Serie B");

        Klub KlubA = new Klub("Ac Milan",SerieA);
        Klub KlubB = new Klub("Juventus",SerieA);

        Klub KlubC = new Klub("Livorno",SerieB);
        Klub KlubD = new Klub("Bologna",SerieB);

        Italy.setDaftarDivisi(SerieA);
        Italy.setDaftarDivisi(SerieB);

        Italy.setDaftarKlub(KlubA);
        Italy.setDaftarKlub(KlubB);
        Italy.setDaftarKlub(KlubC);
        Italy.setDaftarKlub(KlubD);

        SerieA.setDaftarKlub(KlubA);
        SerieA.setDaftarKlub(KlubB);
        SerieB.setDaftarKlub(KlubC);
        SerieB.setDaftarKlub(KlubD);

        System.out.println("1. Get daftar divisi by nama liga ");
        System.out.println("Daftar Divisi dari Liga Italy   :   " + Italy.getDaftarDivisi());
        System.out.println("");

        System.out.println("2. Get Daftar Klub by nama liga");
        System.out.println("Daftar Klub dari Liga Italy     : " + Italy.getDaftarKlub());
        System.out.println("");

        System.out.println("3. Get Daftar Klub by nama Divisi");
        System.out.println("Daftar Klub dari Divisi Serie A : " + SerieA.getDaftarKlub());
        System.out.println("Daftar Klub dari Divisi Serie B : " + SerieB.getDaftarKlub());
        System.out.println("");


        System.out.println("4. Get Klub ini berada di divisi mana by nama Klub");
        KlubA.getNamaKlub();
        System.out.println("Klub                 : " + KlubA.getNamaKlub());
        System.out.println("Berada Pada Divisi   : " + KlubA.getDivisi());
        System.out.println("");

        System.out.println("5. Get Klub ini berada di liga apa by nama Klub");
        KlubB.getNamaKlub();
        System.out.println("Klub                : " + KlubB.getNamaKlub());
        System.out.println("Berada pada Liga    : " + KlubB.getLiga());
    }
}

