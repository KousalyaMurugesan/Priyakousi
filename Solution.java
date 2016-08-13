import java.io.*;
import java.util.*;

public class Solution {
public static void main(String s[])
{
	Scanner s=new Scanner(System.in);
	String s1=s.next();
	String s2=s.next();
System.out.println(islsomorphic(s1,s2));
}

public static boolean islsomorphic(String s, String t)
 {boolean sd=true;
  if(s.length()==t.length())
  {
StringBuffer sb = new StringBuffer();
  for(int i=0;i<s.length();i++)
	{
    char a = s.charAt(i);
     char b = t.charAt(i);
    String g = s.replaceAll(String.valueOf(a),String.valueOf(b)); 
    s = g;
    }
if(s.equalsIgnoreCase(t))
  sd = true;
else
   sd = false;
}
return sd;
}
}
