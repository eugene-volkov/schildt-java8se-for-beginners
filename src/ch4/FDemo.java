package ch4;

//демонстрация сборки мусора и метода finalize()
public class FDemo {
    int x;

    FDemo(int i) {
        x = i;
    }

    //вызывается при удалении объекта
    protected  void finalize() {
        System.out.println("Финализация " + x);
    }

    //генерирует объект, который тотчас же уничтожается
    void generator(int i) {
        FDemo o = new FDemo(i);
    }
}
