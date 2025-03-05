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

    // if command is to move left
    if(comm.equals("left")){
      pos --;

      // go to rightmost if cannot move more left
      if(pos < 0) 
        pos = m.length - 1;
    }
    
    // if command is to move right
    else if(comm.equals("right")){
      pos ++;

      // go to leftmost if cannot move more right
      if(pos >= m.length) 
        pos = 0;
    }
    
    // if command is to play 
    else if(comm.equals("play")){
      // play() returns a double which is the payout (or 0 if loss)

      // check that this slot is "in service"
      if(m[pos].inService()){
        boolean status = m[pos].win();
        playerMoney += m[pos].play(status);
      }
      // if slot is out of service
      else{
        System.out.println("Sorry, this slot is out of service.");
      }
    }
    
    // if command is to get the report
    else if(comm.equals("*report")){
      for(int i = 0 ; i < m.length; i ++){
	      System.out.println(m[i].report());
      }
    }
    
    // if command is to quit
    else if(comm.equals("quit")){
      
    }
    // otherwise, bad command 
    else{
      System.out.println("Invalid Command");
    }
  }
  
}
