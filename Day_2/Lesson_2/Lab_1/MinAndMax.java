import java.lang.Math;
import java.lang.System;
public class MinAndMax{
	public static void main(String[] args)
		{	
			int size = 100000;
			long [] arr_No = new long [size];
			for(int counter=0;counter<size;counter++)
				arr_No[counter] = (long)(Math.random()*1000);
			long min=arr_No[0],max=arr_No[0];
			long time_before_search = System.currentTimeMillis();
			for(int counter=1;counter<size;counter++)
			{
				if(min>arr_No[counter])
					min = arr_No[counter];
				
				if(max<arr_No[counter])
					max = arr_No[counter];
			}
			long time_after_search = System.currentTimeMillis();
			long time_Taken = time_after_search-time_before_search;
			System.out.println("The min value = "+min+" ,The max value = "+max);
			System.out.println("The Time taken for search="+time_Taken);
		}
}