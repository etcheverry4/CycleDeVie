package com.example.betcheverry.cycledevie;

/**
 * Created by METCHEVERRY on 28/02/2018.
 */

public class Livre {

    private String titre;
    private String auteur;
    private int nombrepages;

    public Livre(){}

    public Livre(String titre, String auteur, int nombrepages) {
        this.titre = titre;
        this.auteur = auteur;
        this.nombrepages = nombrepages;
    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public int getNombrePages() {
        return nombrepages;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setNombrePages(int nombrepages) {
        this.nombrepages = nombrepages;
    }

    @Override
    public String toString(){
        return "Titre : " + titre + " \nAuteur : " + auteur + " \nNombre de pages : " + nombrepages;
    }
}
