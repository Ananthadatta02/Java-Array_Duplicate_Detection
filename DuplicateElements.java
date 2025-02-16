package duplicateElemtOperations;

import java.util.Scanner;

public class DuplicateElements 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Size of array");
		int size = s.nextInt();
		int [] arr = new int [size];
		System.out.println("Enter the Elements");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i] = s.nextInt();
		}
		
		for(int i=0;i<=arr.length-1;i++)
		{
			for(int j=0;j<=i-1;j++)
			{
				if(arr[j] == arr[i])
				{
					System.out.println(arr[j]);
				}
			}
		}
		
	}
}
