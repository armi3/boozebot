import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class BoozebotTest {

    @DataProvider(name = "customerGenerator")
    public static Object[][] customerGenerator(){
        String[] moreThan5={"fernanda","gonzalez"};
        String[] lessThan5={"juan","elgueta"};
        return new Object[][]{
                {moreThan5,17,1,1,1},
                {moreThan5,17,1,1,2},
                {moreThan5,17,1,1,3},
                {moreThan5,17,1,2,1},
                {moreThan5,17,1,2,2},
                {moreThan5,17,1,2,3},
                {moreThan5,17,1,3,1},
                {moreThan5,17,1,3,2},
                {moreThan5,17,1,3,3},

                {moreThan5,17,2,1,1},
                {moreThan5,17,2,1,2},
                {moreThan5,17,2,1,3},
                {moreThan5,17,2,2,1},
                {moreThan5,17,2,2,2},
                {moreThan5,17,2,2,3},
                {moreThan5,17,2,3,1},
                {moreThan5,17,2,3,2},
                {moreThan5,17,2,3,3},

                {moreThan5,17,3,1,1},
                {moreThan5,17,3,1,2},
                {moreThan5,17,3,1,3},
                {moreThan5,17,3,2,1},
                {moreThan5,17,3,2,2},
                {moreThan5,17,3,2,3},
                {moreThan5,17,3,3,1},
                {moreThan5,17,3,3,2},
                {moreThan5,17,3,3,3},

                {moreThan5,19,1,1,1},
                {moreThan5,19,1,1,2},
                {moreThan5,19,1,1,3},
                {moreThan5,19,1,2,1},
                {moreThan5,19,1,2,2},
                {moreThan5,19,1,2,3},
                {moreThan5,19,1,3,1},
                {moreThan5,19,1,3,2},
                {moreThan5,19,1,3,3},

                {moreThan5,19,2,1,2},
                {moreThan5,19,2,1,3},
                {moreThan5,19,2,2,1},
                {moreThan5,19,2,2,2},
                {moreThan5,19,2,2,3},
                {moreThan5,19,2,3,1},
                {moreThan5,19,2,3,2},
                {moreThan5,19,2,3,3},

                {moreThan5,19,3,1,1},
                {moreThan5,19,3,1,2},
                {moreThan5,19,3,1,3},
                {moreThan5,19,3,2,1},
                {moreThan5,19,3,2,2},
                {moreThan5,19,3,2,3},
                {moreThan5,19,3,3,1},
                {moreThan5,19,3,3,2},
                {moreThan5,19,3,3,3},

                {lessThan5,17,1,1,1},
                {lessThan5,17,1,1,2},
                {lessThan5,17,1,1,3},
                {lessThan5,17,1,2,1},
                {lessThan5,17,1,2,2},
                {lessThan5,17,1,2,3},
                {lessThan5,17,1,3,1},
                {lessThan5,17,1,3,2},
                {lessThan5,17,1,3,3},

                {lessThan5,17,2,1,1},
                {lessThan5,17,2,1,2},
                {lessThan5,17,2,1,3},
                {lessThan5,17,2,2,1},
                {lessThan5,17,2,2,2},
                {lessThan5,17,2,2,3},
                {lessThan5,17,2,3,1},
                {lessThan5,17,2,3,2},
                {lessThan5,17,2,3,3},

                {lessThan5,17,3,1,1},
                {lessThan5,17,3,1,2},
                {lessThan5,17,3,1,3},
                {lessThan5,17,3,2,1},
                {lessThan5,17,3,2,2},
                {lessThan5,17,3,2,3},
                {lessThan5,17,3,3,1},
                {lessThan5,17,3,3,2},
                {lessThan5,17,3,3,3},

                {lessThan5,19,1,1,1},
                {lessThan5,19,1,1,2},
                {lessThan5,19,1,1,3},
                {lessThan5,19,1,2,1},
                {lessThan5,19,1,2,2},
                {lessThan5,19,1,2,3},
                {lessThan5,19,1,3,1},
                {lessThan5,19,1,3,2},
                {lessThan5,19,1,3,3},

                {lessThan5,19,2,1,1},
                {lessThan5,19,2,1,2},
                {lessThan5,19,2,1,3},
                {lessThan5,19,2,2,1},
                {lessThan5,19,2,2,2},
                {lessThan5,19,2,2,3},
                {lessThan5,19,2,3,1},
                {lessThan5,19,2,3,2},
                {lessThan5,19,2,3,3},

                {lessThan5,19,3,1,1},
                {lessThan5,19,3,1,2},
                {lessThan5,19,3,1,3},
                {lessThan5,19,3,2,1},
                {lessThan5,19,3,2,2},
                {lessThan5,19,3,2,3},
                {lessThan5,19,3,3,1},
                {lessThan5,19,3,3,2},
                {lessThan5,19,3,3,3},
        };
    }

/*    @Test(dataProvider="CustomerGenerator")
    public void testNewCustomer(String[] names, int age, int preferredIdentity, int preferredSweetness, int preferredAlcoholicContent) {
        Factory factory = new Factory();
        CustomerInterface customer = factory.createCustomer(names,age,preferredIdentity,preferredSweetness,preferredAlcoholicContent);
        ViewInterface view=factory.createView();
        BoozebotInterface bot = factory.createBot();
        bot.newCustomer(view, customer, true);

    }*/

    @Test
    public void testMakeBeverage() {
    }
}