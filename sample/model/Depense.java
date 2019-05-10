package sample.model;

//Actions ou depenses
public class Depense {
    private int id = 0;
    private int idSortie;
    private double montant_utilise;
    private String motif;
    private String date;
    private int etat = 0;

    public Depense(int id, int idSortie, double montant_utilise, String motif, String date, int etat) {
        this.id = id;
        this.idSortie = idSortie;
        this.montant_utilise = montant_utilise;
        this.motif = motif;
        this.date = date;
        this.etat = etat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdSortie() {
        return idSortie;
    }

    public void setIdSortie(int idSortie) {
        this.idSortie = idSortie;
    }

    public double getMontant_utilise() {
        return montant_utilise;
    }

    public void setMontant_utilise(double montant_utilise) {
        this.montant_utilise = montant_utilise;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getEtat() {
        return etat;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }
}
