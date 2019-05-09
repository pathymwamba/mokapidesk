package sample.model.DAO;

public abstract class DAO<T> {
    protected Connexion connexion;
    public DAO(){
        connexion = new Connexion();
    }
    public abstract boolean create(T t);
    public abstract boolean update(T t);
    public abstract boolean delete(T t);
    public abstract T find(int id);
}
