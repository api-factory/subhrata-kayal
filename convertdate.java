
import java.text.SimpleDateFormat;
import java.util.*;

public class convertdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String ");
		String a=sc.nextLine();
		SimpleDateFormat sd=new SimpleDateFormat("dd-mm-yy");
		try{
			 Date dt=sd.parse(a);
			 System.out.print(dt);
			
		}catch(Exception e){
			e.printStackTrace();
			
		}
	}

}
