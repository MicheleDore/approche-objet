package essais;
import entites.AdressePostale;
public class TestAdressePostale {
    public static void main(String[] args) {
        AdressePostale ap1 = new AdressePostale();
        ap1.numeroRue = 4;
        ap1.libelleRue = "Marue";
        ap1.codePostal = 44300;
        ap1.ville = "Nantes";

        AdressePostale ap2 = new AdressePostale();
        ap2.numeroRue = 4;
        ap2.libelleRue = "Sarue";
        ap2.codePostal = 44300;
        ap2.ville = "Nantes";


    }
}
