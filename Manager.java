public class Manager {

  Machine[] m;
  double playerMoney;
  int pos;
  
  public Manager(Machine[] m, double playerMoney){
    this.m = m;
    pos = 0;
    this.playerMoney = playerMoney;
  }

  // Draw money and machines
  public void draw(){
    System.out.println("<<<<<<< You have $" + playerMoney + ">>>>>>>");
    Draw.show(m, pos);
  }

  // execute left/right/play/*report
  public void exec(String comm){
    if(comm.equals("left")){
      pos --;
      if(pos < 0) pos = m.length - 1;
    }else if(comm.equals("right")){
      pos ++;
      if(pos >= m.length) pos = 0;
    }else if(comm.equals("play")){
      // TODO: make sure the play works
      if(m[pos].inService()){
	//playerMoney += m[pos].play();
	//playerMoney -= 0.25;
      }
    }else if(comm.equals("*report")){
      for(int i = 0 ; i < m.length; i ++){
	m[i].report();
      }
    }else if(comm.equals("quit")){
      
    }else{
      System.out.println("Invalid Command");
    }
  }
  
}
