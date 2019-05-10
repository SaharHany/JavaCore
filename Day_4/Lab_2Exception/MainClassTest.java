import java.sql.SQLException;
import java.io.IOException;

public class MainClassTest {

	public static void main(String[]args) throws MyException 
	{
		//TestClass obj = new TestClass();
		
		//calling first method 
		try{
			TestClass.test_Method1();
		}
		catch(MyException e)
		{
			System.out.println("Inside Catch");
		}
		finally{
			System.out.println("Inside Finally");	
		}

		//calling 2nd method which is already by try-catch
		TestClass.test_Method2();

		//calling 3nd method 
		try{
			TestClass.test_Method3();
		}
		catch(SQLException e)
		{
			System.out.println("Inside Catch");
		}
		finally{
			System.out.println("Inside Finally");	
		}
	}

}