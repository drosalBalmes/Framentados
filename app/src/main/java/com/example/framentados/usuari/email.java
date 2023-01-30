package com.example.framentados.usuari;

import java.io.Serializable;

public class email implements Serializable {
    public String nom;

    public String gmail;

    public int img;

    public String missatge = "Otra teoría interesante va ligada al supuesto sueño de Luffy (que compartiría con Joy Boy y Roger)\n" +
            "Joy Boy habría ideado un plan maestro para destruir la Red Line a través de las Armas Ancestrales y con el objetivo de unificar todos los mares\n" +
            "Tras eso montaría la mayor fiesta de la historia de la humanidad, reuniendo en un mismo lugar a seres de todas las razas con el único objetivo de beber, cantar y reír\n" +
            "Además si la Red Line desapareciese sucederían cosas que tendrían mucho sentido: nacería el All Blue (el sueño de Sanji), los Gyojin regresarían a la superficie con el Noah porque su reino quedaría arrasado, el Gobierno Mundial caería derrotado...\n" +
            "Roger descubrió este plan en Laugh Tale y se rió a carcajadas al parecerle una idea maravillosa, pero por desgracia él no pudo llevarla a cabo por \"llegar demasiado pronto\" y por la enfermedad que iba a acabar con su vida\n";

    public email(String nom, String gmail, int img) {
        this.nom = nom;
        this.gmail = gmail;
        this.img = img;
    }

    public email(String gmail) {
        this.gmail = gmail;
    }

    public email() {
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getMissatge() {
        return missatge;
    }

    public void setMissatge(String missatge) {
        this.missatge = missatge;
    }
}
