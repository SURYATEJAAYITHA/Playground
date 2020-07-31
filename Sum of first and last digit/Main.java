import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    int n;
      int a,b;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      b=n%10;
      while(n>=10){
       n/=10;
	   }
      a=n;
      System.out.print(a+b);
}
}