public class BinarySearch{
	
	public static void main(String[] args)
	{
		int size = 100000;
		long [] arr_No = new long [size];
		for(int counter=0;counter<size;counter++)
			arr_No[counter] = (long)(Math.random()*1000);
		long min=arr_No[0],max=arr_No[0];
		long search_key = (long)(Math.random()*1000);
		long sorted_arr[] = sortBySelectionSort(arr_No);
		
		long time_before_search = System.currentTimeMillis();
		long result = searchByBinarySearch(sorted_arr,search_key);		
		long time_after_search = System.currentTimeMillis();
		
		long time_Taken = time_after_search-time_before_search;
		System.out.println("The Search Key = "+search_key);
		System.out.println("The Time taken for search="+time_Taken);
		
	}

	static long[] sortBySelectionSort(long [] arr)
	{
		int i , j , min;
		int size = arr.length;
		for(i=0;i<(size-1);i++)
		{
			min = i;
			for(j=(i+1);j<size;j++)
			{
				if(arr[min]>arr[j])
					min = j;

			}
			if(min != i)
			{
				long temp ;
				temp      = arr[i]   ;
				arr[i]    = arr[min] ;
				arr[min]  = temp;

			}
		}
		return arr;
	}

	
	static long searchByBinarySearch(long [] sorted_arr,long num)
	{	
		boolean found = false;
		int high  = sorted_arr.length;
		int low   = 0;
		int mid   =-1 ;

		while((!found)&&(low<=high))
		{
			mid = (high+low)/2;
			if(sorted_arr[mid]>num)
			{
				high = mid - 1 ;
			}
			else if(sorted_arr[mid]<num)
			{
				low = mid + 1;
			}
			else{
				found =true;
			}
		}

		if(found)
			return sorted_arr[mid];
		else return -1;
	}


}