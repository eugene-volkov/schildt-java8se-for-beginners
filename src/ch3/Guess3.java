package ch3;

public class Guess3 {
    public static void main(String[] args) throws java.io.IOException {
        char ch, answer = 'S';

        System.out.println("Задумана буква и диапазона A-Z.");
        System.out.print("Попытайтесь ее угадать: ");
        ch = (char) System.in.read(); // Получить символ с клавиатуры

        if(ch == answer) System.out.println("** Правильно! **");
        else {
            System.out.print("...Извините, нужная буква находится ");
            // вложенный оператор if
            if(ch < answer)
                System.out.println("ближе к концу алфавита");
            else System.out.println("ближе к началу алфавита");
        }
    }
}
