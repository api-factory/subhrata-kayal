import java.util.*;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int n=a;
		String s=String.valueOf(a);
		int len=s.length();
		int result=0;
		StringBuffer sb=new StringBuffer(s);
		StringBuffer str=sb.reverse();
		if(str.equals(sb))
			System.out.println("Enter the number is palindrome ");
		else
			System.out.println("Enter the number is not palindrome ");

	}

}
