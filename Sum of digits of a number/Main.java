import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    int n,m,sum=0;
     
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
     
      while(n>0){
       m=n%10;
        sum+=m;
        n/=10;
	   }
    
      System.out.print(sum);
}
}