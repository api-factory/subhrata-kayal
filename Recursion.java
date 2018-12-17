import java.util.Scanner;
import java.lang.*;

public class Recursion {

	public static String str="";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String a=sc.nextLine();
		String s=recur(a);
		System.out.print(s);
		/*while (len!=0){
	    	StringBuffer sb=new StringBuffer(string[len-1]);
	    	StringBuffer s= sb.reverse();
	    	str+=s+" ";
	    	len--;
	    	}
		System.out.print(str);
		
		}*/

	}

	private static String recur(String arr) {
		// TODO Auto-generated method stu
		String string[]=arr.split(" ");
		int len=string.length;
		String ptr="";
		while (len!=0){
	    	StringBuffer sb=new StringBuffer(string[len-1]);
	    	StringBuffer s= sb.reverse();
	    	int l=s.length();
	    	str+=s+" ";
	    	recur(arr.substring(0,arr.length()-l));
	        }
		return str;
		
	}

}
