public class char_int_value
{
    public static void main(String[] args)
    {
	char[] c = {'A', 'B', 'C', 'a', 'b', 'c', '0', '1', '2', '$', '*', '+', '/', ' '};
	
	for(int i = 0; i < 14; i++)
	    System.out.printf("The integer value of %c is: %d.\n", c[i], ((int)c[i])); 
	
    }
    
}
