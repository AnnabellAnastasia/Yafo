import java.util.Scanner;

/**
 * LastnameFirstnameBusinessDriver.java
 *
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
        Scanner scanner = new Scanner(System.in);
        String companyName = " Mani Deli";
        String ownerName = "Annabella";
        System.out.println("Welcome to" + companyName + "!");
        System.out.println("My name is " + ownerName);
        System.out.print("What is your name? ");
        String userName = scanner.nextLine();
        System.out.println("Hey there, " + userName + "!");
        System.out.println();
        System.out.println(decorativeLine);

        String greeting = "Here is what we serve, " + userName + ". Have a look: ";
        System.out.println();
        System.out.println(greeting);

        Item[] menuItemList = new Item[10];
        menuItemList[0] = new Item("Fried rice", 1, 4.99);
        menuItemList[1] = new Item("Lentil Soup", 2, 5.99);
        menuItemList[2] = new Item("Baked Falafel", 3, 5.99);
        menuItemList[3] = new Item("Vegetarial Tacos", 4, 4.89);
        menuItemList[4] = new Item("Soba Noodles", 5, 5.87);
        menuItemList[5] = new Item("Paella", 6, 3.79);
        menuItemList[6] = new Item("Minestrone soup", 7, 10.88);
        menuItemList[7] = new Item("Red Curry", 8, 14.99);
        menuItemList[8] = new Item("Casserole", 9, 5.99);
        menuItemList[9] = new Item("Burrito Bowls", 10, 14.99);
        for (int i = 0; i < menuItemList.length; i++) {
            int count = i + 1;
            System.out.println(count + ". " + menuItemList[i].getName());

        }

        System.out.println("How many dishes are you ordering today?");
        int numberOfItemsDesired = scanner.nextInt();
        //DECLARING AN ARRAY OF ITEMS AND ALLOCATING MOMORY OF NUMBEROFITEMSDESIRE
        Item[] orderedItemsList = new Item[numberOfItemsDesired];

        // loop to add all items into the array
        for (int i = 0; i < numberOfItemsDesired; i++) {
            System.out.println("What’s item # ?");
            int userInputDish = scanner.nextInt();
            scanner.nextLine();  //to skip the new line left-over from nextInt()
            //INITIALISING ELEMENT OF THE ARRAY
            // System.out.println(menuItemList[userInputDish]);
            orderedItemsList[i] = menuItemList[userInputDish - 1];
            // System.out.println(orderedItemsList[i]);
        }
        //System.out.println(orderedItemsList[0]);
        // System.out.println(orderedItemsList[1]);
        System.out.println("Your order is: ");

        for (int i = 0; i < orderedItemsList.length; i++) {
            System.out.println(orderedItemsList[i].getName());
        }
        int waitingTime = numberOfItemsDesired * 4;
        System.out.println("your order will be ready in " + waitingTime + " minutes");

        System.out.println("Your order is ready. Please, confirm that it is complete. Press 0 for incomplete and 1 for complete order");
        int i = scanner.nextInt();
        if(i ==0){
            System.out.println("How many items are you missing?");
            int missingItem= scanner.nextInt();
            //int[] missingItems = new int[missingItem];
            for(int j =0; j < missingItem; j++ ){
                System.out.println("Which dish number from menu do you miss?");
                int missingItemsNumber =scanner.nextInt();
                System.out.println("Thank you for you help. Missing item(s) "+ menuItemList[missingItemsNumber-1].getName()+ " will be here shortly");
            }

        }else{
            System.out.println("Thank you for your order. Enjoy your food.");
        }
        double totalPrice = 0;
        System.out.println("Your total for today will be: ");
        for (int m = 0;m< orderedItemsList.length; m++){
             totalPrice += orderedItemsList[m].getPrice();
        }
        System.out.println("$ "+ totalPrice);

    }
}
