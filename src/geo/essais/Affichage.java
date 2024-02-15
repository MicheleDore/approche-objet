package geo.essais;

import geo.entites.Figure;

public class Affichage {
    public static void afficheFigure(Figure figure){
        System.out.printf("Le perimetre du %s est %s et la surface est %s ", figure.getNom(),  figure.calculerPerimetre(), figure.calculerSurface());
    }
}
