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
class Adresse {
    private String numero;
    private String voie;
    private String ville;
    private String codePostal;
    private String bp;
    private String lieuDit;
    private String cedex;
    
public Adresse() {		
this.numero=" ";
this.voie = " ";
this.ville = " ";
this.codePostal = " ";
this.bp = " ";
this.lieuDit = " ";
this.cedex = " ";		
}    

public Adresse (String numero, String voie, String ville, String codePostal, String bp, String lieuDit, String cedex) {
    this.numero = numero;
    this.voie = voie;
    this.ville = ville;
    this.codePostal = codePostal;
    this.bp = bp;
    this.lieuDit = lieuDit;
    this.cedex = cedex;
}

 private boolean validate (String chaine, Integer taille) {
 if(taille == chaine.length()){  // Vérifie la taille et renvoie une chaîne tronquée
    return true;// si la taille est supérieure à taille
}else{
    return false;
}
    
}
 
	public String getAdress() {	
return "Numero : " +this.numero + 
       " Voie : " + this.voie +
       " Ville : "+ this.ville + 
       " code postal : " + this.codePostal + 
       " Boîte postal : " + this.bp + 
       " Lieu dit : " + this.lieuDit + 
       " Cedex : " + this.cedex;
}
 
}
