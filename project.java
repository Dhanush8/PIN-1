import java.util.Scanner;

public class project {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
     while(true)
     {
          System.out.print("Enter the pin: ");
          int r=sc.nextInt();
          
          if(r==1234)
          {
              System.out.println("Unlocked");
              break;
          }
          else
              
              System.out.println("Invlid Try Again");
     }
     
    }
    
}
