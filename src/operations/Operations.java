package operations;

public class Operations {
    public static double calcul(double a, double b, char operateur){
        double result=0;
        switch (operateur){
            case ('+'):
                result= a+b;
                break;
            case ('-'):
                result= a-b;
                break;
            case ('*'):
                result= a*b;
                break;
            case ('/'):
                result= a/b;
                break;
            default:
                System.out.println("Invalid operator!");
                break;
        }
        return result;
    }
}
