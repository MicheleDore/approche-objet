package listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestListeInt {
    public static void main(String[] args) {
        int[] precurseur = {-1, 5, 7, 3, -2, 4 ,-8 ,-5};
        List<Integer> intList = new ArrayList<>();
        for(int item : precurseur){
            intList.add(item);
        }
        System.out.println("Voici une liste : "+intList +"\nvoici la taille de cette liste : "+ intList.size()+"\net son plus grand élément : "+ Collections.max(intList));
        intList.remove(Collections.min(intList));

        for(int i = 0; i<intList.size(); ++i){
            if (intList.get(i) < 0){
                int negInt= intList.get(i);
                intList.set(i, -negInt);
            }
        }
        System.out.println("Cette liste n'a plus d'entiers négatifs :"+intList);
    }
}
