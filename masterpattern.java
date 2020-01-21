package pattern1;

import java.util.Scanner;

public class masterpattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    for(int i=1;i<=n;i++)
    {
    	int val=n;
    	for(int j=1;j<=n;j++)
    	{
    		if(j==(n-i+1))
    		{
    			System.out.print("*");
    			val--;
    		}
    		else
    		{
    			System.out.print(val);
    			val--;
    		}
    			
    	}
    	System.out.println();
    }
    
	}

}
