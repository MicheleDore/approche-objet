package geo.essais;

import geo.entites.Rectangle;
import geo.utils.Factory;

public class TestRectangle {
    public static void main(String[] args) {
            Rectangle nouveauRectangle = Factory.creeRectangle("rouge", 7, 4);
            Affichage.afficheFigure(nouveauRectangle);
    }
}
