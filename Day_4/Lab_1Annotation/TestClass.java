import java.lang.reflect.*;
import java.lang.annotation.*;
public class TestClass{
	public static void main(String[]args)
	{
		Test();
	}
	public static void Test()
	{
		MyAnnotatedClass object_Test = new MyAnnotatedClass();
		try{
			Class<?> class_Test  = object_Test.getClass();
			Method   method_Test = class_Test.getMethod("getMsg");
			
			Field f = class_Test.getField?("msg");
			Constructor con_Test = class_Test.getConstructor();
			
			Author   annotation  = method_Test.getAnnotation(Author.class); 
			Author   annotation_con  = (Author) con_Test.getAnnotation(Author.class); 
			Author   annotation_class  = class_Test.getAnnotation(Author.class); 
			Author   annotation_f  = f.getAnnotation(Author.class); 
			
			System.out.println(annotation.author_name());
			System.out.println(annotation_con.author_name());
			System.out.println(annotation_class.author_name());
			System.out.println(annotation_f.author_name());
		
	}
		catch(NoSuchMethodException exc) 
		{
			System.out.println("Method Not Found.");
		}	
	}

}