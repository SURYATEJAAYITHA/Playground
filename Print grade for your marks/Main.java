import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		int n;
      Scanner sc=new Scanner(System.in);
      n=sc.nextInt();
      if(n>=85)
        System.out.println("A");
      else if(n<85&&n>=75)
         System.out.println("B");
      else if(n<75&&n>=65)
       System.out.println("A");
      else if(n<65&&n>=55)
      System.out.println("A");
      else if(n<55&&n>=45)
       System.out.println("E");
      else
       System.out.println("Fail");// Type your code here
    }
}