package atmApp;

public class Customer {

     private  int id;
     private  String nationalIdentity;
     private  double acountBalance;

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getNationalIdentity() {
                return nationalIdentity;
        }

        public void setNationalIdentity(String nationalIdentity) {
                this.nationalIdentity = nationalIdentity;
        }

        public double getAcountBalance() {
                return acountBalance;
        }

        public void setAcountBalance(double acountBalance) {
                this.acountBalance = acountBalance;
        }


    public double getUnitPriceAfterDiscount() {

            System.out.println("Para çıkartma işlemi gerçekleşmiştir");
            return this.acountBalance- 10;
    }
    public double addMoney() {
              System.out.println("Para ekleme işlemi gerçekleşmiştir");
              return this.acountBalance + 10;

    }
    public  void Customer(Integer id, String nationalIdentity,double acountBalance){
        System.out.println(this.id=id);
        System.out.println(this.nationalIdentity=nationalIdentity);
        System.out.println(this.acountBalance=acountBalance);

    }





    }





