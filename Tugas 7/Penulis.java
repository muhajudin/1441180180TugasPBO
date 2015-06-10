package com.muhajudin.project;

public class Penulis {

    private String namaPenulis;
    private String alamatPenulis;
    private char jenisKelaminPenulis;
    private String statusPenulis;
    private int umurPenulis;

    public Penulis(){
    }

    public Penulis(String namaPenulis, String alamatPenulis, char jenisKelaminPenulis) {
        this.namaPenulis = namaPenulis;
        this.alamatPenulis = alamatPenulis;
        this.jenisKelaminPenulis = jenisKelaminPenulis;
    }

    public Penulis(String namaPenulis, String alamatPenulis, char jenisKelaminPenulis, String statusPenulis, int umurPenulis) {
        this.namaPenulis = namaPenulis;
        this.alamatPenulis = alamatPenulis;
        this.jenisKelaminPenulis = jenisKelaminPenulis;
        this.statusPenulis = statusPenulis;
        this.umurPenulis = umurPenulis;
    }

    public void setNamaPenulis(String namaPenulis) {
        this.namaPenulis = namaPenulis;
    }

    public void setAlamatPenulis(String alamatPenulis) {
        this.alamatPenulis = alamatPenulis;
    }

    public void setJenisKelaminPenulis(char jenisKelaminPenulis) {
        this.jenisKelaminPenulis = jenisKelaminPenulis;
    }

    public void setStatusPenulis(String statusPenulis) {
        this.statusPenulis = statusPenulis;
    }

    public void setUmurPenulis(int umurPenulis) {
        this.umurPenulis = umurPenulis;
    }

    public String getNamaPenulis() {
        return namaPenulis;
    }

    public String getAlamatPenulis() {
        return alamatPenulis;
    }

    public char getJenisKelaminPenulis() {
        return jenisKelaminPenulis;
    }

    public String getStatusPenulis() {
        return statusPenulis;
    }

    public int getUmurPenulis() {
        return umurPenulis;
    }

    @Override
    public String toString() {
        return "Penulis{" +
                "namaPenulis='" + namaPenulis + '\'' +
                ", alamatPenulis='" + alamatPenulis + '\'' +
                ", jenisKelaminPenulis=" + jenisKelaminPenulis +
                ", statusPenulis='" + statusPenulis + '\'' +
                ", umurPenulis=" + umurPenulis +
                '}';
    }
}
