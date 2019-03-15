package Model;

public interface CustomerInterface {
    String[] getNames();

    void setNames(String[] names);

    int[] getProfile();

    void setProfile(int[]profile);
/*
    int getAge();

    void setAge(int age);

    int getPreferredIdentity();

    void setPreferredIdentity(int preferredIdentity);

    int getPreferredSweetness();

    void setPreferredSweetness(int preferredSweetness);

    int getPreferredAlcoholicContent();

    void setPreferredAlcoholicContent(int preferredAlcoholicContent);

    static int calcBeverageRecipe(int[] profile){

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
            return 7; // water
        }
    }

    int[] calcProfile();
    */
}
