import java.util.Scanner;


public class Recursion {

	public static String str="";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		sc.close();
		String ptr=recur(s);
		System.out.println(ptr);
	}
	public static String recur(String string){
		try{
		if(string.isEmpty()){
			 return str;
			 }
		else{
			String arr[]=string.split(" ");
			/*for(int i=0;i<arr.length;i++){
				System.out.print(arr[i]+" ");
			}*/
		
			StringBuffer sb=new StringBuffer(arr[arr.length-1]);
			sb.reverse();
			str=str+sb+" ";
			//System.out.println(string.substring(0,string.length()-arr[arr.length-1].length()));
			//System.out.println(string.substring(0,string.length()-1));
			//System.out.println(string.substring(string.length()-arr[arr.length-1].length()));
			recur(string.substring(0,(string.length()-1) - arr[arr.length-1].length()));
		
			return str;
		}
		}catch(Exception e){
			return "e.printStackTrace()";
		}
	}

}
