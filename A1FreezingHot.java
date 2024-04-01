class A1FreezingHot extends ConsoleProgram {

  /**
  * A program A1FrezzingHot.java given two temperatures via user input, output true if one is less than 0 and the other is greater than 100.
  * @author: H. Rahukulan
  */
  
  public void run() {
    
    // Declare Variables
    int intTemp1;
    int intTemp2;

    // User Input
    intTemp1 = readInt("What is the first temp? ");
    intTemp2 = readInt("What is the second temp? ");

    // Processing & Output 
      if (intTemp1 >= 0 && intTemp1 <= 100 && intTemp2 <= 100 && intTemp2 > 0){
        System.out.println("true");
      }
      else {
        System.out.println("false");
      }
  }
}
