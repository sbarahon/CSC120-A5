/*
 * Shirt class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */
public class Shirt {

    /*
     * Prints ASCII art that depicts a shirt to the console
     */
    public void display() {
        System.out.println("         __,--./|.--,__");
        System.out.println("       .`   \\ \\ / /    `.");
        System.out.println("     .`      \\ | /       `.");
        System.out.println("    /   /     ^|^      \\   \\");
        System.out.println("   /   / |     |o     | \\   \\");
        System.out.println("  /===/  |     |      |  \\===\\");
        System.out.println(" /___/   |     |o     |   \\___\\");
        System.out.println("         |     |      |");
        System.out.println("         |     |o     |");
        System.out.println("         |_____/\\_____|");

    }

    /* Constructs a Shirt object and displays it to the console
     * @param String[] args
     */
    public static void main(String[] args) {
        Shirt myShirt = new Shirt();
        myShirt.display();
    }
}
