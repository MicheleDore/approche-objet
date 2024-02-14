package entites;
public class Personne {
    public String nom;
    public String prenom;
    public AdressePostale adresse;

    public Personne(String nom, String prenom, AdressePostale adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }

    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;

    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public AdressePostale getAdresse() {
        return adresse;
    }

    public void setNom(String nom) {
        this.nom = nom.toUpperCase();
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom.toUpperCase();
    }

    public void setAdresse(AdressePostale adresse) {
        this.adresse = adresse;
        this.adresse.ville = adresse.ville.toUpperCase();
    }

    public void printNom(){
        setNom(nom);
        System.out.println(getNom()+" "+getPrenom());
    }

}
