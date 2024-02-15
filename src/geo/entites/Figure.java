package geo.entites;

public abstract class Figure {

    protected String nom;
    protected String couleur;
    protected int nbAngles;

    public String getNom() {
        return nom;
    }

    public Figure() {
    }

    public Figure(String nom, String couleur, int nbAngles) {
        this.nom = nom;
        this.couleur = couleur;
        this.nbAngles = nbAngles;
    }


    public abstract double calculerPerimetre();

    public abstract  double calculerSurface();

}
