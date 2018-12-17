import java.util.Arrays;
import java.util.Scanner;

public class largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array range");
		int a=sc.nextInt();
		int ar[]=new int[a];
		for(int i=0;i<a;i++){
			ar[i]=sc.nextInt();
		}
		Arrays.sort(ar);
		System.out.println("The Largest Value "+ar[a-1]);

	}

}
