package ch3;

public class Break3 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Счетсчик внеш. цикла: " + i);
            System.out.print("      Счетчик внутр. цикла: ");

            int t = 0;
            while (t < 100) {
                if(t == 10) break;
                System.out.print(t + " ");
                t++;
            }
            System.out.println();
        }
        System.out.println("Циклы завершены.");
    }
}
