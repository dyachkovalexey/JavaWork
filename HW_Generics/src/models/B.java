package models;

/**
 * Created by Lo0ny on 05.10.2016.
 */
public class B implements Q{

    private int b;

    public B(int c) {
        this.b = c;
    }

    @Override
    public int number() {
        return this.b;
    }

    @Override
    public int calc(int a) {
        this.b = a + a - 2;
        return b;
    }
}


