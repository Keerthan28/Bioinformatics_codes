import java.util.Scanner;
public class Max_Distance
{
	public static int great(int a[],int m)
	{
		int great=0;
		int flag=0;
		for(int i=0;i<m;i++)
		{
			if(a[i]>great)
			{
				great=a[i];
				flag=i;
			}
		}
		return flag;
	}
	public static int low(int a[],int m)
	{
		int great=0;
		int flag=0;
		for(int i=0;i<m;i++)
		{
			if(a[i]<great)
			{
				great=a[i];
				flag=i;
			}
		}
		return flag;
	}
	public static int max(String s)
	{
		int a[]=new int[s.length()+1];
		a[0]=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='G')
			{
				a[i+1]=a[i]+1;
			}
			else if(s.charAt(i)=='C')
			{
				a[i+1]=a[i]-1;
			}
		}
		return great(a,s.length()+1);

	}
	public static int min(String s)
	{
		int a[]=new int[s.length()+1];
		a[0]=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='G')
			{
				a[i+1]=a[i]+1;
			}
			else if(s.charAt(i)=='C')
			{
				a[i+1]=a[i]-1;
			}
		}
		return low(a,s.length()+1);

	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s;
		s=sc.next();
		System.out.println(max(s)-1);
		System.out.println(min(s)-1);
	}
}