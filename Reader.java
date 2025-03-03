import java.io.*;
import java.util.*;


public class Reader{

    public static Machine[] machines(String fname){

        Scanner sc = null;
        try { sc = new Scanner(new FileReader(fname)); } 
        catch(IOException e) { e.printStackTrace(); System.exit(1); }

        // get number of machines 
        int num = sc.next().length();

        Machine[] machines = new Machine[num];


        for(int i = 0; i < num; i++){
	  // TODO: read in data and instantiate for each machine
	  machines[i] = new Yoda("Yoda", 0.5, 8, 2);
	  // if yoda, read in extra thing for probability 
        }

        return machines; 
    }

    public static void main(String[] args){
        machines("setup.txt");
    }
}
