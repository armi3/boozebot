import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class View implements ViewInterface {

    private String menu = "\n" +
            "------------- Main menu ------------- \n" +
            "0. Repeat menu \n" +
            "1. New customer\n" +
            "2. Exit\n" +
            "\nInput action (0-2): ";

    public String getMenu() {
        return menu;
    }

    public int promptActionWithMenu() {
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

    public int promptAction() {
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

    public String[] promptCustomerNames(){
        String[] customerNames = new String[2];
        Scanner sc = new Scanner(System.in);
        System.out.print("\nWhat's customer's first name? \n");
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

    public int promptCustomerAge(){
        int customerAge = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("\nGood. What's your age? (Between 1 and 100 yo) \n");
        try {
            customerAge = Integer.parseInt(sc.next(Pattern.compile("^(100|[1-9][0-9])$")));
        }
        catch (InputMismatchException e) {
            customerAge = 0;
            return customerAge;
        }
        return customerAge;
    }

    public String askIfCocktail(int age){
        Scanner sc = new Scanner(System.in);
        String yn = "";

        if(age < 18){
            System.out.print("\nCool.\n");
            return "n";

        } else {
            System.out.print("\nCool. Want an alcohol in your cocktail? (y/n)\n");
            try {
                yn = sc.next(Pattern.compile("^(y|n)$"));
            }
            catch (InputMismatchException e) {
                return yn;
            }
            return yn;
        }
    }

    public int promptCustomerIdentity(){
        Scanner sc = new Scanner(System.in);
        int id = 0;
        System.out.print("\nWhich of these do you relate the most? (1-3)");
        System.out.print("\n1) Olives");
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

    public int promptBeverageColor(){
        Scanner sc = new Scanner(System.in);
        int color = 0;
        System.out.print("\nWhich do you prefer? (1-3)");
        System.out.print("\n1) Pink");
        System.out.print("\n2) Black");
        System.out.print("\n3) Colorless");
        try {
            color = Integer.parseInt(sc.next(Pattern.compile("^([1-3])$")));
        }
        catch (InputMismatchException e) {
            return color;
        }
        return color;

    }

    public int promptBeverageFlavor(){
        Scanner sc = new Scanner(System.in);
        int flavor = 0;
        System.out.print("\nWhat would you prefer rn? (1-3)");
        System.out.print("\n1) Sour");
        System.out.print("\n2) Dry");
        System.out.print("\n3) Surprise");
        try {
            flavor = Integer.parseInt(sc.next(Pattern.compile("^([1-3])$")));
        }
        catch (InputMismatchException e) {
            return flavor;
        }
        return flavor;

    }

    public void showResults(String description){
        System.out.print("\nProcessing with all the ML power of the world...");
        System.out.print("\nTonight, your perfect drink is... \n");
        System.out.print(description);
    }


}
