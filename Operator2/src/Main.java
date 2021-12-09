// Defines package

// Imports libraries

import static java.lang.System.*;   // System-IO Library for abbriviation purpose to static functions
import static java.lang.Math.*;     // Mathematic Library for abbriviation purpose to static functions

import java.util.*;                 // Random is part of this library

// Imports Input functions
//import static Input.*;       // All the functions can be used now!

//Every program must be placed in a class ...
public class Main {

    // Our main function which runs the program12
    public static void main(String[] args) {

        while (true) {
            // Title
            System.out.println("Operator:");
            out.println();

            // Input
            double dblX = Input.inputDouble("Geben Sie die ertse Zahl ein: ");
            double dblY = Input.inputDouble("Geben Sie die zweite Zahl ein: ");


            //Calculations
            double plus = (dblX + dblY);
            double minus1 = (dblX - dblY);
            double minus2 = (dblY - dblX);
            double times = (dblX * dblY);
            double divide1 = (dblX / dblY);
            double divide2 = (dblY % dblX);

            //output
            out.println("Das Resultat von 1.Zahl + 2.Zahl ist: " + plus);
            out.println("Das Resultat von 1.Zahl - 2.Zahl ist: " + minus1);
            out.println("Das Resultat von 2.Zahl - 1.Zahl ist: " + minus2);
            out.println("Das Resultat von 1.Zahl * 2.Zahl ist: " + times);
            out.println("Das Resultat von 1.Zahl geteilt durch 2.Zahl ist: " + divide1);
            out.println("Das Resultat von 2.Zahl geteilt durch 1.Zahl ist: " + divide2);


            // Input
            double dblZ = Input.inputDouble("Geben Sie eine dritte Zahl ein: ");

            //output
            out.println("Das Resultat von 1.Zahl + 2.Zahl ist: " + (plus += dblZ));
            out.println("Das Resultat von 1.Zahl - 2.Zahl ist: " + (minus1 -= dblZ));
            out.println("Das Resultat von 2.Zahl - 1.Zahl ist: " + (minus2 -= dblZ));
            out.println("Das Resultat von 1.Zahl * 2.Zahl ist: " + (times *= dblZ));
            out.println("Das Resultat von 1.Zahl geteilt durch 2.Zahl ist: " + (divide1 /= dblZ));
            out.println("Das Resultat von 2.Zahl geteilt durch 1.Zahl ist: " + (divide2 /= dblZ));


            boolean again = Input.inputBoolean("Möchten Sie das Programm erneut laufen lassen?:\nPlease type Y/n");


            if (again) {
                System.out.println("Good day.");
            } else {
                System.out.println("Goodbye");
                break;
            }
        }
    }
}

