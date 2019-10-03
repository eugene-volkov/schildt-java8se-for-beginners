package ch5;
//демонстрация превышения границ массива
public class ArrayErr {
    public static void main(String[] args) {
        int sample[] = new int[10];

        //специально создает выход индекса за границы массива
        //будет сгенерировано исключение ArrayIndexOutOfBoundsException
        for (int i = 0; i < 100; i++) {
            sample[i] = i;
        }
    }
}
