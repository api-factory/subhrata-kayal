import java.util.Scanner;

public class PrintArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array range");
		int a=sc.nextInt();
		int ar[]=new int[a];
		for(int i=0;i<a;i++){
			ar[i]=sc.nextInt();
		}
		for(int i=0;i<a;i++){
			System.out.print(ar[i]+" ");
		}
		
	}

}
