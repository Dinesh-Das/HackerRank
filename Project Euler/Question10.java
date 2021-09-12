import java.util.Scanner;
public class Question10
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[2000001];
		long[] sum=new long[2000001];
		sum[0]=0;
		sum[1]=0;
		sum[2]=2;
		for(int i=3;i<2000001;i=i+2)
		{
			if(arr[i]==0)
			{
				sum[i]=sum[i-1]+i;
				for(int j=3*i;j<2000001;j+=2*i)
				{
					arr[j]=1;
				}
			}
			else
			{
				sum[i]=sum[i-1];
			}
			sum[i+1]=sum[i];
		}
		int t=sc.nextInt();
		for(int k=0;k<t;k++)
		{
			int n=sc.nextInt();
			System.out.println(sum[n]);
		}
	}
}