
//fibonacci series

import java.util.*;
/*
public class Main   //Naive_Implementation
{
	public static void main(String[] args) {
		int t1=0,t2=1;
		int sum,sum1=0;
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		 System.out.println(t1);
		for(int i=1;i<n;i++)
		{
		   sum=t1+t2;
		   t1=t2;
		   t2=sum;
		   sum1+=t1;
		  
		}
		 System.out.print(sum1);
		
	}
}
*/
public class Main   //Recursive_implementation
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int res=fib(n);
        System.out.println(res);
    }
    
    public static int fib(int n)
    {
        if(n<=1)
            return n;
        return fib(n-1) + fib(n-2);
    }
}


