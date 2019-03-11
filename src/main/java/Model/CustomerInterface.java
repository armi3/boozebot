package Model;

public interface CustomerInterface {
    String[] getNames();

    void setNames(String[] names);

    int getAge();

    void setAge(int age);

    int getPreferredIdentity();

    void setPreferredIdentity(int preferredIdentity);

    int getPreferredSweetness();

    void setPreferredSweetness(int preferredSweetness);

    int getPreferredAlcoholicContent();

    void setPreferredAlcoholicContent(int preferredAlcoholicContent);

    int calcBeverageRecipe(int[] profile);

    int[] calcProfile();
}
