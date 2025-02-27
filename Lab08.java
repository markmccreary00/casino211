import java.util.*;

public class Lab08{

  public static void main(String[] args){
    Machine[] m = new Machine[5];
    m[0] = new Machine("Yoda", 0.1, 0.1);
    m[1] = new Machine("Yoda", 0.1, 0.1);
    m[2] = new Machine("Yoda", 0.1, 0.1);
    m[3] = new Machine("Yoda", 0.1, 0.1);
    m[4] = new Machine("Yoda", 0.1, 0.1);

    Scanner sc = new Scanner(System.in);
    String cmd;
    Manager man = new Manager(m, 7.25);
    do{
      System.out.println();
      man.draw();
      System.out.print("> ");
      cmd = sc.next();
      man.exec(cmd);
    }while(!cmd.equals("quit"));
  }
  
}
