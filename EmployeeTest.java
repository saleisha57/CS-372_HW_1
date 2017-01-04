public class EmployeeTest
{
    public static void main(String[] args)
    {
	Employee e_1 = new Employee("Heather", "Mason", 150.5);
	Employee e_2 = new Employee("Jack", "Jackson", 125.15);
	
	System.out.println(e_1.get_f_name() + " " + e_1.get_l_name() + " makes $" + e_1.get_salary());
	System.out.println(e_2.get_f_name() + " " + e_2.get_l_name() + " makes $" + e_2.get_salary());
	
	System.out.println("After a raise");

	System.out.println(e_1.get_f_name() + " " + e_1.get_l_name() + " makes $" + (e_1.get_salary() + (e_1.get_salary()*0.10)));
	System.out.println(e_2.get_f_name() + " " + e_2.get_l_name() + " makes $" + (e_2.get_salary() + (e_2.get_salary()*0.10)));
	
    }
    
}
