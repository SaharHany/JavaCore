import java.lang.annotation.*;
@Author(author_name="Sahar")
public class MyAnnotatedClass{
	
	@Author(author_name="Sahar")
	public String msg;
	@Author(author_name="Sahar")
	public MyAnnotatedClass()
	{
		msg = "Here is the Constructor";		
	}

	@Author(author_name="Sahar")
	public void getMsg()
	{
		System.out.println(msg);
	}

}