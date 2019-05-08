package sample.model;
//Depense qu'on prevois d'effectuer au courant de l'exercice
public class Sortie {
    private int id = 0;
    private int idCategorieSortie;
    private int idExercice;
    private double montant;

    public Sortie(int id, int idCategorieSortie, int idExercice, double montant) {
        this.id = id;
        this.idCategorieSortie = idCategorieSortie;
        this.idExercice = idExercice;
        this.montant = montant;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdCategorieSortie() {
        return idCategorieSortie;
    }

    public void setIdCategorieSortie(int idCategorieSortie) {
        this.idCategorieSortie = idCategorieSortie;
    }

    public int getIdExercice() {
        return idExercice;
    }

    public void setIdExercice(int idExercice) {
        this.idExercice = idExercice;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }
}
