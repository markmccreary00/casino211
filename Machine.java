import java.util.*;

public class Machine {
    private String name;
    
    //house winnings default value is 0 upon Machine initialization
    private double house = 0;
    private double pot, payout;

    //controls behavior of quarter going to either pot or house
    boolean toPot = false;

    public Machine(String n, double h, double p) {
        name = n;
        house = h;
        payout = p;
    }

    public double play(Boolean result) {
        if()
        if(toPot){
            pot += 0.25;
        }
        else{
            house += 0.25;
        }
        toPot = !toPot;

        if(result){
            house -= payout;
            return payout;
        }
        else{
            return 0;
        }
        
    }

    public String getName() {
        return "stub name";
    }

    public boolean inService() {
        return true;
    }

    public void report() {
        System.out.println("stub report");
    }
}
