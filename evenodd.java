import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        // int a=4;
       
        Scanner sc = new Scanner(System.in);
         int a = sc.nextInt();
         int oddsum=0;
         int evensum=0;

         for(int i=1;i<=a;i++){
            if (i % 2 == 0){
                evensum=evensum+i;


            } else{
                oddsum=oddsum+i;

            }
        
        
        
                    
           

           
         }

         System.out.println("Sum of even integers: " + evensum);
         System.out.println("Sum of even integers: " + oddsum);
         
        

      
       
       

       
    }
}
