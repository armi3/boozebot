import Model.*;

public class Factory {

    public CustomerInterface createCustomer(){
        return new Customer();
    }

    public BeverageInterface createBeverage(){
        return new Beverage();
    }

    public ViewInterface createView(){
        return new View();
    }

    public BoozebotInterface createBot(CustomerInterface customer, BeverageInterface beverage, ViewInterface view){
        return new Boozebot(customer, beverage, view);
    }


}
