import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int n=a;
		String s=String.valueOf(a);
		int len=s.length();
		int result=0;
		int res=1;
		while(a!=0){
			int ss=a%10;
			for(int i=1;i<=len;i++){
				res=res*ss;
			}
			result=result+res;
			res=1;
			a=a/10;
		}
		if(result==n)
			System.out.println("Enter the number is Armstrong ");
		else
			System.out.println("Enter the number is not Armstrong ");

	}

}
