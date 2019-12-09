package Lab8_Semafory;

import java.util.concurrent.Semaphore;

public class WatekB extends Thread{

    Semaphore semaforA;
    Semaphore semaforB;
    Semaphore semaforC;

    public WatekB(Semaphore semaphoreA, Semaphore semaphoreB, Semaphore semaphoreC) {
        this.semaforA = semaphoreA;
        this.semaforB = semaphoreB;
        this.semaforC = semaphoreC;
    }

    @Override
    public void run() {
        try {
            while (true) {
                semaforB.acquire();
                System.out.println("<=== Watek B ===>"); //System.out.println("Watek B");
                sleep((int) (Math.random() * 20));
                semaforC.release();
            }
        } catch (Exception e) {}
    }
}
