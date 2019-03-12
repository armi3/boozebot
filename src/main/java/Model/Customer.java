package Model;

public class Customer implements CustomerInterface {
    private String[] names;
    private int age;
    private int preferredIdentity;
    private int preferredSweetness;
    private int preferredAlcoholicContent;

    public Customer(){
        super();
        names = null;
        age = 0;
        preferredIdentity = 0;
        preferredSweetness = 0;
        preferredAlcoholicContent = 0;
    }

    public Customer(String[] names, int age, int preferredIdentity, int preferredSweetness, int preferredAlcoholicContent) {
        this.names = names;
        this.age = age;
        this.preferredIdentity = preferredIdentity;
        this.preferredSweetness = preferredSweetness;
        this.preferredAlcoholicContent = preferredAlcoholicContent;
    }

    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPreferredIdentity() {
        return preferredIdentity;
    }

    public void setPreferredIdentity(int preferredIdentity) {
        this.preferredIdentity = preferredIdentity;
    }

    public int getPreferredSweetness() {
        return preferredSweetness;
    }

    public void setPreferredSweetness(int preferredSweetness) {
        this.preferredSweetness = preferredSweetness;
    }

    public int getPreferredAlcoholicContent() {
        return preferredAlcoholicContent;
    }

    public void setPreferredAlcoholicContent(int preferredAlcoholicContent) {
        this.preferredAlcoholicContent = preferredAlcoholicContent;
    }

    public int calcBeverageRecipe(int[] profile){

        int firstNameLenghtCase = profile[0];
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
        else if (preferredAlcoholicContentCase==1 && preferredSweetnessCase==2){
            return 4; // absinthe
        }
        else if (preferredAlcoholicContentCase==1 && preferredSweetnessCase==3){
            return 1; // vodka martini
        }
        else if (preferredAlcoholicContentCase==1 && preferredIdentityCase==3){
            return 3; // sake
        }
        else {
            return 7;
        }

    }

    public int[] calcProfile(){
        int[] profile = new int[4];
        profile[0] = getNames()[0].length();
        profile[1] = getPreferredIdentity();
        profile[2] = getPreferredSweetness();
        profile[3] = getPreferredAlcoholicContent();

        return profile;
    }
}
