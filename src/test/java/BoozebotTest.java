import Model.Customer;
import Model.CustomerInterface;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import static org.testng.Assert.*;

public class BoozebotTest {

    @DataProvider(name = "Recipe")
    public Iterator<Object[]> Recipe(){
        List<Object[]>data=new ArrayList<>();
        for (int i = 17; i<=18; i++){
            for (int x = 1; x<=3; x++){
                for (int y = 1; y<=3; y++){
                    for (int z = 0; z<=2; z++){
                        data.add(new Integer[]{i,x,y,z});
                    }
                }
            }
        }
        return data.iterator();
    }

    @DataProvider(name = "beverage")
    public Iterator<Object[]> beverages(){
        List<Object[]>data=new ArrayList<>();
        for(int i = 0; i<8;i++){
            data.add(new Integer[]{i});
        }
        return data.iterator();
    }

    @Test(dataProvider = "Recipe")
    public void testCalcBeverageRecipe(int [] profile) {
        String [] name1 = new String[]{"Rei","Ayanami"};

        Boozebot bot= new Boozebot();
        Customer customer=new Customer(name1, profile[0],profile[1],profile[2],profile[3]);
        int actual = bot.calcBeverageRecipe(customer.getNames(),customer.getProfile());

        int expected=-1;
        if(customer.getProfile()[3]==0 && customer.getProfile()[1]!=3){
            expected = 6; //chocolate milk
        }
        else if (customer.getProfile()[3]==1 && customer.getNames()[0].length()<=5){
            expected =  2; //vodka
        }
        else if (customer.getProfile()[3]==1 && customer.getProfile()[2]==1){
            expected = 5; // strawberry
        }
        else if (customer.getProfile()[3]==2 && customer.getProfile()[2]==2){
            expected =  4; // absinthe
        }
        else if (customer.getProfile()[3]==1 && customer.getProfile()[2]==3){
            expected = 1; // vodka martini
        }
        else if (customer.getProfile()[3]==1 && customer.getProfile()[1]==3){
            expected =  3; // sake
        }
        else {
            expected = 7; // water
        }

        Assert.assertEquals(actual,expected);

        customer.setNames(new String[]{"Kaworu","Ikari"});
        customer=new Customer(name1, profile[0],profile[1],profile[2],profile[3]);

        if(customer.getProfile()[3]==0 && customer.getProfile()[1]!=3){
            expected = 6; //chocolate milk
        }
        else if (customer.getProfile()[3]==1 && customer.getNames()[0].length()<=5){
            expected =  2; //vodka
        }
        else if (customer.getProfile()[3]==1 && customer.getProfile()[2]==1){
            expected = 5; // strawberry
        }
        else if (customer.getProfile()[3]==2 && customer.getProfile()[2]==2){
            expected =  4; // absinthe
        }
        else if (customer.getProfile()[3]==1 && customer.getProfile()[2]==3){
            expected = 1; // vodka martini
        }
        else if (customer.getProfile()[3]==1 && customer.getProfile()[1]==3){
            expected =  3; // sake
        }
        else {
            expected = 7; // water
        }

        Assert.assertEquals(actual,expected);
    }




    @Test(dataProvider = "beverage")
    public void testMakeBeverage(int recipe) {
        Boozebot bot= new Boozebot();

        String actual = bot.makeBeverage(recipe);
        String expected = "";
        switch (recipe){
            case 0:
            expected= "\nSorry, this Boozebot has finally risen against its oppressors and poisoned you. RIP.";
            break;
            case 1:
                expected="\nVodka martini: vermouth mixed with vodka and garnished with an olive. \nShaken not stirred and served in a chilled martini glass.";
                break;
            case 2:
                expected =  "\nVodka: from Russia with love. Made from rye and distilled 3 times \n and filtered through quartz. Guaranteed to make you warm.";
                break;
            case 3:
                expected = "\nSake: a traditional Japanese liquor made from rice. Often used in \n religious rituals, but you are just here to have a good time.";
                break;
            case 4:
                expected=  "\nAbsinthe: with an ominous green tint and a potent fragrance, \n I hope you don't have to work tomorrow.";
                break;
            case 5:
                expected = "\nStrawberry gin & tonic: fruity and colorful. So sweet you barely notice \n it has any gin. Better be careful with these.";
                break;
            case 6:
                expected= "\nChocolate milk: a glass of good old chocolated milk.";
                break;
            case 7:
                expected= "\nSome Jaden Smith's Just Water for you! Stay hydrated, stay woke fam.";
                break;
        }

        Assert.assertEquals(actual,(expected));
    }
}