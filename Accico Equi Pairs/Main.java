import java.util.Scanner;
class Main{
    public static int sum_num(int a, int b, int arr[], int N){
	    int sum = 0;
	    for(int i = a; i <= b; i++)
		    sum = sum + arr[i];
	    return sum;
    }
    public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		boolean flag = false;
		int arr[] = new int[N];
		for(int i = 0; i < N; i++)
			arr[i] = in.nextInt();
		int a, b, sum1 = 0, sum2 = 0, sum3 = 0;
		for(int i = 0; i < N-2; i++){
			a = i; 
			for(int j = i + 2; j < N; j++){
				b = j;
				sum1 = sum_num(0, a-1, arr, N);
				sum2 = sum_num(a+1, b-1, arr, N);
				sum3 = sum_num(b+1, N-1, arr, N);
				if(sum1 == sum2 && sum1 == sum3 && sum2 == sum3){
					System.out.println("Indices which form equi pair {"+a+","+b+"}");
					System.out.print("Slices are {0,"+ (a-1) +"},"+"{"+ (a+1) +","+ (b-1) +"},"+"{"+ (b+1) +","+ (N-1) + "}");
					flag = true;
					break;
				}
			}
			if(flag == true)
				break;
		}
		if(flag == false){
			System.out.print("Array does not contain any equi pair");
		}
	}
}