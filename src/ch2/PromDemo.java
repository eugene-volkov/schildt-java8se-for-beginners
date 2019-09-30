package ch2;

public class PromDemo {
    public static void main(String[] args) {
        byte b;
        int i;

        b = 10;
        i = b * b; // приведение типов не требуется, т.к тип уже повышен до int

        b = 10;
        // для присвоения значения int переменной типа byte требуется приведение типов
        b = (byte) (b * b); // cast needed!

        System.out.println("i and b: " + i + " " + b);
    }
}
