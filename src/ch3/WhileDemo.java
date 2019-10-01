package ch3;

public class WhileDemo {
    public static void main(String[] args) {
        char ch;

        //вывести буквы англ. алфавита, используя while
        ch = 'a';
        while (ch <= 'z'){
            System.out.println(ch);
            ch++;
        }
    }
}
