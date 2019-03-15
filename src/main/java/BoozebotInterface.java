import Model.CustomerInterface;

public interface BoozebotInterface {
    boolean isEvil();

    void setEvil(boolean evil);

    // AQUI ES DONDE VA EL ARREGLO DONDE GANÉ MI APUESTA
    int newCustomer(CustomerInterface customer);

    int calcBeverageRecipe(String[] names, int[] profile);

    String makeBeverage(int recipe);
}
