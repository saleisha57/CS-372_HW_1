import java.util.Scanner;

public class odd_or_even
{
    public static void main(String[] args)
    {
	Scanner scan = new Scanner(System.in);
	int number;
	
	System.out.print("Enter an integer: ");
	number = scan.nextInt();
						
	if( number % 2 == 0 )
	    System.out.println("The number is even.");
	else
	    System.out.println("The number is odd.");

    }

}
