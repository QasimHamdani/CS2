import java.util.Random;

/**
 * CS2 Review Assignment!
 * Do NOT use ChatGPT or any other generative AI to assist you with this assignment
 * You may reference your own past work and the internet (not including AI)
 */

public class JavaBeansAndBytes {

    // Variables for the CoffeeShop
    String name;
    boolean isOpen;
    int yearFounded;
    public CoffeeDrink Expresso;
    public CoffeeDrink ChocoMonster;
    public String water;


    public static void main(String[] args) {
        // Create a new CoffeeShop instance to run everything.
        JavaBeansAndBytes cafe = new JavaBeansAndBytes();
    }

    // Constructor for CoffeeShop
    public JavaBeansAndBytes() {
        name = "Java Beans & Bytes: The Code Café";
        isOpen = true;
        yearFounded = 1995;

        System.out.println("Welcome to " + name + "!");
        if (isOpen) {
            System.out.println("We are open!");
        } else {
            System.out.println("We are closed :(");
        }
        System.out.println("We were founded in " + yearFounded + ".");

        // TODO
        // Update the year founded and print the new yearFounded in a sentence
        yearFounded=2024;
        System.out.println("We were founded in " + yearFounded + ".");
        // Calling methods
        randomDiscount();
        // TODO
        // Add parameter to specialOfTheDay (drink of your choice)
        specialOfTheDay("water");
        countCups();
        baristasChoice();

        // TODO
        // Create two CoffeeDrink objects
            Expresso= new CoffeeDrink(5, "mocha", true);
            ChocoMonster = new CoffeeDrink( 3, "ChocoExtreme", true);
            Expresso.setFlavor("Water");
        // TODO
        // Print out the order details
            Expresso.printInfo();
            ChocoMonster.printInfo();
            String newSpecial = Expresso.getFlavor();
            specialOfTheDay(newSpecial);
    }


    // Method to generate a random discount
    public void randomDiscount() {
        // TODO
        // Make this method generate a random integer discount (0-30%)
        // and print the result.
        int discount = (int)(Math.random()*31);
        System.out.println("you have recieved a " +discount + "% discount");
    }

    // Method with a parameter for the special of the day
    public void specialOfTheDay(String pwater) {
        water=pwater;

        System.out.println("Today's special is "+ water);
        // TODO
        // Make this method accept a parameter representing the day’s special.
        // Print the day's special.
    }

    // Method to show loops
    public void countCups() {
        System.out.println("Counting cups sold today:");

        // TODO
        // Write three different for loops that print the indicated numbers:
        for(int i =1; i<=5; i=i+1){
            System.out.println(i);
        }
        for (int x=2; x<=11; x=x+3){
            System.out.println(x);
        }
        for(int t=8; t>=0; t--){
            System.out.println(t);
        }
        // Print 1 to 5


        // Print 2, 5, 8, 11


        // Print 8 to 0

    }

    // Method to recommend a coffee based on a random number
    public void baristasChoice() {
        // TODO
        // Make this method generate a random decimal between 0 and 1
        // and print one of four drink recommendations based on its value.
    double bradford = Math.random();
    if(bradford < .25){
        System.out.println("water");
    }
    else if (bradford< .5){
        System.out.println("ChocoMilk");
    }
    else if (bradford<.75){
        System.out.println("apple juice");
    }
    else{
        System.out.println("lemonade");
    }
    }
}

