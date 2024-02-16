package interfaces.geo;

public class Rectangle implements ObjetGeometrique{
    double longueur;
    double largeur;

    @Override
    public double perimetre() {
        return (largeur+longueur)*2;
    }

    @Override
    public double surface() {
        return (largeur*longueur);
    }

    public Rectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }
}
