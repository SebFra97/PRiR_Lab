package Lab1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class Czestosc {

    public static void main(String[] args) {

        try(Scanner sc = new Scanner(new File("tekst.txt"))) {

            Map<String, Integer> mp= new TreeMap<>();

            while (sc.hasNext()) {
                String word = toUpperCase(sc.next()).replaceAll("[^\\p{L}\\p{N}]+", "");
                if (mp.containsKey(word)) {
                    mp.put(word, mp.get(word) + 1);
                } else {
                    mp.put(word, 1);
                }
            }
            System.out.println(mp);
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
