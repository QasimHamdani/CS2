// CoffeeDrink object class

import java.sql.SQLOutput;

class CoffeeDrink {

    int numberOfCups;
    String flavor;
    boolean hasWhippedCream;



    // Constructor for CoffeeDrink class
    public CoffeeDrink(int pnumberOfCups, String pflavor, boolean phasWhippedCream) {
        // TODO
        // Edit this constructor to accept three parameters,
        // one for each CoffeeDrink variable.
        // Assign those parameter values to the class-wide variables.
        numberOfCups=pnumberOfCups;
        flavor=pflavor;
        hasWhippedCream=phasWhippedCream;

    }

    // Method to print information about the CoffeeDrink
    public void printInfo() {
        // TODO
        // Make this method print order details.
        // Include information stored in each variable.
        System.out.println("Number of cups: "+numberOfCups + ". Flavor: "+flavor + ". Has Whipped Cream: "+hasWhippedCream+".");
    }
}
