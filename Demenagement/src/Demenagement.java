import java.util.Scanner;

public class Demenagement {
    public static void main(String[] args) {
        int cartons = 0;
        int truckCapacity= 0;
        int nbrCartonsParVoyage = 0;



        Scanner clavier = new Scanner(System.in);
        boolean inputCartonsValide = false;

        while (!inputCartonsValide) {
            System.out.print("Saisir votre nombre de cartons : ");
            String input = clavier.nextLine();
            try {
                cartons = Integer.parseInt(input);
                inputCartonsValide = true;
            } catch (NumberFormatException e) {
                System.out.println("Entrée invalide. Veuillez entrer un nombre valide.");
            }
        }

        boolean inputCapaciteValide = false;

        while (!inputCapaciteValide) {
            System.out.print("Saisir la capacité de votre camion : ");
            String input = clavier.nextLine();
            try {
                truckCapacity = Integer.parseInt(input);
                inputCapaciteValide = true;
            } catch (NumberFormatException e) {
                System.out.println("Entrée invalide. Veuillez entrer un nombre valide.");
            }
        }

        while (cartons != 0){
            if (cartons >= truckCapacity) {
                nbrCartonsParVoyage = truckCapacity;
            } else{
                nbrCartonsParVoyage = cartons;
            };
           cartons -= nbrCartonsParVoyage;
            System.out.println("Voyage de " + nbrCartonsParVoyage + " cartons.");
        }

    }
}

