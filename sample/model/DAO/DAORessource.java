package sample.model.DAO;

import javafx.beans.binding.DoubleBinding;
import sample.model.Ressource;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DAORessource extends DAO<Ressource> {

    public DAORessource(){
        super();
    }

    @Override
    public boolean create(Ressource ressource) {
        try{
            String requete = "insert into ressource (nom, montant, date) values('"+ressource.getNom()+"','"+ressource.getMontant()+"','"+ressource.getDate()+"')";
            this.connexion.getStmt().executeUpdate(requete);
            return true;

        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(Ressource ressource) {
        try{
            String requete = "update ressource set nom='"+ressource.getNom()+"',montant='"+ressource.getMontant()+"',date='"+ressource.getDate()+"'WHERE id="+ressource.getId();
            this.connexion.getStmt().executeUpdate(requete);
            return true;

        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(Ressource ressource) {
        try{
            String requete = "delete from ressource WHERE id="+ressource.getId();
            this.connexion.getStmt().executeUpdate(requete);
            return true;

        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Ressource find(int id) {
        Ressource res;
        try{
            String requete = "select * from ressource WHERE id="+id;
            ResultSet result = this.connexion.getStmt().executeQuery(requete);
            if(result.first()){
                res = new Ressource(Integer.parseInt(result.getString("id")), result.getString("nom"), Double.parseDouble(result.getString("montant")), result.getString("date"));
                return res;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
}
