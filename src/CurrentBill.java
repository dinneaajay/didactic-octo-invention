
package current.bill;
import java.util.Scanner;

public class CurrentBill {

   String connection_number;
   double present_reading;
   double previous_reading;
   double bill_amount;
   double bill_units;
   
   double bill_units(){
       
       bill_units=present_reading-previous_reading;
       return bill_units;
   }
   double bill_amount(){
       bill_amount=bill_units*5;
       return bill_amount;
   }
           
           
   
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        CurrentBill a=new CurrentBill();
        System.out.println("enter the connection number");
        a.connection_number=in.nextLine();
        System.out.println("enter the previous reading");
        a.previous_reading=in.nextDouble();
        System.out.println("enter the present reading");
        a.previous_reading=in.nextDouble();
        double bill_units=a.bill_units();
        double bill_amount=a.bill_amount();
        System.out.println("therefore the bill amount is :"+bill_amount);
        
        
       
    }
    
}
