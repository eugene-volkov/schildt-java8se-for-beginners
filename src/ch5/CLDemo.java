package ch5;
/* отображение всех параметров, переданных в командной строке
   запустить программу с параметрами:
   java CLDemo one two three*/
public class CLDemo {
    public static void main(String[] args) {
        System.out.println("Программе передано " +
                args.length +
                " аргумента командной строки.");
        System.out.println("Список аргументов: ");
        for (int i = 0; i < args.length; i++) {
            System.out.println("arg[" + i + "]: " + args[i]);
        }
    }
}
