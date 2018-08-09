import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) {
		int n, fact=1;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(+fact);
	}

}
