package com.tugasPBO;

public class Baterai {
    private float kuatArus, hambatan;

    public Baterai() {
        System.out.println("Kuat arus yang mengalir pada suatu kawat penghantar akan \n" +
                "dengan beda potensial pada ujung-ujung kawat penghantar tersebut\n asalkan" +
                "suhu kawat dijaga konstan");

    }

    public Baterai(float kuatArus, float hambatan){
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
    }

    public float getKuatArus() {
        return kuatArus;
    }

    public float getHambatan(){
        return hambatan;
    }

    public float hitungTegangan(){
        return kuatArus * hambatan;
    }
}
