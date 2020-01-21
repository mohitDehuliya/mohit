package pattern1;

import java.util.Scanner;

public class masterpattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int line=(2*n)+1;
    for(int i=1;i<=n;i++)
    {
    	for(int j=1;j<=line;j++)
    	{
    		if(j==i || j==(n+1) || j==(line-i+1))
    		{
    			System.out.print("*");
    		}
    		else
    		{
    			System.out.print("0");
    		}
    	}
    	System.out.println();
    }
	}

}
