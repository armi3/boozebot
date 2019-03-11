import Model.CustomerInterface;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        BoozebotInterface bot = factory.createBot();
        ViewInterface view = factory.createView();
        CustomerInterface customer = factory.createCustomer();

        int menuChoice = 0;
        do{
            switch(menuChoice) {
                case 0:
                    menuChoice = view.promptActionWithMenu();
                    break;
                case 1:
                    menuChoice = bot.newCustomer(view, customer, false);
                    break;
                case 3:
                    menuChoice = view.promptAction();
                    break;
            }

        } while(!String.valueOf(menuChoice).equals("2"));
        System.exit(0);

    }

}
