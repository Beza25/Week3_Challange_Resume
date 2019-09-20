package Week3_Challange;

public class Person {
    private String name;
    private String emailAddress;
   //----------------------Constructors-----------------------------------
    public Person(){
        this.name ="";
        this.emailAddress="";
    }
    public Person(String name , String emailAddress){
        this.name = name;
        this.emailAddress = emailAddress;
    }
    //-----------------------Methods-----------------------------------------

    public String toString(){
        return getName() + "\n" +
                getEmailAddress() + "\n";
    }
    //------------------------Getters and Setters ----------------------------

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }
}


