import java.util.*;

public class Pirate extends Machine {

    private String syms = "♈✋⛵";

    public boolean win(double payout){

        System.out.print("Machine:   ");

        // create array of my actual syms
        int[] mySyms = {0,0,0};
        boolean win = true;

        Random rand = new Random(System.currentTimeMillis());

        // print the icons, and check for win/loss
        for(int i = 0; i < 3; i++){
            int x = mySyms[i] = rand.nextInt(2);
            System.out.print(syms.charAt(x) + " ");

            //check if still in the game 
            if(i > 0 && mySyms[i] != mySyms[i - 1])
                win = false;
        }

        // print win/loss message 
        if(win)
            System.out.println(" You've won and taken me treasure, scaliwag! --> $" + payout);
        else    
            System.out.println(" Arrrr, you lost, matey!");

        // return whether we won or lost 
        return win;
    }

    public static void main(String[] args){
        Pirate p = new Pirate();
        p.win(1.5);
    }

}