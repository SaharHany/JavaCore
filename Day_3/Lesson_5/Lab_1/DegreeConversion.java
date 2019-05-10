package functionInterface;
import java.util.Scanner;
import java.util.function.Function;
public class DegreeConversion
{
	public static void main (String[]args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter the degree in Celisius: ");
		double Degree_Celsius = input.nextDouble(); 

		Function<Double,Double> convert = (c)->c*1.80+32;
		double result = convert.apply(Degree_Celsius);
		System.out.println("The degree in Fahrenhait = "+result);
		
	}
}
