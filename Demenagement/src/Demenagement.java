/**
 * Le but de la classe est de déterminer le nombre de cartons déplacé par voyage lors d'un déménagement.
 * L'utilisateur doit renseigner le nombre de cartons à déménager ainsi que la capacité du moyen de transport.
 *
 * @author Sylvain
 * @version 1.0
 * @since 2025-08-12
 */

import java.util.Scanner;

public class Demenagement {
    /**
     * The main method calculate how many boxes will be carried during a moving transport. It depends on the number of boxes to move and the truck capacity.
     *
     * @param args : not use here
     */

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        int boxes = askInteger(keyboard, "Saisir votre nombre de cartons : ");
        int truckCapacity = askInteger(keyboard, "Saisir la capacité du camion : ");

        while (boxes != 0) {
            int boxesNumberbyTravel = (boxes >= truckCapacity) ? truckCapacity : boxes;
            boxes -= boxesNumberbyTravel;
            System.out.println("Voyage de " + boxesNumberbyTravel + " cartons.");
        }
    }

    /**
     * The method request the user to enter an integer.
     * It loops until the user enter a valid value.
     *
     * @param keyboard is the input by the user
     * @param message  is the message display depending on the value requested.
     * @return the integer greater than 0 entered by the user.
     */

    public static int askInteger(Scanner keyboard, String message) {
        int input;
        while (true) {
            System.out.println(message);
            if (keyboard.hasNextInt()) {
                input = keyboard.nextInt();
                if (input > 0) {
                    return input;
                } else {
                    System.out.println("Erreur : veuillez entrer un nombre positif");
                }
            } else {
                System.out.println("Erreur : veuillez entrer un nombre entier.");
            }
        }
    }
}



