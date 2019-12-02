package Lab7_Koordynacja;

public class WatekB extends Thread{

    Koordynator koordynator;
    public WatekB(Koordynator koordynator) {
        this.koordynator = koordynator;
    }

    @Override
    public void run() {
        try {
            while (true) {
                koordynator.startB();
                System.out.println("Watek B ==");
                sleep((int) (Math.random() * 20));
                koordynator.koniecB();
            }
        } catch (Exception e) { }
    }
}
