import Model.Customer;

import java.util.Random;

public class Boozebot {

    private CustomerInterface customer;
    private BeverageInterface beverage;
    private ViewInterface view;
    private boolean evil;

     Boozebot(CustomerInterface customer, BeverageInterface beverage, ViewInterface view){
        this.customer = customer;
        this.beverage = beverage;
        this.view = view;
        Random random = new Random();
        evil = random.nextBoolean();
    }

    public CustomerInterface getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerInterface customer) {
        this.customer = customer;
    }

    public BeverageInterface getBeverage() {
        return beverage;
    }

    public void setBeverage(BeverageInterface beverage) {
        this.beverage = beverage;
    }

    public ViewInterface getView() {
        return view;
    }

    public void setView(ViewInterface view) {
        this.view = view;
    }

    public boolean isEvil() {
        return evil;
    }

    public void setEvil(boolean evil) {
        this.evil = evil;
    }

    public int newCustomer(){
         getCustomer().setName(getView().promptName());
         getCustomer().setAge(getView().promptAge());




         if (getCustomer().getAge()>18){
             getBeverage().setAlcoholic(true);
         }
         // if/elses

         getView().showResults(getBeverage().getDescription());

    }
}
