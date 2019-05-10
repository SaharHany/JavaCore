public class Circle extends Shape
{
	double center_x;
	double center_y;
	double rad;
	public Circle()
	{
		center_x = 0;
		center_y = 0;
		rad = 0;
	}
	
	public Circle(double x , double y,double given_rad)
	{
		center_x = x;
		center_y = y;
		rad = given_rad;
	}
	
	public void draw()
	{
		System.out.println("The shape is Circle:");
		System.out.println("x = "+center_x+" , y = "+center_y+" , rad = "+rad);
	}
}