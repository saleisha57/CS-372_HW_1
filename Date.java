public class Date
{
    int month, day, year;
    
    public Date(int m, int d, int y)
    {
	setMonth(m);
	setDay(d);
	setYear(y);
    }

    private void setMonth(int _m)
    {
	month = _m;
    }
    private void setDay(int _d)
    {
	day = _d;
    }
    private void setYear(int _y)
    {
	year = _y;
    }

    private int getMonth()
    {
	return month;
    }
    private int getDay()
    {
	return day;
    }
    private int getYear()
    {
	return year;
    }

    public void displayDate()
    {
	System.out.println("The date is: " + getMonth() + " / " + getDay() + " / " + getYear());
    }

    
}
