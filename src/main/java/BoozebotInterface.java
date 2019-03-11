import Model.BeverageInterface;
import Model.CustomerInterface;

public interface BoozebotInterface {
    CustomerInterface getCustomer();

    void setCustomer(CustomerInterface customer);

    BeverageInterface getBeverage();

    void setBeverage(BeverageInterface beverage);

    ViewInterface getView();

    void setView(ViewInterface view);

    boolean isEvil();

    void setEvil(boolean evil);

    int newCustomer();

    String makeBeverage();
}
