package Lab6_ThreadBreaking;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * Zmodyfikuj metodę run w klasie BreakingTask1ToDo tak aby po wystąpieniu przerwaniu wątka, metoda run zakończyła swoją
 * pracę a jednocześnie wypisała na ekranie zawartość mapy
 */
public class BreakingTask1ToDo implements Runnable {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new BreakingTask1ToDo());
        t.start();
        Thread.sleep(500);
        t.interrupt();
        System.out.println("Watek " + t.getId() + " został przerwany!");
    }


    @Override
    public void run() {
        Map<String, Integer> map = new HashMap<>();
        Random r = new Random();
            while (!Thread.currentThread().isInterrupted()) {
                    String key = "" + r.nextInt(10);
                    Integer val = map.get(key);
                    val = val == null ? 1 : val + 1; // zliczanie ile razy ona jest wykonana
                    map.put(key, val);
            }
            System.out.println("Przerwanie wątku");
            for (Map.Entry<String,Integer> entry : map.entrySet()){
                System.out.println("Wylosowano wartość " + entry.getKey() + " " + entry.getValue() + " razy.");
            }
    }
}

