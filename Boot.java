/*
 * Boot class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */
public class Boot {
  
    private String direction;
  
    /* Constructs the boot object given the inputted direction
     * @param direction the string which encodes which direction the boot will be drawn in
     */
    public Boot(String direction) {
        this.direction = direction.toLowerCase();
    }

    /*
     * Prints ASCII art of a boot to the console given which direction it is defined in
     */
    public void display() {
        if (this.direction.equals("left")) {
          System.out.print("       <|______|");
        } else if (this.direction.equals("right")) {
          System.out.print("|______|>");
        } else {
          System.out.println("Which boot?");
        }
    }

    /* Creates an instance of a left Boot object and a right Boot object and displays both objects to the console
     * @param String[] args string array
     */
    public static void main(String[] args) {
        Boot myLeftBoot = new Boot("left");
        Boot myRightBoot = new Boot("right");
        myLeftBoot.display();
        myRightBoot.display();
    }
}
