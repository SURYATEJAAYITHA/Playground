import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		int num1,num2,num3;
      Scanner sc=new Scanner(System.in);
      num1=sc.nextInt();
      num2=sc.nextInt();
      num3=sc.nextInt();
      if(num1>num2)
      {
        if(num1>num3)
        {
          System.out.print(num1);
        }
        
      }
      else if(num2>num3)
      {
        System.out.print(num2);
      }
      else 
        System.out.print(num3);// Type your code here
    }
}