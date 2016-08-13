import java.util.*;
import java.lang.*;
public class reverse
{
public static void main(String[] args)
  {
  	Scanner s=new Scanner(System.in);
	String s1=s.next();
	System.out.println(s1);
	StringBuffer str=new StringBuffer(s1);
	str=str.reverse();
	System.out.println(str.toString());
	String s=str.toString();
	StringBuffer str2=new StringBuffer(s);
	for(int i=0;i<str2.length();i++)
	{
		if(str2.charAt(i)=='a'||str2.charAt(i)=='e'||str2.charAt(i)=='i'||str2.charAt(i)=='o'||str2.charAt(i)=='u')
		{
			str2.deleteCharAt(i);
		}
	}
System.out.println(str2.toString());
  }
}
