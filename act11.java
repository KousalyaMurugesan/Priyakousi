import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class act11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number");
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		int value=0;
		
		Set<Integer> unique=new HashSet<Integer>();
		
		while(unique.add(number))
		{
			value=0;
			for(char c:String.valueOf(number).toCharArray())
				value+=Math.pow(Integer.parseInt(String.valueOf(c)),2);
				number=value;
		}
		System.out.println(number==1?"Happy":"Not Happy");

	}

}
