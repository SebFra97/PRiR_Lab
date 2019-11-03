package Lab4_Algoritm;

import com.sun.xml.internal.ws.client.MonitorRootClient;

public class main {

    public static void main(String[] args) throws InterruptedException {

        Licznik nowyLicznik = new Licznik();
        MonitorImpl monitor = new MonitorImpl();

        // ZAD 1

        /*Thread w1 = new Watek(monitor,nowyLicznik);
        Thread w2 = new Watek2(monitor,nowyLicznik);

        w1.start();
        w2.start();

        w1.join();
        w2.join();

        System.out.println(nowyLicznik.get());*/

        // ZAD 2

        Thread th1 = new WatekZad2(nowyLicznik);
        Thread th2 = new WatekZad2(nowyLicznik);

        th1.start();
        th2.start();

        th1.join();
        th2.join();

        System.out.println(nowyLicznik.get());





    }
}
