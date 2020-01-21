package pattern1;

import java.util.Scanner;

public class patterng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int count=0;
		for(int i=1;i<=n-2;i++)
		{
		if(i>1 && i<n-2)
		{
			System.out.print("*");
			count++;
		}
		else
		{
			System.out.print(" ");
		}}
		System.out.println();
		
		for(int i=2;i<=n-2;i++)
		{
			for(int j=1;j<=n-2;j++)
			{
			if((j==1) || (j>=n-2 && i==5) || (j==n-2 && i>=count))
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
		for(int i=1;i<=n-2;i++)
		{
		if(i>1 && i<n-2)
		{
			System.out.print("*");
			count++;
		}
		else
		{
			System.out.print(" ");
		}}
		System.out.println();
		

	}

}
