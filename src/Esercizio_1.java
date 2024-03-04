import java.util.Arrays;

public class Esercizio_1 {
    public static void main(String[] args) {
        System.out.println("Il risultato della moltiplicazione è: " + multi(3, 4));
        System.out.println(concatena("Hello ", 3));
        String[] arrayOfStrings = {"Uno", "Due", "Tre", "Quattro", "Cinque",};
        String arrayPrinted = Arrays.toString(inserisciInArray(arrayOfStrings, "Bobby"));
        System.out.println(arrayPrinted);
    }

    public static int multi(int num1, int num2) {
        return num1 * num2;
    }

    public static String concatena(String word1, int num) {
        return word1 + num;
    }

    public static String[] inserisciInArray(String[] array, String word){

        String[] newArray = new String[6];
        for (int i = 0; i < array.length + 1; i++) {
            if (i < 3) {
                newArray[i] = array[i];
            }
            if (i == 3) {
                newArray[i] = word;
            }
            if (i > 3) {
                newArray[i] = array[i-1];
            }
        }
        return newArray;
    }

}
