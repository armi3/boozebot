public interface ViewInterface {
    String getMenu();

    int promptActionWithMenu();

    int promptAction();

    String[] promptCustomerNames();

    int promptCustomerAge();

    String askIfCocktail(int age);

    int promptCustomerIdentity();

    int promptBeverageColor();

    int promptBeverageFlavor();

    void showResults(String description);
}
