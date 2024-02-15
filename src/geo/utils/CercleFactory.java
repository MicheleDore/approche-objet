package geo.utils;

import geo.entites.Cercle;
public class CercleFactory {

    public static Cercle creeCercle(String couleur, double rayon){
        Cercle nouveauCercle = new Cercle(couleur, rayon);
        return nouveauCercle;
    }

}
