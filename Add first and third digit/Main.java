import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		int a;
      Scanner sc=new Scanner(System.in);
      a=sc.nextInt();
      int p=a/100;
      int q=a%10;
      System.out.print(p+q);// Type your code here
	}
}