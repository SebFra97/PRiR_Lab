package ksiazkaTelefoniczna;

import java.io.*;
import java.util.*;

public class KsiazkaTelefoniczna {

    Map<String, List<Osoba>> surname = new HashMap<String,List<Osoba>>();
    Map<String,List<Osoba>> quickName = new HashMap<String,List<Osoba>>();
    List<Osoba> all = new ArrayList<Osoba>();

    List<Osoba> getByImie(String name) {
        return quickName.get(name);
    }

    List<Osoba> getByNazwisko(String nazwisko) {
        return surname.get(nazwisko);
    }

    public void DodajOsobe(Osoba o)
    {
        all.add(o);

        boolean surnameCheck = false;
        boolean nameCheck = false;

        for(Map.Entry<String, List<Osoba>> entry : surname.entrySet()) {
            if(entry.getKey() == o.getNazwisko()) {
                surnameCheck = true;
                entry.getValue().add(o);
            }
        }
        if(surnameCheck == false) {
            List<Osoba> temp = new ArrayList<Osoba>();
            temp.add(o);
            surname.put(o.getNazwisko(),temp);
        }

        for(Map.Entry<String, List<Osoba>> entry : quickName.entrySet()) {
            if(entry.getKey() == o.getImie()) {
                nameCheck = true;
                entry.getValue().add(o);
            }
        }
        if(nameCheck == false) {
            List<Osoba> temp = new ArrayList<Osoba>();
            temp.add(o);
            quickName.put(o.getImie(),temp);
        }
    }

    public void remove(int id) {
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

    void Plik (FileReader file) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(file);
        String line = null;

        while ((line = bufferedReader.readLine()) != null) {
            String[] temp = line.split(",");

            String imie = temp[0];
            String nazwisko = temp[1];
            String numer = temp[2];

            all.add(new Osoba(imie,nazwisko,numer));

        }
    }



}
