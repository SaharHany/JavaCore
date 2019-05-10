import java.util.regex.*;
import java.lang.String;
import java.util.Scanner;
public class TextAnalysis{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("PLease Enter a Paragraph:");
		String Paragraph = input.nextLine();
		System.out.println("\nPLease Enter a keyword:");
		String Keyword   = input.next();
		
		System.out.println("No OF Occurances of Keyword ("+Keyword+") = ");
		int OccurrancesOfWord_UsingRegex = countByRegex(Paragraph,Keyword);
		
		System.out.println(" By Regex = "+OccurrancesOfWord_UsingRegex);		
	}

	static int countByRegex(String Paragraph,String Keyword)
	{
		 Pattern p = Pattern.compile(Keyword);
 		 Matcher m = p.matcher(Paragraph);
		 int count =0;
		 while(m.find())
		 {
			count++;
		 }
		return count;
	}
} 