import java.util.Scanner;
// fill in your PatternCount() function here.
public class Test{
public static int PatternCount(String text, String pattern) {
    int i=0,j=0;
    while(i<text.length()-pattern.length())
    {
        if(text.substring(i,i+pattern.length()).equals(pattern))
           j++;
        i++;
    }
    return j;
}
public static void main(String[]args)
{
String s,p;
Scanner sc=new Scanner(System.in);
s=sc.next();
p=sc.next();
int j=PatternCount(s,p);
System.out.println(j);
}
}
