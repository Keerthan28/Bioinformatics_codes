import java.util.Scanner;
public class Motif_Det
{
	public static int hamming(String s1,String s2)
	{
		int k=0,i=0;
		while(i<s1.length())
		{
			if(s1.charAt(i)!=s2.charAt(i))
			{
				k++;
			}
			i++;
		}
		return k;
	}
	public static String motif(String s,int k,int d)
	{
		String pattern[]=new String[100];
		int count[]=new int [100];
		int i;
		for(i=0;i<s.length()-k;i++)
		{
			for(int j=0;j<pattern.length;j++)
			{
				if(hamming(pattern[j],s.substring(i,i+k))<=d)
					count[j]++;
				else
				{
					String pattern[]=new String[pattern.length+1];
					pattern[pattern.length]=s.substring(i,i+k);
				}
			}
		}
		int h=0;
		int pos=0;
		for(i=0;i<count.length;i++)
		{
			if(count[i]>h){
				h=count[i];
				pos=i;
			}
		}
			return pattern[pos];
	}
		public static void main(String []args)
		{
			Scanner sc =new Scanner(System.in);
			String s=sc.next();
			int k,d;
			k=sc.nextInt();
			d=sc.nextInt();
			System.out.println(motif(s,k,d));
		}
}
