/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpnote1_maxime_pilard;

import java.util.regex.Pattern;

class Architecte extends Personne {
    private String conseilRegional;
    private boolean inscriptionOrdre;
    private Adresse adresse;
    private String telephone;
public Architecte(String nom, String prenom, String conseilRegional, boolean inscriptionOrdre, Adresse adresse, String telephone){
super(nom, prenom);
this.conseilRegional = conseilRegional;
this.inscriptionOrdre = inscriptionOrdre;
this.adresse = adresse;
if (telephoneValide(telephone)){ 
    this.telephone = telephone; 
}else{ 
    this.telephone = ""; 
}
Maj_conseilRegional();
}
public boolean telephoneValide(String telephone){
if(telephone.length() == 14 && Pattern.matches("[0-9]{2}[.][0-9]{2}[.][0-9]{2}[.][0-9]{2}[.][0-9]{2}",telephone) ){
return true;
}else{
return false;
}
}
public boolean Maj_conseilRegional() {
if(conseilRegional == null){
    return false;
}else{
    return true;
}
}

public String getConseilRegional(){
return this.conseilRegional;	  
}

public void SetConseilRegional(String conseilRegional) {
this.conseilRegional = conseilRegional;
}
  
public boolean getInscriptionOrdre() {
return this.inscriptionOrdre;
}
  
public void setInscriptionOrdre(boolean inscriptionOrdre) {
this.inscriptionOrdre = inscriptionOrdre;
}
  
public Adresse getAdress() {
return this.adresse;
}
  
public void setAdresse(Adresse adresse) {
this.adresse = adresse;
}

public String getTelephone() {
return this.telephone;  
}
  
public void setTelephone(String telephone) {
this.telephone = telephone;
}
// renvoie une chaine contenant le nom, le prenom, le conseil regional et
// le numero de telephone de l'architecte ainsi que la mention "inscrit"
// s'il est inscrit au conseil de l'ordre ou "non inscrit" dans le cas contraire

public String toString () {
String chaine = "";
chaine = this.nom + " " + this.prenom + " " + this.conseilRegional + " ";
if (this.inscriptionOrdre) 
    chaine = chaine + "inscrit";
else 
    chaine = chaine + "non inscrit";
chaine = chaine + " " + this.telephone;
return chaine;
}
}