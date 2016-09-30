package ru.itis;

/**
 * Created by KFU-user on 30.09.2016.
 */
public class IntegerArrayList {
    private static final int MAX_SIZE = 10;

    private int data[];

    private int count;

    public IntegerArrayList() {
        this.count = 0;
        this.data = new int[MAX_SIZE];
    }

    /**
     * метод добавления элемента в конец списка
     * @param element - элемент добавления
     */
    public void add(int element) {
        if (this.count < MAX_SIZE) {
            this.data[count] = element;
            count++;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public IntegerArrayList(int originalData[]) {
        if (originalData.length <= MAX_SIZE) {
            this.data = new int[MAX_SIZE];
            this.count = originalData.length;
            for (int i = 0; i < originalData.length; i++) {
                this.data[i] = originalData[i];
            }
        } else throw new IllegalArgumentException();
    }

    public void add(int element, int position) {
        if (position < count & count < MAX_SIZE) {
            for (int i = count; i > position; i--) {
                this.data[i] = this.data[i-1];
            }
            this.data[position] = element;
            count++;
        } else throw new IllegalArgumentException();
    }

    /**
     * удаление элемента по его значению
     * @param element
     */
    public boolean delete(int element) {
        int cur = find(element);

        if (cur == -1) {
            return false;
        } else if (this.count > 0) {
            for (int i = cur; i < MAX_SIZE - 1; i++) {
                data[i] = data[i+1];
            }
            this.count--;
            data[MAX_SIZE-1] = 0;
            return true;
        }
        return false;
    }

    public void deleteByPosition(int position) {
        if (position < MAX_SIZE) {
            for (int i = position; i < MAX_SIZE-1; i++) {
                data[i] = data[i+1];
            }
            data[MAX_SIZE-1] = 0;
            count--;
        } else throw  new IllegalArgumentException();
    }

    /**
     * поиск елемента, возвращаем индекс элемента, если он найден
     * @param element
     * @return
     */
    public int find (int element) {
        for (int i = 0; i < MAX_SIZE; i++) {
            if (data[i] == element) {
                return  i;
            }
        }
        return -1;
    }

    public int get(int position) {
        if (position < this.count) {
            return this.data[position];
        } else  throw  new IllegalArgumentException();
    }
}
