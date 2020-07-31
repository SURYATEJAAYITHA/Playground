import java.util.Scanner;
class Main{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int five,two,one;
		int n = in.nextInt();
		five=(n-4)/5;
		n=n-(five*5);
		if(n%2==0)
			one=2;
		else
			one=1;
		two= (n-one)/2;
		System.out.print(five+two+one + " "+five+" "+two+" "+one);
	}
}