package dinesh;
import java.util.Scanner;

public class sumisevenorodd{

	public static void main(String[] args) {
			Scanner newob = new Scanner(System.in);
			System.out.println("Enter the Value-1: ");
			int n1 = newob.nextInt();
			System.out.println("Enter the Value-2: ");
			int n2 = newob.nextInt();
			int s=n1+n2;
			if(s%2 == 0)
			{
				System.out.println(s+" is a Even number");	
			}
			else
			{
				System.out.println(s+" is a Odd number");	
			}
			

	}

}
