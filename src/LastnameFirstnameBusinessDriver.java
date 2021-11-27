import java.util.Scanner;

public class LastnameFirstnameBusinessDriver {
    public static void main(String[] args) {
        String companyName = " Vegetarian restaurant";
        String ownerName = "Annabella";
        String decorativeLine = "#########################################";
        System.out.println(decorativeLine);
        System.out.println("Welcome to " + ownerName + "'s" + companyName + "!");
        System.out.println("I'm " + ownerName + " What is your name?");
        Scanner scr = new Scanner(System.in);
        String name = scr.nextLine();
        String greeting = "Here is what we serve, " + name + ". Have a look: ";
        System.out.println(greeting);
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
        for (int i= 0; i<=menu.length; i++){
            System.out.println(menu[i]);
        }
        System.out.println(decorativeLine);



    }
}
