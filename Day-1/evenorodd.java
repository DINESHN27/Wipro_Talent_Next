package dinesh;
import java.util.Scanner;

public class evenorodd {

	public static void main(String[] args) {
			Scanner newob = new Scanner(System.in);
			System.out.println("Enter the Value: ");
			int n = newob.nextInt();
			if(n%2 == 0)
			{
				System.out.println(n+" is a Even number");	
			}
			else
			{
				System.out.println(n+" is a Odd number");	
			}
			

	}

}
