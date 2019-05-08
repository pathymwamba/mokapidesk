package sample.model.DAO;

import sample.model.Depense;

public class DAODepense extends DAO<Depense> {
    @Override
    public boolean create(Depense depense) {
        return false;
    }

    @Override
    public boolean update(Depense depense) {
        return false;
    }

    @Override
    public boolean delete(Depense depense) {
        return false;
    }

    @Override
    public Depense find(int id) {
        return null;
    }
}
