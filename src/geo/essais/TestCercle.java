package geo.essais;

import geo.entites.Cercle;
import geo.utils.Factory;


public class TestCercle {
    public static void main(String[] args) {
        Cercle nouveauCercle = Factory.creeCercle("rouge", 7);
        Affichage.afficheFigure(nouveauCercle);
    }
}
