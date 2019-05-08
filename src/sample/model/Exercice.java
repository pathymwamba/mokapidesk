package sample.model;

public class Exercice {
    private int id = 0;
    private String datecreation;
    private String datedebut;
    private String datefin;
    private double montantInitial;

    public Exercice(int id, String datecreation, String datedebut, String datefin, double montantInitial) {
        this.id = id;
        this.datecreation = datecreation;
        this.datedebut = datedebut;
        this.datefin = datefin;
        this.montantInitial = montantInitial;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDatecreation() {
        return datecreation;
    }

    public void setDatecreation(String datecreation) {
        this.datecreation = datecreation;
    }

    public String getDatedebut() {
        return datedebut;
    }

    public void setDatedebut(String datedebut) {
        this.datedebut = datedebut;
    }

    public String getDatefin() {
        return datefin;
    }

    public void setDatefin(String datefin) {
        this.datefin = datefin;
    }

    public double getMontantInitial() {
        return montantInitial;
    }

    public void setMontantInitial(double montantInitial) {
        this.montantInitial = montantInitial;
    }
}
