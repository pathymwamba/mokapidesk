package sample.model.DAO;

import sample.model.Sortie;

public class DAOSortie extends DAO<Sortie> {
    @Override
    public boolean create(Sortie sortie) {
        return false;
    }

    @Override
    public boolean update(Sortie sortie) {
        return false;
    }

    @Override
    public boolean delete(Sortie sortie) {
        return false;
    }

    @Override
    public Sortie find(int id) {
        return null;
    }
}
