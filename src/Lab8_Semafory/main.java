package Lab8_Semafory;

import java.util.concurrent.Semaphore;

public class main {
    public static void main(String[] args) throws InterruptedException {

        Semaphore semA = new Semaphore(0, true);
        Semaphore semB = new Semaphore(0, true);
        Semaphore semC = new Semaphore(2, true);

        Thread watekA = new WatekA(semA,semB,semC);
        Thread watekB = new WatekB(semA,semB,semC);
        Thread watekC = new WatekC(semA,semB,semC);

        watekA.start();
        watekB.start();
        watekC.start();

        Thread.sleep((int) (Math.random() * 500));

        watekA.interrupt();
        watekB.interrupt();
        watekC.interrupt();

    }
}
