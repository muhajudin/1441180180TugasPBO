package com.nasabah.project;

/**
 * Created by Muhajudin on 17/06/2015.
 */
public class Rekening {

    private Double saldo;
    private Double hasil;

    public Rekening(Double saldo) {
        this.saldo = saldo;
    }

    public void tarik(Double tarik) {
        this.saldo = saldo - tarik;
    }

    public void setor(Double setor){
        this.saldo = saldo + setor;

    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Rekening{" +
                "saldo=" + saldo +
                '}';
    }
    //tarik saldo sebesar 10 juta
    //tampilkan saldo sekarang
    //setor saldo sebesar 5 juta
    //tampilkan saldo sekarang
}
