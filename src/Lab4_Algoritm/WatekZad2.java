package Lab4_Algoritm;

public class WatekZad2 extends Thread {


    Licznik licznik2;

    public WatekZad2(Licznik l)
    {
        licznik2 = l;
    }

    @Override
    public void run() {
            for(int i =0; i < 100; i++)
                    synchronized (licznik2)
                    {
                        System.out.println(this.getName() + " " + i);
                        licznik2.increment();
                    }
    }
}
