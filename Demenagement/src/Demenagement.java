public class Demenagement {
    public static void main(String[] args) {
        int cartons = 34;
        int truckCapacity = 9;
        int nbrCartonsParVoyage = 0;

        while (cartons != 0){
            if (cartons >= truckCapacity) {
                nbrCartonsParVoyage = 9;
            } else{
                nbrCartonsParVoyage = cartons;
            };
           cartons -= nbrCartonsParVoyage;
            System.out.println("Voyage de " + nbrCartonsParVoyage + " cartons.");
        }

    }
}

