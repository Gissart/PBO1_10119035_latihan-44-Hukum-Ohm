package com.tugasPBO;
import java.util.Scanner;
/*
* Nama      : Argya Aulia Fauzandika
* NIM       : 10119035
* Kelas     : PBO1/ IF-1
* Deskripsi : menghitung hasil tegangan sesuai dengan hukum ohm
* */

public class Main {
    public static void main(String[] args){
        Baterai btr = new Baterai(3, 12);
        System.out.println("Kuat Arus : "+btr.getKuatArus() +" ampere");
        System.out.println("Hambatan : "+btr.getHambatan() +" ohm");
        System.out.println("Hasil Tegangan :" +btr.hitungTegangan()+ " volt");


    }
}
