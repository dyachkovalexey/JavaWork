package models;

/**
 * Created by Lo0ny on 05.10.2016.
 */
public class D implements Q{

    private int d;

    public D(int c) {
        this.d = c;
    }

    @Override
    public int number() {
        return this.d;
    }

    @Override
    public int calc(int a) {
        this.d = a * a +2;
        return this.d;
    }
}
