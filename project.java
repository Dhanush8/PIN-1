import java.util.Scanner;

public class project {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
     while(true)
     {
          System.out.print("Enter the PIN: ");
          int pin=sc.nextInt();
          
          if(pin==1234)
          {
              System.out.println("Unlocked");
              break;
          }
          else
              
              System.out.println("Invalid Try Again");
     }
     
    }
    
}
