/*
 * Pants class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */
public class Pants {

    /*
     * Prints ASCII art to the console that display pants
     */
    public void display() {
        System.out.println("         |   | \\/  |  |");
        System.out.println("         |__/  ||  \\__|");
        System.out.println("         |     ||     |");
        System.out.println("         |     ||     |");
        System.out.println("         |     ||     |");
        System.out.println("         |     ||     |");
        System.out.println("         |     ||     |");
        System.out.println("         |_____||_____|");
    }

    /* Constructs an instance of the Pants object and displays it to the console
     * @param String[] args string array
    */
    public static void main(String[] args) {
        Pants myPants = new Pants();
        myPants.display();
    }
}
