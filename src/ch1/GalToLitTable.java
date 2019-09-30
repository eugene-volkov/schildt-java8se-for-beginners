package ch1;

public class GalToLitTable {
    public static void main(String[] args) {
        double gallons, liters, litersInGallon;
        int counter;
        litersInGallon = 3.7854;
        counter = 0;

        for (gallons = 1; gallons <= 100; gallons++) {
            liters = gallons * litersInGallon;

            System.out.println(gallons + " галлонам соответствует "
                    + liters + " литров");

            counter++;

            if(counter == 10){
                System.out.println();
                counter = 0;
            }
        }

    }
}
