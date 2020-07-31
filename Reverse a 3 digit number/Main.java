import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    int n;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    for(int i=0;i<3;i++){
      System.out.print(n%10);
      n/=10;
    }//Type your code here
  }
}