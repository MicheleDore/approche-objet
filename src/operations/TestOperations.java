package operations;

import static operations.Operations.*;

public class TestOperations {
    public static void main(String[] args) {
        char[] operateurs = {'-','+','*','/'};
        for (char operateur : operateurs) {
            double result = calcul(7, 8, operateur);
            System.out.println("Result: " + result);
        }
    }

}
