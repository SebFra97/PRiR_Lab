package Lab5_Producent_Konsument;

public class MagazynImpl implements Magazyn<String> {

    int indexAdd;
    int indexGet;
    int size;
    int liczbaElementow;
    String[] element;

    MagazynImpl(int s) {
        this.size = s;
        this.element = new String[size];
    }

    @Override
    public void add(String product) throws InterruptedException {
       synchronized (element) {
           while (liczbaElementow == size) element.wait();
           element[indexAdd] = product;
           indexAdd++;
           indexAdd = indexAdd % size;
           liczbaElementow++;
           element.notifyAll();
       }
    }
    @Override
    public String get() throws InterruptedException {
        synchronized (element) {
            while (liczbaElementow == 0) element.wait();
            String tmp = element[indexGet];
            indexGet++;
            indexGet = indexGet % size;
            liczbaElementow--;
            element.notifyAll();
            return tmp;
        }
    }
}
