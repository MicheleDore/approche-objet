package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestListeString {
    public static void main(String[] args) {
        String[] precurseur = {"Nice","Carcassonne","Narbonne","Lyon","Foix","Pau","Marseille","Tarbes"};
        List<String> stringList = new ArrayList<>(Arrays.asList(precurseur));
        System.out.println(stringList);

        int grandNom = stringList.getFirst().length();
        String grandeVille = "";
        for(int i=0; i<stringList.size(); i++){
            String ville = stringList.get(i);
            if(ville.length() > grandNom){
                grandeVille= ville;
                grandNom=ville.length();
            }
            stringList.set(i, ville.toUpperCase());
        }
        System.out.println(grandeVille);
    }

}
