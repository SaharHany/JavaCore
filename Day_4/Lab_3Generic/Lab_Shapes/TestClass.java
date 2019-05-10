import java.util.ArrayList;
import java.util.List;

public class TestClass
{
	public static void main(String[]args)
	{
		List<Shape> Shape_list       = new ArrayList<Shape> ();
		List<Rectangle> Rec_list     = new ArrayList<Rectangle> ();
		
		for(int counter=0;counter<4;counter++)
		{
			Rec_list.add(new Rectangle(counter,counter+3));
			if(counter%2==0)
				Shape_list.add(new Rectangle(counter+2,counter));
			else
				Shape_list.add(new Circle(counter,counter+2,(counter+1)*2));
 		}
		
		drawShapes(Shape_list);
		drawShapes(Rec_list);
					
	}
	
	public static void drawShapes(List <? extends Shape> shape_list)
	{
		System.out.println("The Shape List contains:");
		for(int counter=0;counter<shape_list.size();counter++)
		{
			shape_list.get(counter).draw();
		}
	}

}