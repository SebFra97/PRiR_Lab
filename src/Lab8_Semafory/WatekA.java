package Lab8_Semafory;

import java.util.concurrent.Semaphore;

public class WatekA extends Thread {

    Semaphore semaforA;
    Semaphore semaforB;
    Semaphore semaforC;

    public WatekA(Semaphore semaphoreA, Semaphore semaphoreB, Semaphore semaphoreC) {
        this.semaforA = semaphoreA;
        this.semaforB = semaphoreB;
        this.semaforC = semaphoreC;
    }

    @Override
    public void run() {
        try {
            while (true) {
                    semaforA.acquire();
                    System.out.println("= Watek A ="); //System.out.println("Watek B");
                    sleep((int) (Math.random() * 20));
                    semaforC.release();
            }
        } catch (Exception e) {}
    }
}
