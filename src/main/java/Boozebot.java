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
    public int newCustomer(CustomerInterface customer){
        String beverage;
        beverage = makeBeverage(calcBeverageRecipe(customer.getNames(),customer.getProfile()));
        ViewInterface.showResults(beverage);
        return 0;
    }

    @Override
    public int calcBeverageRecipe(String[] names, int[] profile) {
        int firstNameLenghtCase = names[0].length();
        int preferredIdentityCase = profile[1];
        int preferredSweetnessCase = profile[2];
        int preferredAlcoholicContentCase = profile[3];

        if(preferredAlcoholicContentCase==0 && preferredIdentityCase!=3){
            return 6; //chocolate milk
        }
        else if (preferredAlcoholicContentCase==1 && firstNameLenghtCase<=5){
            return 2; //vodka
        }
        else if (preferredAlcoholicContentCase==1 && preferredSweetnessCase==1){
            return 5; // strawberry
        }
        else if (preferredAlcoholicContentCase==2 && preferredSweetnessCase==2){
            return 4; // absinthe
        }
        else if (preferredAlcoholicContentCase==1 && preferredSweetnessCase==3){
            return 1; // vodka martini
        }
        else if (preferredAlcoholicContentCase==1 && preferredIdentityCase==3){
            return 3; // sake
        }
        else {
            return 7; // water
        }
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
