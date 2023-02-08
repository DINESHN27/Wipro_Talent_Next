package dinesh;
import java.util.Scanner;

public class positive_or_negative{

	public static void main(String[] args) {
			Scanner newob = new Scanner(System.in);
			System.out.println("Enter the Value: ");
			int n = newob.nextInt();
			if(n>0)
			{
				System.out.println("Positive number");	
			}
			else if(n<0)
			{
				System.out.println("Negative number");	
			}
			else
			{
				System.out.println("Zero");
			}
				
			

	}

}