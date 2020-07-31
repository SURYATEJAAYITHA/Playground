import java.util.Scanner;
class Main{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int test_case = in.nextInt();
		for(int i = 0; i < test_case; i++)
		{
			int total = in.nextInt();
			int count = 0;
			while(total != 0)
			{
				count++;
				total = total >> 1;
			}
			System.out.println(count);
		}
	}
}