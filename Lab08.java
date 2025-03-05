import java.util.*;

public class Lab08{

  // This class works
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    if(args.length == 0){
      System.out.println("usage java Lab08 <initWallet> <setupFile>");
      return;
    }
    else{
      double playerMoney = Double.parseDouble(args[0]);
      String fname = args[1];
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
  
}
