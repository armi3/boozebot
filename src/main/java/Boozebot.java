import Model.CustomerInterface;

import java.util.Random;

public class Boozebot implements BoozebotInterface {

    private boolean evil;

     Boozebot(){
        super();
        Random random = new Random();
        evil = random.nextBoolean();
    }

    public boolean isEvil() {
        return evil;
    }

    public void setEvil(boolean evil) {
        this.evil = evil;
    }

    // AQUI ES DONDE VA EL ARREGLO DONDE GANÉ MI APUESTA
    public int newCustomer(ViewInterface view, CustomerInterface customer, boolean testing){
         String yn;

         if(testing){
             view.showResults(makeBeverage(customer.calcBeverageRecipe(customer.calcProfile())));

         } else{
             // names
             do{
                 customer.setNames(view.promptCustomerNames());

             } while(customer.getNames()[0].equals(""));

             // age
             do{
                 customer.setAge(view.promptCustomerAge());

             } while(customer.getAge()==0);

             // alcoholic/virgin
             do{
                 yn = view.askIfCocktail(customer.getAge());

             } while(yn.equals(""));

             if(yn.equals("n")){
                 customer.setPreferredAlcoholicContent(0);
             } else {
                 customer.setPreferredAlcoholicContent(1);
             }

             // identity
             do{
                 customer.setPreferredIdentity(view.promptCustomerIdentity());

             } while(customer.getPreferredIdentity()==0);

             // sweetness
             do{
                 customer.setPreferredSweetness(view.promptCustomerSweetness());

             } while(customer.getPreferredSweetness()==0);


             // show results
             view.showResults(makeBeverage(customer.calcBeverageRecipe(customer.calcProfile())));

         }

        return 0;

    }

    public String makeBeverage(int recipe){
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

         } else {
             return options[recipe];
         }

    }
}
