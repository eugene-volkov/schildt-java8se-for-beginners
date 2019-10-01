package ch3;

/*
  Использовать вложенные циклы для нахождения
  делителей чисел от 2 до 100 без остатка
*/
public class FindFac {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            System.out.print("Делители " + i + ": ");
            for (int j = 2; j < i; j++) {
                if((i % j) == 0) System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
