import Model.Customer;
import Model.CustomerInterface;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BoozebotTest {

    @DataProvider(name = "CustomerGenerator")
    public Iterator<Object[]>customers(){
        List<Object[]>data=new ArrayList<Object[]>();
        for (int i=4;i<=5;i++){
            for (int j=1;j<=3;j++){
                for (int x=1; x<=3;x++){
                    for(int y=1;y<=3;y++){
                            data.add(new Integer[]{i,j,x,y});
                    }
                }
            }
        }
        return data.iterator();
    }
   @Test(dataProvider="CustomerGenerator")
    public void testNewCustomer(int[]profile) {
        Customer customer=new Customer();
        Boozebot bot=new Boozebot();
        int []expected={0,0,0,0};
        Assert.assertEquals(customer.calcProfile(),expected);
        bot.newCustomer(customer,profile);
        int []actual=customer.calcProfile();
        expected=profile;
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testMakeBeverage() {
    }
}