import java.util.Scanner;
class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
System.out.print(i);
  if(i%3==0)
    System.out.print(",");//Try out your code here
}
}
}
