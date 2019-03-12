import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public interface ViewInterface {

    static String getMenu() {
        String menu = "\n" +
                "------------- Main menu ------------- \n" +
                "0. Repeat menu \n" +
                "1. New customer\n" +
                "2. Exit\n" +
                "\nInput action (0-2): ";
        return menu;
    }

    static int promptActionWithMenu() {
        int menuChoice = 3;
        Scanner sc = new Scanner(System.in);
        System.out.print(getMenu());
        try {
            menuChoice = Integer.parseInt(sc.next(Pattern.compile("^([0-2])$")));
        }
        catch (InputMismatchException e) {
            System.out.print("\nInvalid input.");
        }
        return menuChoice;
    }

    static int promptAction() {
        int menuChoice;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nInput action (1-2) or 0 for menu: ");
        try {
            menuChoice = Integer.parseInt(sc.next(Pattern.compile("^([0-2])$")));
        }
        catch (InputMismatchException e) {
            menuChoice = 3;
        }
        return menuChoice;
    }

    static String[] promptCustomerNames(){
        String[] customerNames = new String[2];
        Scanner sc = new Scanner(System.in);
        System.out.print("\nWhat's customer's first name? (At least 3 characters) \n");
        try {
            customerNames[0] = sc.next(Pattern.compile("^[a-zA-Z\\s\\xE1\\xE9\\xED\\xF3\\xFA\\xC1\\xC9\\xCD\\xD3\\xDA]{3,}$"));
        }
        catch (InputMismatchException e) {
            customerNames[0] = "";
            return customerNames;
        }

        System.out.print("\nHey, " + customerNames[0] + "! Whats's your last name? \n");
        try {
            customerNames[1] = sc.next(Pattern.compile("^[a-zA-Z\\s\\xE1\\xE9\\xED\\xF3\\xFA\\xC1\\xC9\\xCD\\xD3\\xDA]{3,}$"));
        }
        catch (InputMismatchException e) {
            customerNames[1] = "";
            return customerNames;
        }
        return customerNames;
    }

    static int promptCustomerAge(){
        int customerAge = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nGood. What's your age? (Between 1 and 100 yo) \n");
        try {
            customerAge = Integer.parseInt(sc.next(Pattern.compile("^(100|[1-9]|[1-9][0-9])$")));
        }
        catch (InputMismatchException e) {
            customerAge = 0;
            return customerAge;
        }
        return customerAge;
    }

    static int promptAlcoholicContent(){
        int alcoholicContent = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nHow rekt are you looking forward to get?\n");
        System.out.print("\n1) Just chillin");
        System.out.print("\n2) Feeling lucky");
        try {
            alcoholicContent = Integer.parseInt(sc.next(Pattern.compile("^([1-2])$")));
        }
        catch (InputMismatchException e) {
            alcoholicContent = 0;
            return alcoholicContent;
        }
        return alcoholicContent;
    }

    static int promptCustomerIdentity(){
        Scanner sc = new Scanner(System.in);
        int id = 0;
        System.out.print("\nWhich of these do you relate the most? (1-3)");
        System.out.print("\n1) Winnie Pooh");
        System.out.print("\n2) Bubble from Power Puff Girls");
        System.out.print("\n3) Naruto");
        try {
            id = Integer.parseInt(sc.next(Pattern.compile("^([1-3])$")));
        }
        catch (InputMismatchException e) {
            return id;
        }
        return id;
    }

    static int promptCustomerSweetness(){
        Scanner sc = new Scanner(System.in);
        int color = 0;
        System.out.print("\nWhich do you prefer? (1-3)");
        System.out.print("\n1) Pink");
        System.out.print("\n2) The blood of your enemies");
        System.out.print("\n3) Blue, the warmest color");
        try {
            color = Integer.parseInt(sc.next(Pattern.compile("^([1-3])$")));
        }
        catch (InputMismatchException e) {
            return color;
        }
        return color;

    }

    static void showResults(String beverage){
        System.out.print("\nProcessing with all the ML power of the world...");
        System.out.print("\nTonight, your perfect drink is... \n");
        System.out.print(beverage);
    }


}
