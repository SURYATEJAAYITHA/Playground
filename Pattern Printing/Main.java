import java.util.Scanner;

class Main 
{
	public static void main (String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
        int num, star=0; 
    	int space; 
    	num = sc.nextInt();
    	int i, j, lterm, rterm; 
    	lterm = 1; 
    	rterm = num * num + 1; 
    	for (i = num; i > 0; i--) 
    	{ 
    		for (space = 1; space <= star ; space++) 
    		    System.out.print("*");
    		star +=2; 
    		for (j = 1; j <= i; j++) 
    		{ 
    			System.out.print(lterm+"0"); 
    			lterm++; 
    		} 
    		for (j = 1; j <= i; j++) 
    		{ 
    			System.out.print(rterm); 
    			if (j < i) 
    				System.out.print("0");
    			rterm++; 
    		} 
    		rterm = rterm - (i - 1) * 2 - 1; 
    		System.out.println();
    	}
	}
}