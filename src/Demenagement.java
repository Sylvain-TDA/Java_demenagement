public class Demenagement {
    public static void main(String[] args) {
        int cartons = 9;
        int truckCapacity = 34;
        int nbrCartonsParVoyage = 0;

        while (truckCapacity > cartons){
            if (truckCapacity - cartons > 0) {
                nbrCartonsParVoyage = 9;
            } else{
                nbrCartonsParVoyage = truckCapacity - cartons;
            };
            }
            System.out.println("Voyage de " + nbrCartonsParVoyage + "cartons.");
        }
    }
