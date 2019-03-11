public class Main {
    public static void main(String[] args) {
        Factory factory = new Factory();
        BoozebotInterface bot = factory.createBot(
                factory.createCustomer(),
                factory.createBeverage(),
                factory.createView());

        int menuChoice = 0;
        do{
            switch(menuChoice) {
                case 0:
                    menuChoice = bot.getView().promptActionWithMenu();
                    break;
                case 1:
                    menuChoice = bot.newCustomer();
                    break;
                case 3:
                    menuChoice = bot.getView().promptAction();
                    break;
            }

        } while(!String.valueOf(menuChoice).equals("2"));
        System.exit(0);

    }

}
