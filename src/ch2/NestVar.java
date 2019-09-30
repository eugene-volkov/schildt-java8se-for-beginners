package ch2;

/**
 * Эта программа не пройдет компиляцию
 */
public class NestVar {
    public static void main(String[] args) {
        int count;

        for (count = 0; count < 10; count++) {
            System.out.println("Значение count: " + count);

            // int count; // недопустимо! Нельзя объявлять переменную count,
            // поскольку ранее она была объявлена

            for (count = 0; count < 2; count++) {
                System.out.println("В этой программе есть ошибка!");
            }

        }
    }
}
