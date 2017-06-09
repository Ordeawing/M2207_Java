package fr.ordeawing.package1;

/**
 * Created by ordeawing on 24/05/17.
 */
public class humain {
    private String prenom;
    private String nom;
    private String surnom;

    public humain(String prenom, String nom, String surnom){
        this.prenom = prenom;
        this.nom = nom;
        this.surnom = surnom;
    }

    public humain(String prenom, String nom){
        this.prenom = prenom;
        this.nom = nom;
    }

    @Override
    public String toString(){
        if(surnom != null) return "prenom:"+prenom+" nom:"+nom+" surnom:"+surnom;
        else return "prenom:"+prenom+" nom:"+nom;
    }
    public String getSurnom(){
        return surnom;
    }
    public String getNom(){
        return nom;
    }
    public String getPrenom(){
        return prenom;
    }

    public void setSurnom(String surnom){
        this.surnom = surnom;
    }

}
