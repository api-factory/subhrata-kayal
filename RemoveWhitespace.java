import java.util.Scanner;

public class RemoveWhitespace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String a=sc.nextLine();
		String arr[]=a.split(" ");
		String str="";
		for(int i=0;i<arr.length;i++){
			str=str+arr[i];
		}
		System.out.println(str);
	}

}
