package sample.model.DAO;

import sample.model.Besoin;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOBesoin extends DAO<Besoin> {

    public DAOBesoin(){
        super();
    }

    @Override
    public boolean create(Besoin besoin) {
        try{
            String requete = "insert into besoin(nom, priorite, frequence) values('"+ besoin.getNom()+"','"+besoin.getPriorite()+"','"+besoin.getFrequence()+"')";
            this.connexion.getStmt().executeUpdate(requete);
            return true;

        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(Besoin besoin) {
        try{
            String requete = "update besoin set nom='"+ besoin.getNom()+"',priorite='"+
                    besoin.getPriorite()+"',frequence='"+besoin.getFrequence()+"' WHERE idbesoin="+ besoin.getId();
            this.connexion.getStmt().executeUpdate(requete);
            return true;

        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(Besoin besoin) {
        try{
            String requete = "delete from besoin WHERE idbesoin="+ besoin.getId();
            this.connexion.getStmt().executeUpdate(requete);
            return true;

        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Besoin find(int id) {
        Besoin cats;
        try{
            String requete ="select * from besoin WHERE idbesoin="+id;
            ResultSet result = this.connexion.getStmt().executeQuery(requete);
            if(result.first()){
                cats = new Besoin(Integer.parseInt(result.getString("idbesoin")), result.getString("nom"), result.getString("priorite"), result.getString("frequence"));
                return cats;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

}
