package ch3;

public class ContToLabel {
    public static void main(String[] args) {
        outerloop:
        for (int i = 1; i < 10; i++) {
            System.out.print("\nВнешн. цикл: проход " + i +
                                ", внутр. цикл: ");
            for (int j = 1; j < 10; j++) {
                if(j == 5) continue outerloop;//продолжить внеш. цикл
                System.out.print(j);
            }
        }
    }
}
