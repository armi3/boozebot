import Model.CustomerInterface;

public interface BoozebotInterface {
    boolean isEvil();

    void setEvil(boolean evil);

    // AQUI ES DONDE VA EL ARREGLO DONDE GANÉ MI APUESTA
    int newCustomer(ViewInterface view, CustomerInterface customer, boolean testing);

    String makeBeverage(int recipe);
}
