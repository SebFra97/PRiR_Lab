package ksiazkaTelefoniczna;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class KsiazkaTelefoniczna {

    Map<String, List<Osoba>> surname = new HashMap<String,List<Osoba>>();
    Map<String,List<Osoba>> quickName = new HashMap<String,List<Osoba>>();
    List<Osoba> all;

    List<Osoba> getByImie(String name) {
        return quickName.get(name);
    }
    List<Osoba> getByNaziwsko(String nazwisko) {
        return surname.get(nazwisko);
    }
    void DodajOsobe(Osoba o)
    {
        all.add(o);
    }
    void remove(int id) {
        Osoba osoba = null;
        for (Osoba o : all) {
            if(o.getId() == id) {
                osoba = o;
            }
        }
        all.remove(osoba);
        List<Osoba> temp = quickName.get(osoba.getImie());
        temp.remove(osoba);
        List<Osoba> temp2 = surname.get(osoba.getNazwisko());
        temp2.remove(osoba);

    }

    void File (File file) {
        try(Scanner sc = new Scanner(new File("tekst.txt"))) {


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

}
