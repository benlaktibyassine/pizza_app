package com.example.pizza.beans;

public class Pizza {
    private int id;
    private String nom;
    private String description;
    private String ingredient;
    private double prix;
    private String durre;

    public int getNbring() {
        return nbring;
    }

    public void setNbring(int nbring) {
        this.nbring = nbring;
    }

    private int image;
    private int nbring;

    public Pizza(String nom,int image,String ingredient,  String durre,double prix, String description,int nbr) {
        this.nom = nom;
        this.description = description;
        this.prix = prix;
        this.durre = durre;
        this.ingredient = ingredient;
        this.nbring=nbr;
        this.image=image;

    }

    public String getDurre() {
        return durre;
    }
    public void setDurre(String durre) {
        this.durre = durre;
    }



    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

}