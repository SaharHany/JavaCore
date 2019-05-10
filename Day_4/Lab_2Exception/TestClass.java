import java.sql.SQLException;

public class TestClass
{
	public static void test_Method1() throws MyException
	{
		throw new MyException();	
	}

	public static void test_Method2() 
	{
		try{
			throw new MyException();	
		}
		catch(MyException e)
		{
			System.out.println("Inside catch");
		}
	}

	public static void test_Method3() throws MyException,SQLException
	{
		try{
			throw new MyException();	
		}
		catch(MyException e)
		{
			System.out.println("Inside catch");
			throw new SQLException();		
		}	
	}
}