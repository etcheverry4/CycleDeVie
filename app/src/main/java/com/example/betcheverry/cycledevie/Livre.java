package com.example.betcheverry.cycledevie;

/**
 * Created by BETCHEVERRY on 28/02/2018.
 */

public class Livre {
    private String titre;
    private String auteur;
    private String nombrepage;

    public Livre(String titre, String auteur, String nombrepage){
        this.titre = titre;
        this.auteur = auteur;
        this.nombrepage = nombrepage;
    }

    // Getters
    public String getTitre(){
        return this.titre;
    }

    public String getAuteur(){
        return this.auteur;
    }

    public String getNombrePage(){
        return this.nombrepage;
    }

    // Setteurs
    public void setTitre(String titre) {
        this.titre = titre;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    public void setNombrepage(String nombrepage) {
        this.nombrepage = nombrepage;
    }


    // Affichage
    public String toString(){
        return "Titre : " + this.titre + " \nAuteur : " + this.auteur + " \nNombre de pages : " + this.nombrepage;
    }
}
