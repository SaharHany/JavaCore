import java.util.function.BiFunction;
public class StringUtils{
	public static void main(String[]args)
	{
		String str_1  = "Hello";
		String str_2  = "World!";
		String longer = StringUtils.betterString(str_1,str_2,(s1,s2)->s1.length()>s2.length());
		String first  = StringUtils.betterString(str_1,str_2,(s1,s2)->true);
		System.out.println("longer: "+longer);		
		System.out.println("first: "+first);
	}

	public static String betterString(String str1,String str2,BiFunction<String,String,Boolean> f)
	{
		if(f.apply((String)str1,(String)str2))
			return str1;
		else return str2;
	}



}