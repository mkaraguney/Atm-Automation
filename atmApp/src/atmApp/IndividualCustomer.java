package atmApp;

public class IndividualCustomer  extends  Customer{

   private String firstName;
   private String lastName;
   private String homeAddress;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public IndividualCustomer(){

    }
    public  void IndividualCustomer(String firstName, String lastName,String homeAddress){
        System.out.println(this.firstName=firstName);
        System.out.println(this.lastName=lastName);
        System.out.println(this.homeAddress=homeAddress);

    }



}
