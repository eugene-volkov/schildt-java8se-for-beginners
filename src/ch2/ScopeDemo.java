package ch2;

public class ScopeDemo {
    public static void main(String[] args) {
        int x; // эта переменная доступна для всего кода в методе main

        x = 10;
        if(x == 10){ // начало новой области действия
            int y = 20; // эта переменная доступна только в данном блоке

            // обе переменные x и y доступны в данном кодовом блоке

            System.out.println("x and y: " + x + " " + y);
            x = y * 2;
        }
        // y = 100; // Ошибка! в данном месте переменная y - недоступна!

        // А переменная x по-прежнему доступна
        System.out.println("x is: " + x);
    }
}
