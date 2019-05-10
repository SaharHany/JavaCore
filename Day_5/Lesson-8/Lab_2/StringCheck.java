import java.util.function.Predicate;
public class StringCheck{
	public static void main (String[]args)
	{
		String str = "Hello Java SE 8";
		boolean str_check = check(str,Character::isLetter);
		if(str_check)
			System.out.println("String = "+str+" -> Contains only alphabets");
		else    System.out.println("String = "+str+" -> Contains alphabets and numbers");
	}

	public static boolean check(String str , Predicate<Character> predicate)
	{
		for(int it=0;it<str.length();it++)
		{
			if(!predicate.test((Character)str.charAt(it)))
				return false;
		}
		return true;
	}

}