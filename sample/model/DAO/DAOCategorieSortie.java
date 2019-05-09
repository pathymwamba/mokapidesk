package sample.model.DAO;

import sample.model.CategorieSortie;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DAOCategorieSortie extends DAO<CategorieSortie> {

    public DAOCategorieSortie(){
        super();
    }

    @Override
    public boolean create(CategorieSortie categorieSortie) {
        try{
            String requete = "insert into categoriesortie(nom) values('"+categorieSortie.getNom()+"')";
            this.connexion.getStmt().executeUpdate(requete);
            return true;

        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(CategorieSortie categorieSortie) {
        try{
            String requete = "update categoriesortie set nom='"+categorieSortie.getNom()+"' WHERE idcategorie="+categorieSortie.getId();
            this.connexion.getStmt().executeUpdate(requete);
            return true;

        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(CategorieSortie categorieSortie) {
        try{
            String requete = "delete from categoriesortie WHERE idcategorie="+categorieSortie.getId();
            this.connexion.getStmt().executeUpdate(requete);
            return true;

        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public CategorieSortie find(int id) {
        CategorieSortie cats;
        try{
            String requete ="select * from categoriesortie WHERE idcategorie="+id;
            ResultSet result = this.connexion.getStmt().executeQuery(requete);
            if(result.first()){
                cats = new CategorieSortie(Integer.parseInt(result.getString("idcategorie")), result.getString("nom"));
                return cats;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
}
