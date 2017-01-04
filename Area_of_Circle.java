import java.util.Scanner;

public class Area_of_Circle
{
    public static void main(String[] args)
    {
	Scanner scan = new Scanner(System.in);
	final double pi = 3.14;
	double radius;
	double area;
	
	System.out.print("Please enter a radius for the circle: ");
	radius = scan.nextDouble();

	area = pi*(radius*radius);
	
	System.out.println("The area of the circle is: " + area);
    }

}

