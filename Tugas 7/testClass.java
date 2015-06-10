package com.muhajudin.project;

public class testClass {

    public static void main(String[] args) {


        Penulis object = new Penulis("Irfan","jalan buntu", 'L', "perjaka", 17);
        Buku ensiklopedia = new Buku("Harry Potters",15000.0,"Gramedia",object);
        Penulis akbar = new Penulis ("akbar","Pakisaji",'L');

        object.setAlamatPenulis("Malang");


        System.out.println(ensiklopedia.getCreatedBy().getAlamatPenulis());

    }
}
