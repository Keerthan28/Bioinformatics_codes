import java.util.*;
public class ApproxDist
{
	public static int hamming(String s,String p)
	{

		int i = 0, count = 0; 
	while (i < s.length()) 
	{ 
		if (s.charAt(i) != p.charAt(i)) 
			count++; 
		i++; 
	} 
	return count; 
	}
    public static int approx(String s,String p,int d)
    {
    	String p1;
          int count=0,i;
          for(i=0;i<s.length()-p.length()+1;i++)
          {
          	p1=s.substring(i,i+p.length());
          	if(hamming(p,p1)<=d)
          		count++;
          }
          return count;
    }
    public static void main(String[]args)
     {
          String s,p;
Scanner sc=new Scanner(System.in);
s=sc.next();
p=sc.next();
int d=sc.nextInt();
int j=approx(s,p,d);
System.out.println(j);
}
}