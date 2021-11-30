import java.util.Scanner;

/**
 * LastnameFirstnameBusinessDriver.java
 * @author annabellawilkins
 * @since 11.2021
 * This class sets up food service
 */
public class LastnameFirstnameBusinessDriver {
    public static void main(String[] args) {
        // my place is called “Mani Deli”
        // 1) large drink, 2) medium drink, 3) meat taco, 4) chicken snack, 5) cookies ...
        String decorativeLine = "#########################################";
        System.out.println(decorativeLine);
        System.out.println();
        Scanner aScanner = new Scanner(System.in);
        String companyName = " Mani Deli";
        String ownerName = "Annabella";
        System.out.println("Welcome to" + companyName + "!");
        System.out.println("My name is " + ownerName);
        System.out.print("What is your name? ");
        String userName = aScanner.nextLine();
        System.out.println("Hey there, " + userName + "!");
        System.out.println();
        System.out.println(decorativeLine);

        String greeting = "Here is what we serve, " + userName + ". Have a look: ";
        System.out.println();

        System.out.println(greeting);
        System.out.println("     Menu");
        String[] menu = {
                "Fried rice",
                "Lentil Soup",
                "Baked Falafel",
                "Vegetarial Tacos",
                "Soba Noodles",
                "Paella",
                "Minestrone soup",
                "Red Curry",
                "Casserole",
                "Burrito Bowls"};

        for (int i = 0; i < menu.length; i++) {
            int counter = i + 1;
            System.out.println(counter + ".  " + menu[i]);
        }

        System.out.println("How many dishes are you ordering today?");
        String userInputNumber = aScanner.nextLine();
        int numberOfItems = Integer.parseInt(userInputNumber);
        //String[] orderedItems = new String[numberOfItems];
        int[] orderedItems = new int[numberOfItems];
        // loop to add all items into the array
        for (int i = 0; i < numberOfItems; i++) {
            System.out.println("What’s item # ?");
            String userInputDish = aScanner.nextLine();
            int nameOfItems = Integer.parseInt(userInputDish);
            orderedItems[i] = nameOfItems;
        }
//loop to print all the items in the array
        for (int i = 0; i < orderedItems.length; i++) {
            System.out.println("You have ordered " + menu[orderedItems[i]]);
        }
        System.out.println("Thank you, " + userName + ". Your order will be ready in 10 minutes.");
    }
}
