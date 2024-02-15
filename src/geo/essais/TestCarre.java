package geo.essais;

import geo.entites.Carre;
import geo.utils.Factory;

public class TestCarre {
    public static void main(String[] args) {
            Carre nouveauCarre = Factory.creeCarre("rouge", 7);
            Affichage.afficheFigure(nouveauCarre);
        }
}
