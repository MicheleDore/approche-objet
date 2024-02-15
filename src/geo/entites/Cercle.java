package geo.entites;

public class Cercle extends Figure {
    public double rayon;

    public Cercle(double rayon) {
        super();
        this.rayon = rayon;
    }

    public Cercle( String couleur, double rayon) {
        super("Cercle", couleur, 0);
        this.rayon = rayon;
    }

    public double calculerPerimetre(){
        return (rayon*2)* 3.141592653589793;
    }

    public double calculerSurface(){
        return rayon * rayon * 3.141592653589793;
    }

}
