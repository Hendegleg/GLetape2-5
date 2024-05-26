package com.example.prototype;
import java.util.Date;
class Utilisateur implements Cloneable {
    private int id;
    private String nom;
    private String prenom;
    private String role;
    private String email;
    private String motDePasse;
    private String numeroDeTelephone;
    private String statut;
    private String image;
    private Date dateInscription;
    private String adresse;
    private int paiement;

    
    public Utilisateur clone() {
        Utilisateur utilisateurClone = new Utilisateur();
        utilisateurClone.setId(this.id);
        utilisateurClone.setNom(this.nom);
        utilisateurClone.setPrenom(this.prenom);
        utilisateurClone.setRole(this.role);
        utilisateurClone.setEmail(this.email);
        utilisateurClone.setMotDePasse(this.motDePasse);
        utilisateurClone.setNumeroDeTelephone(this.numeroDeTelephone);
        utilisateurClone.setStatut(this.statut);
        utilisateurClone.setImage(this.image);
        utilisateurClone.setDateInscription(this.dateInscription != null ? (Date) this.dateInscription.clone() : null);
        utilisateurClone.setAdresse(this.adresse);
        utilisateurClone.setPaiement(this.paiement);
        return utilisateurClone;
    }

    // Getters et setters
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public void setMotDePasse(String motDePasse) {
        this.motDePasse = motDePasse;
    }

    public String getNumeroDeTelephone() {
        return numeroDeTelephone;
    }

    public void setNumeroDeTelephone(String numeroDeTelephone) {
        this.numeroDeTelephone = numeroDeTelephone;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Date getDateInscription() {
        return dateInscription;
    }

    public void setDateInscription(Date dateInscription) {
        this.dateInscription = dateInscription;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getPaiement() {
        return paiement;
    }

    public void setPaiement(int paiement) {
        this.paiement = paiement;
    }
}


public class PrototypeTest {
    public static void main(String[] args) {

        Utilisateur utilisateurOriginal = new Utilisateur();
        utilisateurOriginal.setId(1);
        utilisateurOriginal.setNom("Doe");
        utilisateurOriginal.setPrenom("John");
        utilisateurOriginal.setRole("Utilisateur standard");
        utilisateurOriginal.setEmail("john.doe@example.com");
        utilisateurOriginal.setMotDePasse("mdp123");
        utilisateurOriginal.setNumeroDeTelephone("1234567890");
        utilisateurOriginal.setStatut("Actif");
        utilisateurOriginal.setImage("profile.jpg");
        utilisateurOriginal.setDateInscription(new Date());
        utilisateurOriginal.setAdresse("123 Street, City, Country");
        utilisateurOriginal.setPaiement(100);

    
        Utilisateur utilisateurClone = (Utilisateur) utilisateurOriginal.clone();

       
        System.out.println("Informations de l'utilisateur original :");
        System.out.println("Nom : " + utilisateurOriginal.getNom());
        System.out.println("Prénom : " + utilisateurOriginal.getPrenom());
        System.out.println("Email : " + utilisateurOriginal.getEmail());

        
        utilisateurClone.setNom("Smith");
        utilisateurClone.setPrenom("Jane");
        utilisateurClone.setEmail("jane.smith@example.com");

        
        
        System.out.println("Nom : " + utilisateurClone.getNom());
        System.out.println("Prénom : " + utilisateurClone.getPrenom());
        System.out.println("Email : " + utilisateurClone.getEmail());

     
       
        System.out.println("Nom : " + utilisateurOriginal.getNom());
        System.out.println("Prénom : " + utilisateurOriginal.getPrenom());
        System.out.println("Email : " + utilisateurOriginal.getEmail());
        
    }}
        
