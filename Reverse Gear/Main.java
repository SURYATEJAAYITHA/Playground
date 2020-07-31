import java.util.*;

class Main{

public static void main(String []args)
{
    Scanner sc=new Scanner(System.in);
    
    String nn=sc.nextLine();

    try{
      int n=Integer.parseInt(nn);
    
    if(n>0)
    {
    while(n--!=0)
    {
    int f=sc.nextInt();
    int b=sc.nextInt();
    int t=sc.nextInt();
    int d=sc.nextInt();
    int count=0;
    int dist=0;
    int ans=0;
    if(f>=b || d == 0 || t == 0)
        System.out.println("Cannot park");
    else
    {
        while(true)
        {
            if(dist+b<d)
      			dist+=b;
      		else   
      		{   
          ans=(d-dist)*t;
          break;  
      }
      dist-=f;
      count++;
     }
     ans+=(count*t)*(f+b); 
     System.out.println(ans);
    }
    }
    }
    else
    {
        System.out.println("Invalid test case");
    }
}catch(Exception e){
  System.out.println("Invalid test case");
  }
}
}
