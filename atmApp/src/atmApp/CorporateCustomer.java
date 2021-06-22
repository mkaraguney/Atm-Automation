package atmApp;

public class CorporateCustomer extends  Customer {

   private String companyName;
   private String companyAddress;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
    }

    public  void CorporateCustomer(String companyName, String companyAddress){
        System.out.println(this.companyName=companyName);
        System.out.println(this.companyAddress=companyAddress);


    }



}
