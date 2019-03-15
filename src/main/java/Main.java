import Model.CustomerInterface;

public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();

        int menuChoice = 0;
        do{
            switch(menuChoice) {
                case 0:
                    menuChoice = ViewInterface.promptActionWithMenu();
                    break;
                case 1:
                    CustomerInterface customer = factory.createCustomer();
                    BoozebotInterface bot = factory.createBot();
                    customer.setNames(ViewInterface.promptCustomerNames());
                    customer.setProfile(ViewInterface.profile());
                    menuChoice = bot.newCustomer(customer);
                    break;
                case 3:
                    menuChoice = ViewInterface.promptAction();
                    break;
            }

        } while(!String.valueOf(menuChoice).equals("2"));
        System.exit(0);

    }

}
