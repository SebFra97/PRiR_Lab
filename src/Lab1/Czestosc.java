package Lab1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;

import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class Czestosc {

    public static void main(String[] args) {

        try(Scanner sc = new Scanner(new File("tekst.txt"))) {

            Map<String, Integer> mp= new TreeMap<>();

            while (sc.hasNext()) {
                String word = toUpperCase(sc.next()).replaceAll("[^\\p{L}\\p{N}]+", "").replaceAll(",","");
                if (mp.containsKey(word)) {
                    mp.put(word, mp.get(word) + 1);
                } else {
                    mp.put(word, 1);
                }
            }
            int i = 0;

            for(Map.Entry<String,Integer> ent : mp.entrySet()) {
                if (i != 0 && i < 11) {
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
