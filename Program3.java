import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		String str,rev="";
		Scanner c=new Scanner(System.in);
		 str=c.nextLine();
		int n=str.length();
		for(int i=n-1;i>=0;i--) {
		rev=rev+str.charAt(i);
		}
		System.out.println(""+rev);
	}

}
