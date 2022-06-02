import java.util.Scanner;

    public class NumberGuesser {

        public static void NumberGuesserGame()
        {Scanner sc = new Scanner(System.in);
            int number = 1 + (int)(100
                    * Math.random());

            int versuche = 5;

            int i, guess;

            System.out.println("Finden Sie die Nummer zwischen 1 und 100. Sie haben 5 versuche ");

            for (i = 0; i < versuche; i++) {

                System.out.println(
                        "Raten Sie welche Nummer ");

                guess = sc.nextInt();

                if (number == guess) {
                    System.out.println("Glückwunsch, Sie haben die Nummer erraten ");
                    break;
                }
                else if (number > guess
                        && i != versuche - 1) {
                    System.out.println("Die Nummer ist grösser als " + guess);
                }
                else if (number < guess
                        && i != versuche - 1) {
                    System.out.println("Die Nummer ist kleiner als " + guess);
                }
            }

            if (i == versuche) {
                System.out.println("Sie haben verloren :( ");
                System.out.println("Die Nummer war " + number);
            }
        }
        public static void
        main(String arg[])
        {
            NumberGuesserGame();
        }
    }