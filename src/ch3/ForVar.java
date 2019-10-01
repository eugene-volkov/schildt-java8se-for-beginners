package ch3;

public class ForVar {
    public static void main(String[] args) {
        int sum = 0;
        int fact = 1;

        //вычисление факториала от 1 до 5
        for (int i = 1; i <= 5; i++) {
            sum += i;
            fact *= i;
        }
        // здесь переменная i недоступна

        System.out.println("Сумма: " + sum);
        System.out.println("Факториал: " + fact);
    }
}
