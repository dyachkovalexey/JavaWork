package ru.itis;

public class Main {

    public static void main(String[] args) {
	    Auto auto = new Auto(4, 95);
        SportAuto sportAuto = new SportAuto(10, 96);
        Bike bike = new Bike(4);

        Transport transports[] = {auto, sportAuto, bike};

        for (int i = 0; i < transports.length; i++ ) {
            Transport currentTransport = transports[i];
            currentTransport.go();
        }

        for (Transport currentTransport : transports) {
            currentTransport.go();
        }


        int min = transports[1].getWheelsCount();
        for (int i = 0; i < transports.length; i++) {
            Transport currentTransport = transports[i];
            if (currentTransport.getWheelsCount() < min ) {
                min = currentTransport.getWheelsCount();
            }
        }


        for (int i = 0; i < transports.length; i++) {
            Transport currentTransport = transports[i];
            if (currentTransport.getWheelsCount() == min) {
                System.out.println(currentTransport.toString());
            }
        }

    }
}
