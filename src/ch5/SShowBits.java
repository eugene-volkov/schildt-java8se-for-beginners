package ch5;
//создание класса для отображения значений в двоичном коде
public class SShowBits {
    int numbits;

    SShowBits(int n) {
        numbits = n;
    }

    void show(long val) {
        long mask = 1;

        //сдвинуть значения 1 влево на каждую позицию
        mask <<= numbits - 1;

        int spacer = 0;
        for ( ; mask != 0; mask >>>= 1) {
            if((val & mask) != 0) System.out.print("1 ");
            else System.out.print("0 ");
            spacer++;
            if((spacer % 8) == 0) {
                System.out.print(" ");
                spacer = 0;
            }
        }
        System.out.println();
    }
}
