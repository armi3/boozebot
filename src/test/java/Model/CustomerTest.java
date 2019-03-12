package Model;
import org.testng.annotations.Test;
import org.testng.Assert;

public class CustomerTest {

    @Test
    public void testCalcBeverageRecipe() {
        //int[] profile = {};
        Assert.assertEquals(1,1);
    }

    @Test
    public void testCalcProfile() {
        String[] names = {"rei", "ayanami"};
        int[] expected = {names[0].length(), 1, 1, 1};
        Customer customer = new Customer(names, 1, 1, 1, 1);
        Assert.assertEquals(customer.calcProfile(), expected);
    }
}