import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@interface Author{
	String author_name();
}