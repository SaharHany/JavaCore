public class ReadAndPrint{
	public static void main(String [] args){
		if(args.length==2)
		{
			if(Integer.parseInt(args[0])>=0)
			{
				int input_number = Integer.parseInt(args[0]);
				for (int i=0;i<args.length;i++)
					System.out.println(args[1]);
			}
			else {
				System.out.println("Please Enter a Number");
			}			
		}
		else{
			System.out.println("Invalid Input");
		}
	}
}
