public class Machine {
    private String name;

    // house winnings default value is 0 upon Machine initialization
    private double house = 0;
    // initial pot value tracked to compute net value for report
    private double initialPot, pot, payout;

    // controls behavior of quarter going to either pot or house
    boolean toPot = false;

    // basic constructor for machine
    public Machine(String name, double pot, double payout) {
        this.name = name;
        this.pot = this.initialPot = pot;
        this.payout = payout;
    }

    /*
     * handler for changes in pot & house values.
     * intended execution flow:
     * 1) check if machine is in service
     * 2) determines where quarter goes to (pot or house)
     * 3) using result argument, compute changes in pot
     * 4) return double for payout; return value of 0 correlates to loss,
     * return value > 0 correlates to amount winnings
     * return value == -1 correlates to out of service machine
     */
    public double play(boolean result) {
        if(!inService()){
            return -1;
        }
        
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

    // simple name getter
    public String getName() {
        return name;
    }

    // method for checking machine operability state
    public boolean inService() {
        if (pot < payout) {
            return false;
        } else {
            return true;
        }
    }

    public String report() {
        double net = house + pot - initialPot;
        return String.format("casino: $%.2f, pot: $%.2f, net: $%.2f", house, pot, net);
    }
}
