package ch4;

public class Vehicle {
    int passengers; // кол-во пассажиров
    int fuelcap; // емкость топливного бака
    int mpg; // потребление топлива в милях на галлон

    // при наличии параметризованного конструктора, необходимо создать пустой конструктор вручную
    Vehicle() {}

    //конструктор класса Vehicle
    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    //отобразить дальность поездки транспортного средства
//    void range() {
//        System.out.println("Дальность - " + fuelcap * mpg +
//                            " миль.");
//    }

    //возврат дальности поездки
    int range() {
        return mpg * fuelcap;
    }

    //рассчитать объем топлива для преодоления расстояния
    double fuelneeded(int miles) {
        return (double) miles / mpg;
    }
}
