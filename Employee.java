public class Employee
{
    String f_name, l_name;
    double salary;
    
    public Employee(String f, String l, double s)
    {
	set_f_name(f);
	set_l_name(l);
	set_salary(s);
    }
    
    public void set_f_name(String _f)
    {
	f_name = _f;
    }
  public void set_l_name(String _l)
    {
	l_name = _l;
    }
  public void set_salary(double _s)
    {
	salary = _s;
    }
    

   public String get_f_name()
    {
	return f_name;
    }
  public String get_l_name()
    {
	return l_name;
    }
  public double get_salary()
    {
	return salary;
    }

}
