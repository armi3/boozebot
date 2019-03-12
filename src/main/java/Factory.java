import Model.*;

public class Factory {

    public CustomerInterface createCustomer(){
        return new Customer();
    }

    public BoozebotInterface createBot(){ return new Boozebot(); }

}
