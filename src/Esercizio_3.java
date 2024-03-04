public class Esercizio_3 {
    public static void main(String[] args) {
        System.out.println("Il perimetro del rettangolo è: " + perimetroRettangolo(5, 6));
        System.out.println("Il resto della divisione è: " + pariDispari(5));
        System.out.println("L'area del triangolo è: " + perimetroTriangolo(15, 20, 25));
    }

    public static double perimetroRettangolo(double b, double h) {
        return (b + h) * 2;
    }

    public static int pariDispari(int num1) {
        return num1 % 2;
    }

    public static double perimetroTriangolo(double a, double b, double c){
        double semiperimetro = (a + b + c)/2;
        return Math.sqrt(semiperimetro * (semiperimetro-a) * (semiperimetro-b) * (semiperimetro-c));
    }
}
