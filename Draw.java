public class Draw{

  // This works
  public static void show(Machine[] m, int pos){
    // Print out the boxes
    for(int i = 0; i < 5; i ++){
      for(int j = 0; j < m.length; j ++){
	char c = (j == pos ? '#' : '-');
	if(i == 0 || i == 4){
	  for(int k = 0; k < 10; k ++){
	    System.out.print(c);
	  }
	  System.out.print("  ");
	}
	if(i == 1 || i == 3){
	  System.out.print(c + "        " + c + "  ");
	}
	if(i == 2){
	  String name = m[j].getName();
	  System.out.print(c);
	  int n = (8 - name.length()) / 2;
	  for(int k = 0; k < n; k ++){
	    System.out.print(' ');
	  }
	  System.out.print(name);
	  for(int k = 0; k < n; k ++){
	    System.out.print(' ');
	  }
	  System.out.print(c + "  ");
	}
      }
      System.out.println();
    }
  }

  public static void main(String[] args){
    /*
    Machine[] m = new Machine[5];
    m[0] = new Machine("Yoda", 0.1, 0.1);
    m[1] = new Machine("Yoda", 0.1, 0.1);
    m[2] = new Machine("Yoda", 0.1, 0.1);
    m[3] = new Machine("Yoda", 0.1, 0.1);
    m[4] = new Machine("Yoda", 0.1, 0.1);
    show(m, 4);
    */
  }
}
