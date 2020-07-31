import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    int n,a;
     
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
     
      while(n>=100){
       n/=10;
	   }
      a=n%10;
      
      System.out.print(a);
}
}