package Lab4_Algoritm;

import Lab4_Algoritm.Monitor;
import Lab4_Algoritm.MonitorImpl;

public class Watek2 extends Thread {

    MonitorImpl monitor;
    Licznik licznik;

    public Watek2(MonitorImpl m, Licznik licz) {

        this.licznik = licz;
        this.monitor = m;
    }

    public void run() {

        for (int i = 0; i < 100; i++) {
            System.out.println("W2 " + i);
            monitor.proceduraWejsciowaWatek2();
            licznik.increment();
            monitor.proceduraWyjsciowaWatek2();
        }
    }

}
