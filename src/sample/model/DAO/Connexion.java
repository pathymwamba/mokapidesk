package sample.model.DAO;

import java.sql.*;

public class Connexion {
    private Connection connexion;
    private Statement stmt;

    public Connexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/mokapidesktop";
            String user ="root";
            String pwd ="";
            connexion = DriverManager.getConnection(url, user, pwd);
            System.out.println("Connexion reussi !!");
            stmt = connexion.createStatement();
        }catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }

    public Connection getConnexion() {
        return connexion;
    }

    public void setConnexion(Connection connexion) {
        this.connexion = connexion;
    }

    public Statement getStmt() {
        return stmt;
    }

    public void setStmt(Statement stmt) {
        this.stmt = stmt;
    }

}
