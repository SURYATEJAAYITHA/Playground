import java.util.Scanner;
public class Main{

    static int MAX_LEN  = 1000;
    static int is_even_col1(boolean is_even_col, int row){
        if(is_even_col){
            row++;
            return row;
        }
        return (row-1);
    }

    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
	    String crypted_str;
	    
	    int str_len, depth, decrypted_index = 0;
	    depth = in.nextInt();
	    crypted_str = in.next();
	   StringBuilder  decrypted_str = new StringBuilder("");
	    if(depth == 1)
	    {
	        System.out.print(crypted_str);
	    }
	    else{
	        str_len = crypted_str.length();
	        int n = (str_len - 1)/(depth + (depth - 2));
	
	        int col, row;
	        for(col = 0; col < 2*n; col++)
	        {
	            boolean is_even_col = false;
	            if((col % 2) == 0)
		            is_even_col = true;
		        else
		            is_even_col = false;
		        for(row = (is_even_col)? 0 : (depth - 1); (is_even_col) ? (row < depth) : (row >= 0); row = is_even_col1(is_even_col, row))
		        {
			        boolean is_first_row = (row == 0) ;
			        boolean is_last_row  = (row == (depth - 1));
			
			        if(is_first_row && is_even_col && col != 0)
			        {
                        continue;
			        }
			
			        if(is_last_row && !is_even_col)
			        {
        				continue;
        			}
        			
			        int elem_to_skip = is_first_row ? (col / 2) : (n - 1);
			        elem_to_skip += is_last_row ? ((col + 1) / 2): 0;
			
			        decrypted_str.append(crypted_str.charAt(row * 2 * n + col - elem_to_skip));
		        }
	        }

	        // Remove the padded X
	        int i;
	        for(i = decrypted_str.length() - 1; i >= 0; i--)
	        {
	            if(decrypted_str.charAt(i) != 'X')
	            {
	                decrypted_str.setLength(i+1);
	                break;
	            }
	        }
	        System.out.print(decrypted_str);
	    }
	
    }
}