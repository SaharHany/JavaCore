import java.math.BigDecimal;
public class ComplexOperations{
	public static Complex<BigDecimal,BigDecimal> add (Complex<BigDecimal,BigDecimal> c1 ,Complex<BigDecimal,BigDecimal> c2)
	{
		return new Complex((c1.getReal()+c2.getReal()),(c1.getImg()+c2.getImg()));
	}

	public static Complex<BigDecimal,BigDecimal> subtract (Complex<BigDecimal,BigDecimal> c1 ,Complex<BigDecimal,BigDecimal> c2)
	{
		return new Complex((c1.getReal()-c2.getReal()),(c1.getImg()-c2.getImg()));
	}

	public static Complex<BigDecimal,BigDecimal> multiply (Complex<BigDecimal,BigDecimal> c1 ,Complex<BigDecimal,BigDecimal> c2)
	{
		Complex<BigDecimal,BigDecimal> result = new Complex ();
		result.setReal((c1.getReal()*c2.getReal())-(c1.getImg()*c2.getImg()));
		result.setImg((c1.getReal()*c2.getImg())+(c1.getImg()*c2.getReal())); 
		return result;
	}


	public static Complex<BigDecimal,BigDecimal> division (Complex<BigDecimal,BigDecimal> c1 ,Complex<BigDecimal,BigDecimal> c2)
	{
		Complex result = new Complex();
		BigDecimal real_sq = Math.pow(c2.getReal(),2);
		BigDecimal img_sq  = Math.pow(c2.getImg(),2) ;
		BigDecimal conj    = real_sq + img_sq ;
		
		Complex  new_c1 = new Complex (c1.getReal()/conj,c1.getImg()/conj);
		Complex  new_c2 = new Complex (c2.getReal()/conj,c2.getImg()/conj);
		result = multiply(new_c1,new_c2);
		return result;
	}

}