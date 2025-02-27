import java.util.*;

public class Machine {
    private String name;

    // house winnings default value is 0 upon Machine initialization
    private double house = 0;
    private double pot, payout;

    // controls behavior of quarter going to either pot or house
    boolean toPot = false;

    // basic constructor for machine
    public Machine(String n, double h, double p) {
        name = n;
        house = h;
        payout = p;
    }

    /*
     * intended execution flow:
     * 1) determines where quarter goes to (pot or house)
     * 2) using result argument, compute changes in pot
     * 3) return double for payout; return value of 0 correlates to loss, 
     * return value > 0 correlates to amount winnings
     */
    public double play(boolean result) {
        if (toPot) {
            pot += 0.25;
        } else {
            house += 0.25;
        }
        toPot = !toPot;

        if (result) {
            pot -= payout;
            return payout;
        } else {
            return 0;
        }

    }

    public String getName() {
        return "name";
    }

    public boolean inService() {
        return true;
    }

    public void report() {
        System.out.println("stub report");
    }
}
