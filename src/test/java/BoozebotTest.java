import Model.CustomerInterface;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BoozebotTest {

    @DataProvider(name = "customerGenerator")
    public Iterator<Object[]>customers(){
        List<Object[]>data=new ArrayList<Object[]>();
        for (int i=4;i<=5;i++){
            for (int ii=17;ii<=18;i++){
                for (int x=1; x<=3;x++){
                    for(int y=1;y<=3;y++){
                        for (int z=1;z<=3;z++){
                            data.add(new Integer[]{i,ii,x,y,z});
                        }
                    }
                }
            }
        }
        return data.iterator();
    }
   @Test(dataProvider="CustomerGenerator")
    public void testNewCustomer(int[]profile) {
        Factory factory = new Factory();
        CustomerInterface customer = factory.createCustomer();
        BoozebotInterface bot = factory.createBot();
        bot.newCustomer(customer,profile);

    }

    @Test
    public void testMakeBeverage() {
    }
}