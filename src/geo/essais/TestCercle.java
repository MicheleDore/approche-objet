package geo.essais;

import geo.entites.Cercle;
import geo.utils.CercleFactory;


public class TestCercle {
    public static void main(String[] args) {
        Cercle nouveauCercle = CercleFactory.creeCercle("rouge", 7);
        nouveauCercle.afficheFigure();
    }
}
