package ch5;
//преобразование прописных букв англ. алфавита в строчные
public class LowCase {
    public static void main(String[] args) {
        char ch;

        for (int i = 0; i < 10; i++) {
            ch = (char) ('A' + i);
            System.out.print(ch);

            /*в результате установки в 1цу 6го бита
              значения переменной ch она всегда будет
              сожержать прописную букву*/
            ch = (char) ((int) ch | 32);

            System.out.print(ch + " ");
        }
    }
}
