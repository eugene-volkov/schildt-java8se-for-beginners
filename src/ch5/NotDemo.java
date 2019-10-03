package ch5;
//демонстрация поразрядной операции НЕ
public class NotDemo {
    public static void main(String[] args) {
        byte b = -34;

        for (int t = 128; t > 0; t = t / 2) {
            if((b & t) != 0) System.out.print("1 ");
            else System.out.print("0 ");
        }
        System.out.println();

        //обратить состояние всех битов
        b = (byte) ~b;

        for (int t = 128; t > 0; t = t / 2) {
            if((b & t) != 0) System.out.print("1 ");
            else System.out.print("0 ");
        }
    }
}
