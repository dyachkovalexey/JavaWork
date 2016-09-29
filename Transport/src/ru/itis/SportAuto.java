package ru.itis;

/**
 * Created by KFU-user on 29.09.2016.
 */
class SportAuto extends Auto {
    public void go () {
        System.out.println("I`m SportCar");
    }

    public SportAuto(int wheelsCount, int gasNumber) {
        super(wheelsCount, gasNumber);
    }
}
