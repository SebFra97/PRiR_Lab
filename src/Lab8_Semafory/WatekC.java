package Lab8_Semafory;

import java.util.concurrent.Semaphore;

public class WatekC extends Thread{

    Semaphore semaforA;
    Semaphore semaforB;
    Semaphore semaforC;


    public WatekC(Semaphore semaphoreA, Semaphore semaphoreB, Semaphore semaphoreC) {
        this.semaforA = semaphoreA;
        this.semaforB = semaphoreB;
        this.semaforC = semaphoreC;
    }

    @Override
    public void run() {
        try {
            while (true) {
                semaforC.acquire(2);
                System.out.println("<== Watek C ==>");
                sleep((int) (Math.random() * 20));
                semaforA.release();
                semaforB.release();
            }
        } catch (Exception e) { }
    }
}

