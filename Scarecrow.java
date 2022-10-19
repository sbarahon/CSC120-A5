/*
 * Scarecrow class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */

class Scarecrow {

    /* Parts of the Scarecrow defined
     */
    private Pumpkin head;
    private Shirt body;
    private Pants legs;
    private Boot leftFoot;
    private Boot rightFoot;
    private String message;

    /* Constructs the scarecrow given the inputted values of its individual parts and a default message
    @param h the Pumpkin object that will be the head, b the Shirt object that will be the body, l the Pants object that will
    be the legs, lf the Boot object that will be the left foot, rf the Boot object that will be the right foot
     */
    public Scarecrow(Pumpkin h, Shirt b, Pants l, Boot lf, Boot rf) {
        head = h;
        body = b;
        legs = l;
        leftFoot = lf;
        rightFoot = rf;
        message = "Hello there!";

    }

    /* Displays the Scarecrow by displaying it's individual parts in order
    */
    public void display() {
        head.display();
        body.display();
        legs.display();
        leftFoot.display();
        rightFoot.display();
    }

    /* Constructs Scarecrow object and checks if value was inputted through command line that will replace default message
     * @param String[] args a string array
     */
    public static void main(String[] args) {

        Scarecrow myScarecrow = new Scarecrow(new Pumpkin(), new Shirt(), new Pants(), new Boot("left"), new Boot("right"));

        // If a message was passed in on the command line, extract and store it
        // TODO: in Step 4, you'll pass this value along to your Banner constructor
        if (args.length > 0) {
            myScarecrow.message = args[0];
        }

        Banner the_message = new Banner(myScarecrow.message);

        the_message.display(); 
        myScarecrow.display();
    }

}
