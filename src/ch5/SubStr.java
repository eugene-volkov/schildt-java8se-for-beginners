package ch5;
/*применение метода substring, возвращающего новую строку,
  содержащую часть вызывающей строки.
  В итоге создается новый строковый объект с подстрокой, а
  исходная строка не меняется*/
public class SubStr {
    public static void main(String[] args) {
        String orgstr = "Java - двигатель Интернета.";

        //сформировать подстроку
        String substr = orgstr.substring(7, 25);

        System.out.println("orgstr: " + orgstr);
        System.out.println("substr: " + substr);
    }
}
