import Model.*;

public class Factory {

    public CustomerInterface createCustomer(){
        return new Customer();
    }

    public CustomerInterface createCustomer(String[] names, int age, int preferredIdentity, int preferredSweetness, int preferredAlcoholicContent){
        return new Customer(names, age, preferredIdentity, preferredSweetness, preferredAlcoholicContent);
    }

    public ViewInterface createView(){
        return new View();
    }

    public BoozebotInterface createBot(){ return new Boozebot(); }


}
