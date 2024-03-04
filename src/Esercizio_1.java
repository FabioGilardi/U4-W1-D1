

public class Esercizio_1 {
    public static void main(String[] args) {
        System.out.println("Il risultato della moltiplicazione è: " + multi(3, 4));
        String prova = concatena("Hello", 3);
        System.out.println(prova);
    }

    public static int multi(int num1, int num2) {
        return num1 * num2;
    }

    public static String concatena(String word1, int num) {
        return word1 + num;
    }

}
