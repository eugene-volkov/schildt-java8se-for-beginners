package ch3;

public class ContDemo {
    public static void main(String[] args) {
        //вывести четные от 0 до 100
        for (int i = 0; i < 100; i++) {
            if(i % 2 != 0) continue;
            System.out.println(i);
        }
    }
}
