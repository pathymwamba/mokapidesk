package sample.model;

public class Ressource {
    private int id;
    private String nom;
    private double montant;
    private String date;

    public Ressource(int id, String nom, double montant, String date) {
        this.id = id;
        this.nom = nom;
        this.montant = montant;
        this.date = date;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
