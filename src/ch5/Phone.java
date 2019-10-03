package ch5;
//простейший автоматизированный телефонный справочник
public class Phone {
    public static void main(String[] args) {
        String numbers[][] = {
                {"Tom", "555-3322"},
                {"Mary", "555-8976"},
                {"John", "555-1037"},
                {"Rachel", "555-1400"}
        };
        int i;

        //для того, чтобы воспользоваться программой,
        //ей нужно передать 1 аргумент командной строки
        if (args.length != 1) {
            System.out.println("Использование: java Phone <имя>");
        } else {
            for (i = 0; i < numbers.length; i++) {
                if(numbers[i][0].equals(args[0])) {
                    System.out.println(numbers[i][0] +
                            ": " + numbers[i][1]);
                    break;
                }
            }
            if(i == numbers.length) {
                System.out.println("Имя не найдено.");
            }
        }
    }
}
