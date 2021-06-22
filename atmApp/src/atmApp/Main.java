package atmApp;
import java.util.*;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in); //Kullanıcıdan int değer alabilmek için Scanner sınıfını kullandık
        System.out.print("Müşteri no giriniz: ");
        int sayi = input.nextInt(); //int değer alıyoruz

        IndividualCustomer customer1=new IndividualCustomer();
        CorporateCustomer  customer2=new CorporateCustomer();
        IndividualCustomer customer3=new IndividualCustomer();
        IndividualCustomer customer4=new IndividualCustomer();
        CorporateCustomer  customer5=new CorporateCustomer();


        Map<Integer, Customer> costumer = new HashMap<>();

        // Add keys and values
        costumer.put(1, customer1);
        costumer.put(2, customer2);
        costumer.put(3, customer3);
        costumer.put(4, customer4);
        costumer.put(5, customer5);


        try{
            switch(sayi){
                case 1:
                    customer1.IndividualCustomer("Enes","Karagüney","Sivas");
                    customer1.Customer(1,"32131313",1000);

                    Scanner value = new Scanner(System.in);
                    System.out.print("1 veya 2 giriniz: ");
                    int value1 = input.nextInt();

                    if (value1==1){

                        System.out.println(customer1.addMoney());

                    }
                    else{

                        System.out.println(customer1.getUnitPriceAfterDiscount());
                    }
                    break;
                case 2:

                    customer2.CorporateCustomer("Halkbank","Adıyaman");
                    customer2.Customer(2,"324545",2000);

                    Scanner value2 = new Scanner(System.in);
                    System.out.print("1 veya 2 giriniz: ");
                    int value3 = input.nextInt();

                    if (value3==1){
                        System.out.println(customer2.addMoney());

                    }
                    else{
                        System.out.println(customer2.getUnitPriceAfterDiscount());

                    }
                    break;
                case 3:
                    customer3.IndividualCustomer("Mehmet","Yılmaz","Ankara");
                    customer3.Customer(3,"12312312",3000);

                    Scanner value4 = new Scanner(System.in);
                    System.out.print("1 veya 2 giriniz: ");
                    int value5 = input.nextInt();

                    if (value5==1){

                        System.out.println(customer3.addMoney());

                    }
                    else{

                        System.out.println(customer3.getUnitPriceAfterDiscount());
                    }
                    break;
                case 4:

                    customer4.IndividualCustomer("Hasan","Özkan","Malatya");
                    customer4.Customer(4,"67456",4000);

                    Scanner value6 = new Scanner(System.in);
                    System.out.print("1 veya 2 giriniz: ");
                    int value7 = input.nextInt();

                    if (value7==1){

                        System.out.println(customer4.addMoney());

                    }
                    else{

                        System.out.println(customer4.getUnitPriceAfterDiscount());
                    }
                    break;

                case 5:

                    customer5.CorporateCustomer("ING BANK","Muş");
                    customer5.Customer(5,"89972",5000);

                    Scanner value8= new Scanner(System.in);
                    System.out.print("1 veya 2 giriniz: ");
                    int value9 = input.nextInt();

                    if (value9==1){

                        System.out.println(customer5.addMoney());

                    }
                    else{

                        System.out.println(customer5.getUnitPriceAfterDiscount());
                    }
                    break;
                default :
                    System.out.println("Hatalı değer girdiniz" );
                    
            }
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
