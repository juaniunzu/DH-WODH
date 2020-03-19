package com.company;

import com.company.criatura.Criatura;
import com.company.criatura.Dragon;
import com.company.heroe.Guerrero;
import com.company.heroe.Mago;
import sun.jvm.hotspot.memory.Universe;

public class Main {

    public static void main(String[] args) {

        Guerrero leona = new Guerrero(30.0, "Leona", 1000.0);
        Guerrero tryndamere = new Guerrero(25.0, "Tryndamere", 900.0);
        Guerrero olaf = new Guerrero(40.0, "Olaf", 900.0);
        Mago soraka = new Mago(30.0, "Soraka");
        Mago nami = new Mago(50.0, "Nami");

        Criatura redBuff = new Criatura("Red", 25.0);
        Criatura blueBuff = new Criatura("Blue", 20.0);
        Criatura gromp = new Criatura("Gromp", 18.0);

        Dragon elder = new Dragon("Elder", 150.0);
        Dragon nashor = new Dragon("Baron Nashor", 180.0);

        leona.lucharConCriatura(gromp);
        tryndamere.lucharConCriatura(nashor);
        tryndamere.lucharConCriatura(redBuff);
        nami.resucitarGuerrero(tryndamere);
        soraka.resucitarGuerrero(tryndamere);

        olaf.lucharConCriatura(blueBuff);
        nami.lucharConCriatura(elder);




    }
}
