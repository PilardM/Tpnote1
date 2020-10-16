/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpnote1_maxime_pilard;

/**
 *
 * @author maxim
 */
class Deposant extends Personne {
    private String civilite;
    private String adresseMessagerie;
    private Adresse adresse;
    
    
public Deposant ( String nom, String prenom, Adresse adresse) {
super(nom,prenom);
this.nom = nom;
this.prenom = prenom;
this.adresse = adresse;
}
    
public void setAdresseMessagerie(String adresseMessagerie) {
this.adresseMessagerie = adresseMessagerie;
}
public void setCivilite(String civilite) {
this.civilite = civilite;
}

public Adresse getAdress() {
return this.adresse;
}
  
public void setAdresse(Adresse adresse) {
this.adresse = adresse;
}

    public String toString () {
return super.toString() + " " + 
       this.civilite + " " + 
       this.adresseMessagerie+ " " +
       this.adresse.numero + " rue/avenue " + 
       this.adresse.voie + ", " + 
       this.adresse.codePostal + ", " + 
       this.adresse.ville ;
}
}
