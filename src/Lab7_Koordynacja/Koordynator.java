package Lab7_Koordynacja;

public interface Koordynator {

    void startA() throws InterruptedException;
    void startB() throws InterruptedException;
    void koniecA();
    void koniecB();

}
