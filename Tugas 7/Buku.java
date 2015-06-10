package com.muhajudin.project;

public class Buku {
    private String namaBuku;
    private Double harga;
    private String PenerbitBuku;
    private Penulis createdBy;

    public Buku() {
    }

    public Buku(String namaBuku, Double harga) {
        this.namaBuku = namaBuku;
        this.harga = harga;
    }

    public Buku(String namaBuku, Double harga, String penerbitBuku) {
        this.namaBuku = namaBuku;
        this.harga = harga;
        PenerbitBuku = penerbitBuku;
    }

    public Buku(String namaBuku, Double harga, String penerbitBuku, Penulis createdBy) {
        this.namaBuku = namaBuku;
        this.harga = harga;
        PenerbitBuku = penerbitBuku;
        this.createdBy = createdBy;
    }

    public String getNamaBuku() {
        return namaBuku;
    }

    public Double getHarga() {
        return harga;
    }

    public String getPenerbitBuku() {
        return PenerbitBuku;
    }

    public Penulis getCreatedBy() {
        return createdBy;
    }

    public void setNamaBuku(String namaBuku) {
        this.namaBuku = namaBuku;
    }

    public void setHarga(Double harga) {
        this.harga = harga;
    }

    public void setPenerbitBuku(String penerbitBuku) {
        PenerbitBuku = penerbitBuku;
    }

    public void setCreatedBy(Penulis createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public String toString() {
        return "Buku{" +
                "namaBuku='" + namaBuku + '\'' +
                ", harga=" + harga +
                ", PenerbitBuku='" + PenerbitBuku + '\'' +
                ", createdBy=" + createdBy +
                '}';
    }
}
