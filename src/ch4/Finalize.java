package ch4;

public class Finalize {
    public static void main(String[] args) {
        int count;

        FDemo ob = new FDemo(0);

        /*генерируется большое количество объектов.
        в какой-то момент должна начаться сборка мусора.
         Примечание: возможно, для того, чтобы активизировать
         систему сборки мусора, количество генерируемых объектов
         придется увеличить. */
        for (count = 1; count < 100000; count++) {
            ob.generator(count);
        }
    }
}
