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

    public int[] calcProfile(){
        int[] profile = new int[4];
        profile[0] = getNames()[0].length();
        profile[1] = getPreferredIdentity();
        profile[2] = getPreferredSweetness();
        profile[3] = getPreferredAlcoholicContent();

        return profile;
    }
}
