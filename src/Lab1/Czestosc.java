package Lab1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class Czestosc {

    public static void main(String[] args) {

        try(Scanner sc = new Scanner(new File("tekst.txt"))) {

            // treemap ze wzgledu na sortowanie alfabetyczne

            Map<String, Integer> mp= new TreeMap<>();

            while (sc.hasNext()) {
                String word = toUpperCase(sc.next()).replaceAll("[^\\p{L}\\p{N}]+", "").replaceAll(",",""); // regex na UTF-8
                if (mp.containsKey(word)) { // sprawdza czy już taki wyraz występuje
                    mp.put(word, mp.get(word) + 1); // dodanie do value wartości + 1
                } else {
                    mp.put(word, 1); // wprowadza to słowo
                }
            }
            int i = 0;
            //  pętla for pobierająca z mapy wszystkie wartości z entry

            for(Map.Entry<String,Integer> ent : mp.entrySet()) {
                if (i != 0 && i < 11) {
                    // wypisanie key i value
                    String k = ent.getKey();
                    Integer v = ent.getValue();

                    System.out.println("Słowo " + k + " wystąpiło : " + v + " raz(y)");
                    i++;
                }else if (i == 0) i++;

                else break;
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
