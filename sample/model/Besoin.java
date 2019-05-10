package sample.model;

public class Besoin {
    private int id =0;
    private String nom;
    private String priorite;
    private String frequence;

    public Besoin(int id, String nom, String priorite, String frequence) {
        this.id = id;
        this.nom = nom;
        this.priorite = priorite;
        this.frequence = frequence;
    }

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

    public String getPriorite() {
        return priorite;
    }

    public void setPriorite(String priorite) {
        this.priorite = priorite;
    }

    public String getFrequence() {
        return frequence;
    }

    public void setFrequence(String frequence) {
        this.frequence = frequence;
    }
}
