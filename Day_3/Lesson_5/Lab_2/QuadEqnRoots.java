package functionInterface;
import java.util.Scanner;
import java.util.function.Consumer;
public class QuadEqnRoots{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Please Enter the coeffcients of the Quad eqn: ");
		Double arr_coeff [] = new Double [3]; 
		for(int counter=0;counter<3;counter++)
			arr_coeff[counter] = input.nextDouble();
		printRoots(arr_coeff);
		
	}

	public static void printRoots(Double [] arr_coeff)
	{
		Consumer<Double[]> calcRoot = (arr)->{
		Double a ,b,c ;
	        a = arr[0];
		b = arr[1];
		c = arr[2];
		Double root_check = b*b-4*a*c;
		if(root_check==0)
		{
			Double root = (-1.0*b)/(2*a);
			System.out.println("There is 1 Real root and sqrroot = "+Math.sqrt(root));
		}
		else if(root_check>0)
		{
			Double sqRoot = Math.sqrt(root_check);
			Double root1  = ((-1.0*b)+sqRoot)/(2*a);
			Double root2  = ((-1.0*b)-sqRoot)/(2*a);
			System.out.print("There is 2 Real roots and 1stroot = "+Math.sqrt(root1));
			System.out.println(" , 2ndroot= "+Math.sqrt(root2));
		}
		else{
			Double sqRoot = Math.sqrt(root_check*-1);
			Double root  = (-1.0*b)/(2*a);
			Double ComplexPart = sqRoot/(2*a);
			System.out.println("There is 2 Complex roots :");
			System.out.println(" 1stroot = "+root+" + "+ComplexPart+"i");
			System.out.println(" 2ndroot= "+root+" - "+ComplexPart+"i");	
		} 
	
	  };
	  calcRoot.accept(arr_coeff);	
	}

}