package interfaces.geo;

public class Cercle implements ObjetGeometrique {
    double rayon;

    public Cercle(double rayon) {
        this.rayon = rayon;
    }

    @Override
    public double perimetre() {
        return rayon*2* 3.141592653589793;
    }

    @Override
    public double surface() {
        return rayon*rayon*3.141592653589793;
    }
}
