package Model;

public class Customer implements CustomerInterface {
    private String[] names;
    private int age;
    private int identity;

    public Customer(){
        super();
        names=null;
        age=0;
        identity=0;
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

    public int getIdentity() {
        return identity;
    }

    public void setIdentity(int identity) {
        this.identity = identity;
    }

}
