package ch5;
//демонстрация использования класса SShowBits
public class ShowBitsDemo {
    public static void main(String[] args) {
        SShowBits b = new SShowBits(8);
        SShowBits i = new SShowBits(32);
        SShowBits li = new SShowBits(64);

        System.out.println("123 в двоичном представлении: ");
        b.show(123);

        System.out.println("\n87987 в двоичном представлении: ");
        i.show(87987);

        System.out.println("\n237658768 в двоичном представлении: ");
        li.show(237658768);

        //можно также отобразить младшие разряды любого целого числа
        System.out.println("\nМладшие 8 битов числа 87987" +
                " в двоичном представлении: ");
        b.show(87987);
    }
}
