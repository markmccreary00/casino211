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
    private double probability;

    public Yoda(String name, double probability, double house, double payout){
        super(name,house,payout);
        this.probability = probability;

    }

    public boolean win(){

        System.out.print("Machine:  ");

        Random rand = new Random(System.currentTimeMillis());

        double chance = 1/probability; 
        int win = rand.nextInt((int)chance) % 2; // 0 or 1, but with probabilty given

        // get payout
        double payout = play(true);
         // print win/loss messages
        if(payout == -1){
            System.out.println("Sorry, but this machine is out of service.");
            return false;
        }
        else if(win != 0){
            System.out.println(syms.charAt(0) + "  There is no win, only lose or lose not. Lost you did");
            return false;
        }
        else{
            System.out.println(syms.charAt(1) + "  Strong is the Force in this one. Won you have. --> $" + payout);
        }
        return true;
    }

    public static void main(String[] args){
        
      Yoda y = new Yoda(" ", 0.0, 2.0, .5 );
      y.win();
      
	// y.win(0.5);
    }

}
