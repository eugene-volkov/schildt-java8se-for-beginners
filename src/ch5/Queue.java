package ch5;
//класс, реализующий очередь для хранения символов
public class Queue {
    char q[];//массив для храннеия элементов очереди
    int putloc, getloc;//индексы для вставки и извлечения эл-тов очереди

    Queue(int size) {
        q = new char[size + 1];//выделить память для очереди
        putloc = getloc = 0;
    }

    //поместить символ в очередь
    void put(char ch) {
        if(putloc == (q.length - 1)) {
            System.out.println(" - Очередь заполнена");
            return;
        }

        putloc++;
        q[putloc] = ch;
    }

    //извлечь символ из очереди
    char get() {
        if(getloc == putloc) {
            System.out.println(" - Очередь пуста");
            return (char) 0;
        }

        getloc++;
        return q[getloc];
    }
}