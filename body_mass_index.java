import java.util.Scanner;

public class body_mass_index
{
    public static void main(String[] args)
    {
	Scanner scan = new Scanner(System.in);
	double height, weight, bmi;
	System.out.print("Enter your weight in pounds: ");
	weight = scan.nextDouble();
	System.out.print("Enter your height in inches: ");
	height = scan.nextDouble();

	bmi = (weight*703)/(height*height);
	
	if(bmi < 18.5)
	    System.out.println("You are categorized as underweight with a bmi of " + bmi + ".");
	else if(bmi >= 18.5 && bmi < 24.9)
	    System.out.println("You are categorized with a normal weight with a bmi of " + bmi + ".");
	else if(bmi >= 25 && bmi < 29.9)
	    System.out.println("You are categorized as overweight with a bmi of " + bmi + ".");
	else if(bmi > 30)
	    System.out.println("You are categorized as obese with a bmi of " + bmi + ".");

    }
    
}
