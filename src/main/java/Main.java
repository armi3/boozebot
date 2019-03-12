import Model.CustomerInterface;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        ViewInterface view = factory.createView();
        CustomerInterface customer = factory.createCustomer();
        BoozebotInterface bot = factory.createBot();

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
