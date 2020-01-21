package pattern1;

import java.util.Scanner;

public class patternd {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<n-2;i++)
		{
			System.out.print("*");
		}
		System.out.println();
		for(int i=2;i<n;i++)
		{
			for(int j=1;j<=n-2;j++)
			{
				if(j==1 || j==n-2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=1;i<n-2;i++)
		{
			System.out.print("*");
		}
		System.out.println();
		
		

	}

}
