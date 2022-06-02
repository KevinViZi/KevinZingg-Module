import java.util.Scanner;  // Import the Scanner class

public class Harasse {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Anzahl Flaschen? -> ");
        String anzahlFlaschen = myObj.nextLine();  // Read user input
        int anzahlFlaschenInt=Integer.parseInt(anzahlFlaschen);

        int anzahlHarasseInt= 0;

        while (true) {
            if (anzahlFlaschenInt == 0) {
                break;
            }
            System.out.println("Harrass Berechnung:" +
                    "\n-------------------");
            System.out.println("Ihre Anzahl Flaschen: " + anzahlFlaschenInt);  // Output user input

            if (anzahlFlaschenInt <= 0) {
                System.out.println("Sie brauchen keinen Harass");
            }

            while (anzahlFlaschenInt >= 6) {
                anzahlHarasseInt++;
                anzahlFlaschenInt -= 6;
            }

            System.out.println("Ihre Anzahl benötigte Harassen: " + anzahlHarasseInt);  // Output user input
        }

    }
}