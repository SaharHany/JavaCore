import java.util.Scanner;
import java.lang.String;
public class SearchForWord{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("PLease Enter a Paragraph:");
		String Paragraph = input.nextLine();
		System.out.println("\nPLease Enter a keyword:");
		String Keyword   = input.next();
		
		System.out.println("No OF Occurances of Keyword ("+Keyword+") = ");
		int OccurOfWord_UsingSplit = countBySplitParagraph(Paragraph,Keyword);
		int OccurOfWord_UsingIndxMeth = countByIndexOFMeth(Paragraph,Keyword); 
		int OccurOfWord_UsingSubstrMeth =countBySubstrMeth(Paragraph,Keyword);
		//int OccurOfWord_UsingSubstrIndxMeth=countBySubstrIndxofMeth(Paragraph,Keyword);
		System.out.println(" By Split = "+OccurOfWord_UsingSplit);		
		System.out.println(" By indexof = "+OccurOfWord_UsingIndxMeth);
		System.out.println(" By substring = "+OccurOfWord_UsingSubstrMeth);
		//System.out.println(" By substrIndx = "+OccurOfWord_UsingSubstrIndxMeth);


	}

	static int countBySplitParagraph(String paragraph,String keyword)
	{
		int NoOfOcc = 0;
		String [] Words = paragraph.split(" ");
		for(int i=0;i<Words.length;i++)
		{
			if(Words[i].equals(keyword))
				NoOfOcc++;
		}
		return NoOfOcc;		
	}

	static int countByIndexOFMeth(String Paragraph,String Keyword)
	{
		int NoOfOcc = 0;
		int pointer = 0;
		while(pointer!=Paragraph.length()-1)
		{
			if(Paragraph.indexOf(Keyword,pointer)>-1)
			{
				pointer = Paragraph.indexOf(Keyword,pointer)+ Keyword.length();
				NoOfOcc++;
			}
			else pointer++;
		}
		return NoOfOcc;		
	}
	
	static int countBySubstrMeth(String Paragraph,String Keyword)
	{
		int NoOfOcc = 0;
		int pointer = 0;
		for(int i=0;i<Paragraph.length()-Keyword.length();i++)
		{
			if(Paragraph.substring(i,i+Keyword.length()).equals(Keyword))
			{	
				NoOfOcc++;
				i = i+Keyword.length();
			}		
		}

		return NoOfOcc;		
	}

	static int countBySubstrIndxofMeth(String Paragraph,String Keyword)
	{
		int NoOfOcc = 0;
		int First_Char = Keyword.charAt(0);
		int pointer = 0;
		int Word_Length =  Keyword.length();
			
		for(int i=0;i<Paragraph.length()-Keyword.length();i++)
		{
			int indx = Paragraph.indexOf(First_Char,i);
			if(indx>-1)
			{
				String test = Paragraph.substring(indx,indx+Word_Length);
				if(test.equals(Keyword))
				{
					NoOfOcc++;
					//System.out.println(test);
					i+=Word_Length-1;
				}
			}
		}

		/*while(pointer!=Paragraph.length()-Keyword.length())
		{
			int indx = Paragraph.indexOf(First_Char,pointer);
			int Word_Length =  Keyword.length();
			if(indx>=pointer)
			{
				String test = Paragraph.substring(indx,indx+Word_Length);
				if(test.equals(Keyword))
				{
					NoOfOcc++;
					pointer+=Word_Length;
				}
				else pointer++;
			}
			else pointer++;  
		}*/
		return NoOfOcc;		
	}



}