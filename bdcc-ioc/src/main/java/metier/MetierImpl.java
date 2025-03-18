package metier;

import dao.DaoImpl;
import dao.IDao;

public class MetierImpl implements IMetier {
    private IDao dao; // Couplage faible

    public MetierImpl(DaoImpl dao) {
        this.dao = dao;
    }


    @Override
    public double calcul() {
        double temp = dao.getData();
        double res = temp*23;
        return res;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}

