package Lab7_Koordynacja;

public class KoordynatorImpl implements Koordynator {

    boolean blokadaA = true;
    boolean blokadaB = true;
    boolean blokadaC = false;

    @Override
    synchronized public void startA() throws InterruptedException {
        while(blokadaA) wait();
        blokadaC = true;
        blokadaB = false;
    }

    @Override
    synchronized public void startB() throws InterruptedException {
        while(blokadaB) wait();
        blokadaC = true;
        blokadaA = false;
    }

    @Override
    public void startC() throws InterruptedException {
        while(blokadaC) wait();
        blokadaA = true;
        blokadaB = true;
    }

    @Override
    synchronized public void koniecA() {
        this.notifyAll();
        blokadaA = true;
        if(blokadaA && blokadaB) blokadaC = false;
    }

    @Override
    synchronized public void koniecB() {
        this.notifyAll();
        blokadaB = true;
        if(blokadaA && blokadaB) blokadaC = false;

    }

    @Override
    synchronized public void koniecC() {
        this.notifyAll();
        blokadaA = false;
        blokadaB = false;
        blokadaC = true;
    }
}
