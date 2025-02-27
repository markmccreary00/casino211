import java.io.*;
import java.util.*;


public class Reader{



    public static Machines[] machines(String fname){

        Scanner sc = null;
        try { sc = new Scanner(new FileReader(fname)); } 
        catch(IOException e) { e.printStackTrace(); System.exit(1); }

        // get number of machines 
        int num = sc.next().length();

        Machines[] machines = new Machines[num];

        // read in data and instantiate for each machine
        for(int i = 0; i < num; i++){
            // if yoda, read in extra thing for probability 
        }

        return machines; 
    }

    public static void main(String[] args){
        machines("setup.txt");
    }
}