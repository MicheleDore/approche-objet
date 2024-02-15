package geo.entites;

public class Rectangle extends Figure {

    protected double hauteur;

    protected double longueur;

    public int getNbAngles() {
        return nbAngles;
    }

    public Rectangle(String nom, String couleur, int nbAngles, double hauteur, double longueur) {
        super("Rectangle", couleur, 4);
        this.hauteur = hauteur;
        this.longueur = longueur;
    }

    @Override
    public double calculerPerimetre() {
        return (hauteur+longueur)*2;
    }

    @Override
    public double calculerSurface() {
        return longueur*hauteur;
    }
}
