package Lab5_Producent_Konsument;

public class MagazynImpl implements Magazyn<String> {

    int size;

    MagazynImpl(int s) {
        this.size = s;
    }

    int indexZapisu = 0;
    int indexOdczytu = 0;
    //String obj;
    String[] element = new String[size];
    int licznikElementow;
    int rozmiar = size - 1;
    //boolean jestTowar = false;

    @Override
    public synchronized void add(String product) throws InterruptedException {
        while (licznikElementow == size) {
            this.wait();
        }
        indexZapisu = (indexZapisu++) % size;
        //this.element = product;
        //jestTowar = true;
        licznikElementow++;
        notifyAll();
    }

    @Override
    public synchronized String get() throws InterruptedException {
        while (licznikElementow == 0) {
            this.wait();
        }
        // jestTowar = false;
        int temp = indexOdczytu;
        indexOdczytu = (indexOdczytu++) % size;
        licznikElementow--;
        notifyAll();
        return element[temp];
    }
}
