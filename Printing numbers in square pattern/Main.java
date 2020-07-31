import java.util.Scanner; 
class Main{ 
  public static void main (String[] args){ 
    Scanner in = new Scanner(System.in); 
    int n = in.nextInt(); 
    for(int curr_row = 1; curr_row <= n; curr_row++) { 
      // Handle numbers for each row 
      for(int curr_col = 1; curr_col <= n; curr_col++) {
         System.out.print(curr_row); 
      } 
      System.out.println();
    } 
  }
}