import java.util.Scanner; 

/**
 *
 * @author 
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
     //Scanner for input
    Scanner input = new Scanner(System.in);
     // get the user to choose a positive integer
 System.out.println("Please enter a positive integer. Enter a negative integer to quit.");
 int number = input.nextInt();

 // do while loop
   
    
  while(number >= 0){
    System.out.println("Please enter a positive integer. Enter a negative integer to quit.");
  number = input.nextInt();
    }
  System.out.println("All done");
  }
}
