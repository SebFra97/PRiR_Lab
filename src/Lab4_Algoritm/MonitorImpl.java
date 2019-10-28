package Lab4_Algoritm;

public class MonitorImpl implements Monitor{

    boolean[] turn = {false,false};
    int whoTurn = 0;

    @Override
    public void proceduraWejsciowaWatek1() {
        turn[0] = true;
        whoTurn = 1;

        while(turn[1] == true && whoTurn == 1) {
                // zostawiamy pustą pętlę
        }

    }

    @Override
    public void proceduraWejsciowaWatek2() {
        turn[1] = true;
        whoTurn =  0;

        while(turn[0] == true && whoTurn == 0){
            // zostawiamy pusta pętlę
        }

    }

    @Override
    public void proceduraWyjsciowaWatek1() {

        turn[0] = false;
    }

    @Override
    public void proceduraWyjsciowaWatek2() {

        turn[1] = false;
    }
}
