import java.util.Scanner;

public class Highpeak
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of jobs");
		int size = sc.nextInt();
		System.out.println("Enter job start time, end time, and earnings");
		int[][] a = new int[size][3];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				a[i][j] = sc.nextInt();
			}
		}
		
		int result[] = calculate(a);
		
		for(int i: result)
		{
			System.out.println(i);
		}
	}
	
	public static int[] calculate(int[][] a)
	{
		int maximum = a[0][2];
		int sum = 0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i][2];
			if(maximum<a[i][2])
				maximum = a[i][2];
			
		}
		
		int[] result = new int[2];
		result[0] = a.length-1;
		result[1] = sum-maximum;
		
		return result;
		
	}
}