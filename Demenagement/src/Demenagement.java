import java.util.Scanner;

public class Demenagement {
    /**
     * The main method calculate how many boxes will be carried during a moving transport. It depends on the number of boxes to move and the truck capacity.
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
     * @param keyboard is the input by the user
     * @param message is the message display depending on the value requested.
     * @return the integer greater than 0 entered by the user.
     */

    public static int askInteger(Scanner keyboard, String message) {
        String input;
        while (true) {
            System.out.println(message);
            input = keyboard.nextLine();
            if (isInteger(input)) {
                int integerInput = Integer.parseInt(input);
                if (integerInput >= 0) {
                    return integerInput;
                } else {
                    System.out.println("Erreur : veuillez entrer un nombre positif");
                }
            } else {
                System.out.println("Erreur : veuillez entrer un nombre entier.");
            }
        }
    }


    /**
     * The method test if the number entered by the user is an integer.
     * @param input is the input by the user
     * @return {@code true} if the value is an integer {@code false} if not.
     */

public static boolean isInteger(String input) {
    try {
        Integer.parseInt(input);
        return true;
    } catch (NumberFormatException e) {
        return false;
    }
}
}



