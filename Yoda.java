import java.util.*;

public class Yoda extends Machine {

    /*
     * methods:
     * double play() 
     * boolean inService()  -- super
     * report()     -- overwrite 
     * getName()    -- super 
     */
    private String syms = "ⓣⓗ";

    public Yoda(String name, double house, double payout){
        super(name,house,payout);
    }

    public boolean win(double probability){

        System.out.print("Machine:  ");

        Random rand = new Random(System.currentTimeMillis());

        double chance = 1/probability; 
        int win = rand.nextInt((int)chance) % 4; // 0 or 1, but with probabilty given

         // print win/loss messages
        if(win != 0){
            System.out.println(syms.charAt(0) + "  There is no win, only lose or lose not. Lost you did");
            return false;
        }
        else{
            double payout = play(true);
            System.out.println(syms.charAt(1) + "  Strong is the Force in this one. Won you have. --> $" + payout);
        }
        return true;
    }

    public static void main(String[] args){
        
        Yoda y = new Yoda(" ", 0.0, 2.0 );
        y.win(0.5);
    }

}