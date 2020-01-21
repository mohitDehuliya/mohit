package pattern1;

import java.util.Scanner;

public class patternz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.print("*");
		}
		System.out.println();
		for(int i=2;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(j==n-i)
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
		for(int i=1;i<=n;i++)
		{
			System.out.print("*");
		}
		
		}
		

	}

