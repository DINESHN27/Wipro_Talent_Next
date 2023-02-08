package dinesh;
import java.util.Scanner;

public class Greater_of_two_values{

	public static void main(String[] args) {
			Scanner newob = new Scanner(System.in);
			System.out.println("Enter the Value-1: ");
			int n1 = newob.nextInt();
			System.out.println("Enter the Value-2: ");
			int n2 = newob.nextInt();
			if(n1>n2)
			{
				System.out.println(n1+" is larger");	
			}
			else
			{
				System.out.println(n2+" is larger");	
			}
			

	}

}