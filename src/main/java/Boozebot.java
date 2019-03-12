import Model.*;
import java.util.Random;

public class Boozebot implements BoozebotInterface {

    private boolean evil;

    Boozebot(){
        super();
        Random random = new Random();
        evil = random.nextBoolean();
    }

    @Override
    public boolean isEvil() {
        return evil;
    }

    @Override
    public void setEvil(boolean evil) {
        this.evil = evil;
    }

    // AQUI ES DONDE VA EL ARREGLO DONDE GANÉ MI APUESTA
    @Override
    public int newCustomer(CustomerInterface customer, int[] profile){
        String beverage;

        if(profile == null){
            do{ // names
                customer.setNames(ViewInterface.promptCustomerNames());
            } while(customer.getNames()[0].equals(""));

            do{ // age
                customer.setAge(ViewInterface.promptCustomerAge());
            } while(customer.getAge()==0);

            if(customer.getAge()>=18){
                do{ // may choose alcoholic content
                    customer.setPreferredAlcoholicContent(ViewInterface.promptAlcoholicContent());
                } while(customer.getPreferredAlcoholicContent()==0);
            }

            do{ // identity
                customer.setPreferredIdentity(ViewInterface.promptCustomerIdentity());
            } while(customer.getPreferredIdentity()==0);

            do{ // sweetness
                customer.setPreferredSweetness(ViewInterface.promptCustomerSweetness());
            } while(customer.getPreferredSweetness()==0);


        }
        // calculate customer's profile
        profile = customer.calcProfile();
        beverage = makeBeverage(CustomerInterface.calcBeverageRecipe(profile));
        ViewInterface.showResults(beverage);
        return 0;

    }

    @Override
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
