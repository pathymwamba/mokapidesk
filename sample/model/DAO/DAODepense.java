package sample.model.DAO;

import sample.model.Depense;

import java.sql.ResultSet;
import java.sql.SQLException;
//Depense = Action budgetaire
public class DAODepense extends DAO<Depense> {
    public DAODepense(){
        super();
    }
    @Override
    public boolean create(Depense depense) {
        try{
            String requete = "insert into depense(id_sortie, montant_utilise, motif, date_creation, etat) values('"+
                    depense.getIdSortie()+"','"+depense.getMontant_utilise()+"','"+depense.getMotif()+"','"+depense.getDate()+"','"+depense.getEtat()+"')";
            this.connexion.getStmt().executeUpdate(requete);
            return true;

        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(Depense depense) {
        try{
            String requete = "update depense set id_sortie='"+
                    depense.getIdSortie()+"',montant_utilise='"+depense.getMontant_utilise()+"',motif='"+
                    depense.getMotif()+"',date_creation='"+depense.getDate()+"',etat='"+depense.getEtat()+"'WHERE id="+depense.getId();
            this.connexion.getStmt().executeUpdate(requete);
            return true;

        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean delete(Depense depense) {
        try{
            String requete = "delete from depense WHERE id ="+depense.getId();
            this.connexion.getStmt().executeUpdate(requete);
            return true;

        }catch (SQLException e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Depense find(int id) {
        Depense depense;
        try{
            String requete = "select * from depense WHERE id="+id;
            ResultSet result = this.connexion.getStmt().executeQuery(requete);
            if(result.first()){
                depense = new Depense(Integer.parseInt(result.getString("id")), Integer.parseInt(result.getString("id_sortie")), Double.parseDouble(result.getString("montant_utilise")), result.getString("motif"), result.getString("date_creation"), Integer.parseInt(result.getString("etat")));
                return depense;
            }
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args){
        DAODepense dep = new DAODepense();
        Depense d = new Depense(1, 2, 200,"appelle", "2019-03-02", 0 );
        if(dep.delete(d)){
            System.out.println(" OK");
        }else{
            System.out.println(" NONONONONON");
        }
    }
}
