import java.util.Vector; 
import java.util.Scanner;
class Main
{ 
    public static void printDivisors(int n) 
    { 
        Vector<Integer> v = new Vector<>(); 
        for (int i=1; i<=Math.sqrt(n); i++) 
        { 
            if (n%i==0) 
            { 
                if (n/i == i) // check if divisors are equal 
                    System.out.printf("%d ", i); 
                else
                { 
                     System.out.printf("%d ", i); 
                    v.add(n/i); 
                } 
            } 
        } 
        for (int i=v.size()-1; i>=0; i--) 
             System.out.printf("%d ", v.get(i)); 
    } 
    public static void main(String args[]) 
    { 
        Scanner in = new Scanner(System.in);
		int n = in.nextInt();		
        printDivisors(n); 
    } 
} 