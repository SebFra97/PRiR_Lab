package Lab4_Algoritm;

import Lab4_Algoritm.Monitor;
import Lab4_Algoritm.MonitorImpl;

public class Watek extends Thread {

    MonitorImpl monitor;
    Licznik licznik;

    public Watek(MonitorImpl m, Licznik licz) {

        this.licznik = licz;
        this.monitor = m;
    }

public void run() {

        for (int i = 0; i < 100; i++) {
            System.out.println("W1 " + i);
            monitor.proceduraWejsciowaWatek1();
            licznik.increment();
            monitor.proceduraWyjsciowaWatek1();
        }
    }

}
