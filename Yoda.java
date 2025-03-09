mport java.util.*;

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

    public double play(){
        // did we win?
        boolean winflag = Machine.rand.nextDouble() <= probability;

        // get payout
        double payout = accounting(winflag);

        // print win/loss messages
        System.out.print("Machine:  ");
        if(!winflag){
            System.out.println(syms.charAt(0) + "  There is no win, only lose or lose not. Lost you did");
        }
        else{
            System.out.println(syms.charAt(1) + "  Strong is the Force in this one. Won you have. --> $" + payout);
        }
        return payout;
    }

    public static void main(String[] args){
       
      Yoda y = new Yoda(" ", 0.0, 2.0, .5 );
      y.win();
     
// y.win(0.5);
    }

}