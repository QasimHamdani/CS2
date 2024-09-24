// CoffeeDrink object class

import java.sql.SQLOutput;

class CoffeeDrink {

    private int numberOfCups;
   private  String flavor;
   private  boolean hasWhippedCream;



    // Constructor for CoffeeDrink class
    public CoffeeDrink(int numberOfCups, String flavor, boolean hasWhippedCream) {
        // TODO
        // Edit this constructor to accept three parameters,
        // one for each CoffeeDrink variable.
        // Assign those parameter values to the class-wide variables.
        this.numberOfCups= numberOfCups;
        this.flavor=flavor;
        this.hasWhippedCream=hasWhippedCream;

    }

    public void setFlavor(String newFlavour){
        flavor=newFlavour;
    }
    public String getFlavor(){
        return flavor;
    }

    public void setNumberOfCups(int numberOfCups) {
        this.numberOfCups = numberOfCups;
    }

    public int getNumberOfCups() {
        return numberOfCups;
    }

    public void setHasWhippedCream(boolean hasWhippedCream) {
        this.hasWhippedCream = hasWhippedCream;
    }

    public boolean hasWhippedCream() {
        return hasWhippedCream;
    }
    public CoffeeDrink(){
        numberOfCups=6;
        flavor="Hazelnut";
        hasWhippedCream=true;
    }

    // Method to print information about the CoffeeDrink
    public void printInfo() {
        // TODO
        // Make this method print order details.
        // Include information stored in each variable.
        System.out.println("Number of cups: "+numberOfCups + ". Flavor: "+flavor + ". Has Whipped Cream: "+hasWhippedCream+".");
    }

}