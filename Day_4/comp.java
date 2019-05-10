import java.math.BigDecimal;
public class Complex<R extends BigDecimal,I extends BigDecimal>
{
	private R real ;
	private I img  ;
	public Complex()
	{
		real = 0; 
		img  = 0;		
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

	public R magnitude()
	{
		R real_sq =  Math.pow(real,2);
		I img_sq  =  Math.pow(img,2) ;
		R result  =  Math.sqrt(real_sq+img_sq); 
		return result;
	}

	@override
	public String toString()
	{
		String real_str = real.toString();
		String img_str = img.toString();
		String res = "a + b i = "+real_str+" + "+img_str+" i";
		return res;
	}



/*	//operations

	public static Complex<R,I> add (Complex<R,I> c1 ,Complex<R,I> c2)
	{
		return new Complex((c1.getReal()+c2.getReal()),(c1.getImg()+c2.getImg()));
	}

	public static Complex<R,I> subtract (Complex<R,I> c1 ,Complex<R,I> c2)
	{
		return new Complex((c1.getReal()-c2.getReal()),(c1.getImg()-c2.getImg()));
	}

	public static Complex<R,I> multiply (Complex<R,I> c1 ,Complex<R,I> c2)
	{
		Complex result = new Complex ();
		result.setReal((c1.getReal()*c2.getReal())-(c1.getImg()*c2.getImg()));
		result.setImg((c1.getReal()*c2.getImg())+(c1.getImg()*c2.getReal())); 
		return result;
	}


	public static Complex<R,I> division (Complex<R,I> c1 ,Complex<R,I> c2)
	{
		Complex result = new Complex();
		R real_sq = Math.pow(c2.getReal(),2);
		I img_sq  = Math.pow(c2.getImg(),2) ;
		R conj    = real_sq + img_sq ;
		
		Complex  new_c1 = new Complex (c1.getReal()/conj,c1.getImg()/conj);
		Complex  new_c2 = new Complex (c2.getReal()/conj,c2.getImg()/conj);
		result = multiply(new_c1,new_c2);
		return result;
	}

*/
 	
}