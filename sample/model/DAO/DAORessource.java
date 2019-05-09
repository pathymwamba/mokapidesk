package sample.model.DAO;

import sample.model.Ressource;

public class DAORessource extends DAO<Ressource> {
    @Override
    public boolean create(Ressource ressource) {
        return false;
    }

    @Override
    public boolean update(Ressource ressource) {
        return false;
    }

    @Override
    public boolean delete(Ressource ressource) {
        return false;
    }

    @Override
    public Ressource find(int id) {
        return null;
    }
}
