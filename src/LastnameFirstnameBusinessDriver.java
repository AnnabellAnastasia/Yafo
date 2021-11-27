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
        String greeting = "Hey there, " + name + "!";
        System.out.println(greeting);
        System.out.println(decorativeLine);



    }
}
