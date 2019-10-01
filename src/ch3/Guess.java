package ch3;

public class Guess {
    public static void main(String[] args) throws java.io.IOException {
        char ch, answer = 'S';

        System.out.println("Задумана буква и диапазона A-Z.");
        System.out.print("Попытайтесь ее угадать: ");
        ch = (char) System.in.read(); // Получить символ с клавиатуры

        if(ch == answer) System.out.println("** Правильно! **");
    }
}
