import java.util.*;

public class Lab08{

  // This class works
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double playerMoney = sc.nextDouble();
    String fname = sc.next();
    String cmd;
    Manager man = new Manager(Reader.machines(fname), playerMoney);
    do{
      System.out.println();
      man.draw();
      System.out.print("> ");
      cmd = sc.next();
      man.exec(cmd);
    }while(!cmd.equals("quit"));
  }
  
}
