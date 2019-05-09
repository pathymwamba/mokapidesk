package sample.model.DAO;

import sample.model.Sortie;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOSortie extends DAO<Sortie> {

    public DAOSortie(){
        super();
    }
    @Override
    public boolean create(Sortie sortie) {
        try{
            String query = "insert into sortie (idcategorie, idexercice, montant) values('"+sortie.getIdCategorieSortie()+"','"+sortie.getIdExercice()+"','"+sortie.getMontant()+"')";
            this.connexion.getStmt().executeUpdate(query);
            return true;
        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(Sortie sortie) {
        try{
            String query = "update sortie set idcategorie='"+
                    sortie.getIdCategorieSortie()+"',idexercice='"+
                    sortie.getIdExercice()+"',montant='"+sortie.getMontant()+"' WHERE id="+sortie.getId();
            this.connexion.getStmt().executeUpdate(query);
            return true;

        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(Sortie sortie) {
        try{
            String query = "delete from sortie WHERE id="+sortie.getId();
            this.connexion.getStmt().executeUpdate(query);
            return true;

        }catch(SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Sortie find(int id) {
        Sortie sortie;
        try{
            String query = "select * from sortie WHERE id="+id;
            ResultSet result = this.connexion.getStmt().executeQuery(query);
            if(result.first()){
                sortie = new Sortie(Integer.parseInt(result.getString("id")), Integer.parseInt(result.getString("idcategorie")), Integer.parseInt(result.getString("idexercice")), Double.parseDouble(result.getString("montant")));
                return sortie;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

}
