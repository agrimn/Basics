package Execute;

public class BinarySearch {
	
	public static void binaySearchValue(int [] arr,int find)
	{
		int length = arr.length;
		findValue(arr,0,length,find);
	}

	private static void findValue(int[] arr, int beg, int end, int find) {
		if (beg > end || (beg+end)/2 == arr.length)
		{
			System.out.println("key not found");
			return;
		}
		if(arr[(beg+end)/2] == find)
		{
			System.out.println("The position :"+(beg+end)/2);
			return;
		}
		else if(arr[(beg+end)/2] < find)
		{
			findValue(arr,((beg+end)/2)+1,end,find);
		}
		else if(arr[(beg+end)/2] > find)
		{
			findValue(arr,beg,((beg+end)/2)-1,find);
		}

	}
}
