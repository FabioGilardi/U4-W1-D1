import java.util.Scanner;

public class Esercizio_2 {
    public static void main(String[] args) {
        System.out.println("Inserisci per 3 volte una parola a scelta");

        Scanner myScanner = new Scanner(System.in);

        String word1 = myScanner.nextLine();
        String word2 = myScanner.nextLine();
        String word3 = myScanner.nextLine();

        System.out.println(word1 + " " + word2 + " " + word3);
        System.out.println(word3 + " " + word2 + " " + word1);
    }


}
