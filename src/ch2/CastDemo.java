package ch2;

public class CastDemo {
    public static void main(String[] args) {
        double x, y;
        byte b;
        int i;
        char ch;

        x = 10.0;
        y = 3.0;
        i = (int)(x / y); // привести double к int, теряется дробная часть числа
        System.out.println("Целочичленный результат деления x / y: " + i);

        i = 100;
        b = (byte) i; // в этом случает информация не теряется: тип byte может содержать значение 100
        System.out.println("Значение b: " + b);

        i = 257;
        b = (byte) i; // инф-ция теряется: тип byte не может содержать значение 257
        System.out.println("Значение b: " + b);

        b = 88; // представление символа X в коде ASCII
        ch = (char) b; // явное приведение несовместимых типов
        System.out.println("ch: " + ch);
    }
}
