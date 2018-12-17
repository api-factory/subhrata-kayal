import java.util.Scanner;

public class primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		int count=1;
		int n=a;
		if(a==0 || a==1){
			System.out.println("Enter number is not prime");
			}
		else if(a==2){
			System.out.println("Enter number is prime");
			}
		else{
			for(int i=1;i<a;i++){
				if(n%i == 0 ){
					count++;
					}
			}
			if(count>1)
				System.out.println("Enter number is  not prime");
			else
				System.out.println("Enter number is prime");
				
		}

	}

}
