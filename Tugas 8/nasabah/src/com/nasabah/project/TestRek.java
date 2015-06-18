package com.nasabah.project;

/**
 * Created by Muhajudin on 17/06/2015.
 */
public class TestRek {

    public static void main(String[] args) {

//        buat objek rekening
        Rekening aa = new Rekening(20000000.0);
        Nasabah bb = new Nasabah("Muhajudin",aa);
        System.out.println(bb.toString());

//        tarik uang sebesar 10 juta
        aa.tarik(10000000.0);
        System.out.println("Tarik Rp. 10.000.000");

//        tampilkan saldo sekarang
        System.out.println("Saldo sekarang = " + aa.getSaldo());

//        setor saldo 5 juta
        aa.setor(5000000.0);
        System.out.println("Setor Rp. 5.000.000");

//        tampilkan saldo sekarang
        System.out.println("Saldo sekarang = " +aa.getSaldo());
        System.out.println("");
        System.out.println("Terima kasih");

    }
}
