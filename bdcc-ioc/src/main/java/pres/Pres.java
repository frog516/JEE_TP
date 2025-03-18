package pres;

import dao.DaoImpl;
import metier.MetierImpl;

public class Pres {
    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl();  // Instanciation de DaoImpl
        MetierImpl metier = new MetierImpl(dao); // Injection manuelle
        System.out.println("RES = " + metier.calcul());
    }
}
