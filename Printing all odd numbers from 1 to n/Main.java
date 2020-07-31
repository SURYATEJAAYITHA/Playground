import java.util.Scanner;
class Main {
	public static void main (String[] args){
         // Get the value n
	     Scanner in  = new Scanner(System.in);
	     int n = in.nextInt();
         // Run for loop until it reaches the given number
	     for(int count = 1; count <= n; count = count + 1)
	     {
	         if(count % 2 == 1)
	         {
	            System.out.println(count);   
	         }
             // Increase the count by step 1
	         count = count + 1;
	     }
	}
}