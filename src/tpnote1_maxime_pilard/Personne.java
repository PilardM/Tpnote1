/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpnote1_maxime_pilard;

public abstract class Personne
{
private String nom;
private String prenom;

public Personne(String nom, String prenom)
{
this.nom = validate(nom, 50);
this.prenom = validate(prenom, 30);
}
private String validate (String chaine, Integer taille)
{ if(chaine.length()<= taille){  // Vérifie la taille et renvoie une chaîne tronquée
    return chaine;// si la taille est supérieure à taille
}else{
    chaine = chaine.substring(0, taille);
    return chaine;
}
}


public String toString() {
return this.nom + " " + this.prenom; }
}

    
