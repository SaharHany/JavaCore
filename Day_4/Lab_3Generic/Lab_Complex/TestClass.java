import java.math.BigDecimal;

public class TestClass{
	public static void main (String[]args)
	{
		Complex<BigDecimal,BigDecimal> c1 = new Complex<BigDecimal,BigDecimal>((new BigDecimal(3)),(new BigDecimal(4)));
		Complex<BigDecimal,BigDecimal> c2 = new Complex<BigDecimal,BigDecimal>((new BigDecimal(5)),(new BigDecimal(6)));
		
		//testing on Arithmatic Ops
/*		Complex<Double,Double> Addition       = ComplexOperations.add(c1,c2);
		Complex<Double,Double> Subtration     = ComplexOperations.subtract(c1,c2);
		Complex<Double,Double> Multiplication = ComplexOperations.multiply(c1,c2);
		Complex<Double,Double> Division       = ComplexOperations.divide(c1,c2);

*/

		Complex<BigDecimal,BigDecimal> Addition       = Complex.add_Co(c1,c2);
		Complex<BigDecimal,BigDecimal> Subtration     = Complex.subtract_Co(c1,c2);
		//Complex<Double,Double> Multiplication = Complex.multiply_Co(c1,c2);
		//Complex<Double,Double> Division       = Complex.divide_Co(c1,c2);


		//testing on magnitude method and toString method
		System.out.println(c1.toString()+" ...its magnitude = "+c1.magnitude());


	}

}