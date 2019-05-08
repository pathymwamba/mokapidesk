package sample.model.DAO;

import sample.model.Exercice;

public class DAOExercice extends DAO<Exercice> {
    @Override
    public boolean create(Exercice exercice) {
        return false;
    }

    @Override
    public boolean update(Exercice exercice) {
        return false;
    }

    @Override
    public boolean delete(Exercice exercice) {
        return false;
    }

    @Override
    public Exercice find(int id) {
        return null;
    }
}
