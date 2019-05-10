import java.util.Scanner;
import java.lang.String;
import java.util.StringTokenizer;
public class OccuranceOfWord{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("PLease Enter a Paragraph:");
		String Paragraph = input.nextLine();
		System.out.println("\nPLease Enter a keyword:");
		String Keyword   = input.next();
		int OccurrancesOfWord_UsingTokenizer = CountByTokenizer(Paragraph,Keyword);
		System.out.print("No OF Occurances of Keyword = "+Keyword);
		System.out.println(" is = "+OccurrancesOfWord_UsingTokenizer);		
	}


	static int CountByTokenizer(String paragraph,String word)
	{
		int count = 0;
		StringTokenizer Token = new StringTokenizer(paragraph);
     		while (Token.hasMoreTokens())
         	{
			if((Token.nextToken()).equals(word))
				count++;	
		
	        }
		return count;	
	}

}
