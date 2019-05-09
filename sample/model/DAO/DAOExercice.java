package sample.model.DAO;

import sample.model.Exercice;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOExercice extends DAO<Exercice> {

    public DAOExercice(){
        super();
    }
    @Override
    public boolean create(Exercice exercice) {
        try{
            String requete = "insert into exercice (date_debut, date_fin, montant_initial, date_creation) values('"+
                    exercice.getDatedebut()+"','"+exercice.getDatefin()+"','"+exercice.getMontantInitial()+"','"+exercice.getDatecreation()+"')";
            this.connexion.getStmt().executeUpdate(requete);
            return true;
        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(Exercice exercice) {
        try{
            String requete = "update exercice set date_debut='"+
                    exercice.getDatedebut()+"',date_fin='"+exercice.getDatefin()+"',montant_initial='"+
                    exercice.getMontantInitial()+"',date_creation='"+exercice.getDatecreation()+"' WHERE id ="+exercice.getId();
            this.connexion.getStmt().executeUpdate(requete);
            return true;
        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(Exercice exercice) {
        try{
            String requete = "delete from exercice WHERE id="+exercice.getId();
            this.connexion.getStmt().executeUpdate(requete);
            return true;

        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Exercice find(int id) {
        Exercice exercice;
        try{
            String requete = "select * from exercice where id="+id;
            ResultSet resultat = this.connexion.getStmt().executeQuery(requete);
            if(resultat.first()){
                exercice = new Exercice(Integer.parseInt(resultat.getString("id")), resultat.getString("date_debut"), resultat.getString("date_fin"), Double.parseDouble(resultat.getString("montant_initial")), resultat.getString("date_creation"));
                return exercice;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
}
