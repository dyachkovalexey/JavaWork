package ru.itis;

/**
 * Created by KFU-user on 29.09.2016.
 */
abstract class Transport {
    private  int wheelsCount;

    public String toString() {
        return  "Transport: " + wheelsCount;
    }

    public Transport(int wheelsCount) {

        this.wheelsCount = wheelsCount;
    }

    public abstract void go();

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }
}
