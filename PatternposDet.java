import java.util.Scanner;
// fill in your PatternCount() function here.
public class PatternposDet{
public static void PatternCount(String text, String pattern) {
    int i=0;
    while(i<text.length()-pattern.length()+1)
    {
        if(text.substring(i,i+pattern.length()).equals(pattern))
           System.out.println(i);
        i++;
    }
}
public static void main(String[]args)
{
String s,p;
Scanner sc=new Scanner(System.in);
s=sc.next();
p=sc.next();
PatternCount(s,p);
}
}