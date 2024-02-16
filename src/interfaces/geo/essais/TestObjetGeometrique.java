package interfaces.geo.essais;

import interfaces.geo.Cercle;
import interfaces.geo.ObjetGeometrique;
import interfaces.geo.Rectangle;

public class TestObjetGeometrique {
    public static void main(String[] args) {
        ObjetGeometrique[] tableau = {new Rectangle(6,8), new Cercle(5)};

        for(ObjetGeometrique item: tableau){
            System.out.println(item.surface());
        }
    }
}
