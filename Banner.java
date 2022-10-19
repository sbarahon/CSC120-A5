/*
 * Banner class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */
public class Banner {
    
    /* Message to print on Banner */
    private String message;

    /* Constructs the banner object with the message as an attribute
     * @param m the string to be created into a banner
     */
    public Banner(String m) {
        this.message = m;
    }

    /*
     * Modifies message as a banner and prints it to the console
     */
    public void display() {

        String middle = "*** ~ " + this.message + "! ~ ***";

        int len = middle.length();
        String top ="  " + "*".repeat(len-4);

        String inside =" ***" + "~".repeat(len-8) + "***";

        String bottom = top.subSequence(0, len-6) + "  ***";

        String tail = " ".repeat(bottom.length()-5).concat("\\/");

        System.out.println(top);
        System.out.println(inside);
        System.out.println(middle);
        System.out.println(inside);
        System.out.println(bottom);
        System.out.println(tail);        
    }

    /* Runs the program which constructs an instance of a Banner object and displays it
     * @param String[] args a string array
    */
    public static void main(String[] args) {
        Banner myBanner = new Banner("Hello world");
        myBanner.display();
    }
}
