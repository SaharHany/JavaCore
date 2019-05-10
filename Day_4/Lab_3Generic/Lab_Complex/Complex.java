import java.math.BigDecimal;
import java.math.MathContext;
public class Complex<R extends BigDecimal,I extends BigDecimal>{
	private R real ;
	private I img  ;
	public Complex()
	{
		real = null; 
		img  = null;		
	}
	
	public Complex(R given_real,I given_img)
	{
		real = given_real;
		img  = given_img ;		
	}

	//setters for real , img 
	public void setReal(R real)
	{
		this.real = real;
	}
	
	public void setImg(I img)
	{
		this.img = img;
	}

	//getters for real , img 
	public R getReal()
	{
		return real;
	}
	
	public I getImg()
	{
		return img;
	}

	public BigDecimal magnitude()
	{
		BigDecimal real_sq = (BigDecimal)  real.multiply(real);
		BigDecimal img_sq  = (BigDecimal)  img.multiply(img) ;
		BigDecimal sq      = (BigDecimal)  real_sq.add(img_sq);
		BigDecimal result  = (BigDecimal) sq.sqrt(MathContext.DECIMAL64); 
		return result;
	}

	
	public String toString()
	{
		String real_str = real.toString();
		String img_str = img.toString();
		String res = "a + b i = "+real_str+" + "+img_str+" i";
		return res;
	}



	//operations

	public static Complex<BigDecimal,BigDecimal> add_Co (Complex<BigDecimal,BigDecimal> c1 ,Complex<BigDecimal,BigDecimal> c2)
	{
		return new Complex((c1.getReal().add(c2.getReal())),(c1.getImg().add(c2.getImg())));
	}

	public static Complex<BigDecimal,BigDecimal> subtract_Co (Complex<BigDecimal,BigDecimal> c1 ,Complex<BigDecimal,BigDecimal> c2)
	{
		return new Complex((c1.getReal().subtract(c2.getReal())),(c1.getImg().subtract(c2.getImg())));
	}

/*
	public static Complex<BigDecimal,BigDecimal> multiply_Co (Complex<BigDecimal,BigDecimal> c1 ,Complex<BigDecimal,BigDecimal> c2)
	{
		Complex result = new Complex ();
		result.setReal((c1.getReal().multiply(c2.getReal())).subtract((c1.getImg().multiply(c2.getImg()))));
		result.setImg((c1.getReal().multiply(c2.getImg())).add(c1.getImg().multiply(c2.getReal())))); 
		return result;
	}


	public static Complex<BigDecimal,BigDecimal> division_Co (Complex<BigDecimal,BigDecimal> c1 ,Complex<BigDecimal,BigDecimal> c2)
	{
		Complex result = new Complex();
		BigDecimal real_sq = BigDecimal.pow(c2.getReal(),2);
		BigDecimal img_sq  = BigDecimal.pow(c2.getImg(),2) ;
		BigDecimal conj    = real_sq.add(img_sq) ;
		
		Complex  new_c1 = new Complex (c1.getReal().divide(conj),c1.getImg().divide(conj));
		Complex  new_c2 = new Complex (c2.getReal().divide(conj),c2.getImg().divide(conj));
		result = multiply_Co(new_c1,new_c2);
		return result;
	}
*/

 	
}