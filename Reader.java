import java.io.*;
import java.util.*;


public class Reader{

    public static Machine[] machines(String fname){

        Scanner sc = null;
        try { sc = new Scanner(new FileReader(fname)); } 
        catch(IOException e) { e.printStackTrace(); System.exit(1); }

        // get number of machines 
        int num = sc.next().length();

        // create array of that many machines
        Machine[] machines = new Machine[num];


        for(int i = 0; i < num; i++){
	        // TODO: read in data and instantiate for each machine

            String type = sc.next();

            // if yoda, read in extra thing for probability
            if(type.equals("yoda"))
	            machines[i] = new Yoda("Yoda", sc.nextDouble(), sc.nextDouble(), sc.nextDouble()); 
            else
                machines[i] = new Pirate("Pirate", sc.nextDouble(), sc.nextDouble());
        }

        return machines; 
    }

    public static void main(String[] args){
        machines("setup.txt");
    }
}
