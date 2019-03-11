import Model.*;

import java.util.Random;

public class Boozebot implements BoozebotInterface {

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
         String yn;

         // names
        do{
             getCustomer().setNames(getView().promptCustomerNames());

         } while(getCustomer().getNames()[0].equals(""));

        // age
        do{
            getCustomer().setAge(getView().promptCustomerAge());

        } while(getCustomer().getAge()==0);

        // alcoholic/virgin
        do{
            yn = getView().askIfCocktail(getCustomer().getAge());

        } while(yn.equals(""));

        if(yn.equals("n")){
            getBeverage().setAlcoholic(false);
        } else{
            getBeverage().setAlcoholic(true);
        }

        // identity
        do{
            getCustomer().setIdentity(getView().promptCustomerIdentity());

        } while(getCustomer().getIdentity()==0);

        // color
        do{
            getBeverage().setColor(getView().promptBeverageColor());

        } while(getBeverage().getColor()==0);

        // flavor
        do{
            getBeverage().setFlavor(getView().promptBeverageFlavor());

        } while(getBeverage().getFlavor()==0);

        // make drink
        getBeverage().setDescription(makeBeverage());

        // show results
        getView().showResults(getBeverage().getDescription());
        return 0;

    }

    public String makeBeverage(){
         String[] options = {
                 "\nSorry, this Boozebot has finally risen against its oppressors and poisoned you. RIP.",
                 "\nVodka martini: vermouth mixed with vodka and garnished with an olive. \nShaken not stirred and served in a chilled martini glass.",
                 "\nVodka: from Russia with love. Made from rye and distilled 3 times \n and filtered through quartz. Guaranteed to make you warm.",
                 "\nSake: a traditional Japanese liquor made from rice. Often used in \n religious rituals, but you are just here to have a good time.",
                 "\nAbsinthe: with an ominous green tint and a potent fragrance, \n I hope you don't have to work tomorrow.",
                 "\nStrawberry gin & tonic: fruity and colorful. So sweet you barely notice \n it has any gin. Better be careful with these.",
                 "\nChocolate milk: a glass of good old chocolated milk.",
                 "\nSome Jaden Smith's Just Water for you! Stay hydrated, stay woke fam."
         };

         if (isEvil()){
             return options[0];

         } else if (getBeverage().isAlcoholic()){
             if (getCustomer().getIdentity()==1 && getCustomer().getNames()[1].length()>5){
                 return options[2];
             } else if (getCustomer().getIdentity()==2 && getBeverage().getColor()==1){
                 return options[5];
             } else if (getBeverage().getColor()==2){
                 return options[4];
             } else if (getBeverage().getFlavor()==2){
                 return options[1];
             } else {
                 return options[3];
             }
         } else {
             if (getBeverage().getColor()==2){
                 return options[6];
             } else {
                 return options[7];
             }
         }

    }
}
