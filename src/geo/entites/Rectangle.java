package geo.entites;

public class Rectangle extends Figure {

    protected double hauteur;

    protected double longueur;


    public Rectangle(String couleur, double hauteur, double longueur) {
        this("Rectangle", couleur, hauteur, longueur);
    }

    public Rectangle(String nom, String couleur, double hauteur, double longueur) {
        super(nom, couleur, 4);
        this.hauteur = hauteur;
        this.longueur = longueur;
    }

    @Override
    public double calculerPerimetre() {
        return (hauteur + longueur) * 2;
    }

    @Override
    public double calculerSurface() {
        return longueur * hauteur;
    }
}
