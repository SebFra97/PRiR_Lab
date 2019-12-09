package Lab7_Koordynacja;

public class main {
    public static void main(String[] args) throws InterruptedException {

        Koordynator koordynator = new KoordynatorImpl();
        Thread watekA = new WatekA(koordynator);
        Thread watekB = new WatekB(koordynator);
        Thread watekC = new WatekC(koordynator);
        watekA.start();
        watekB.start();
        watekC.start();
        Thread.sleep((int) (Math.random() * 500));
        watekA.interrupt();
        watekB.interrupt();
        watekC.interrupt();



    }
}
