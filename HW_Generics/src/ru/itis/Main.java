package ru.itis;

import models.B;
import models.D;
import models.Q;

public class Main {

    public static <X,Y,Z extends Q> int calcAll(Q x, Q y, Q z) {
        int result = x.calc(x.number()) + y.calc(y.number()) + z.calc(z.number());
        return result;
    }

    public static void main(String[] args) {
	    B b = new B(5);
        B a = new B(7);
        D d = new D(10);

        int result = calcAll(b, b, d);

        System.out.println(result);
    }
}
