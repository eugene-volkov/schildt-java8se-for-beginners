package ch1;

public class GalToLit {
    public static void main(String[] args) {
        double gallons;
        double liters;
        double litersInGallon;

        litersInGallon = 3.7854;
        gallons = 10;
        liters = gallons * litersInGallon;

        System.out.println(gallons + " галлонам соответствует "
                            + liters + " литров");
    }
}
