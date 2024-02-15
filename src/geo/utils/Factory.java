package geo.utils;

import geo.entites.Carre;
import geo.entites.Cercle;
import geo.entites.Rectangle;

public class Factory {

    public static Cercle creeCercle(String couleur, double rayon){
        return new Cercle(couleur, rayon);
    }

    public static Rectangle creeRectangle(String couleur, double hauteur, double longueur){
        return new Rectangle(couleur, hauteur, longueur);
    }

    public static Carre creeCarre(String couleur, double cote){
        return new Carre(couleur, cote);
    }

}
