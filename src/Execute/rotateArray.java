package Execute;

//Problem:
//Rotate an array of n elements to the right by k steps. For example, with n = 7 and k = 3,
//the array [1,2,3,4,5,6,7] is rotated to [5,6,7,1,2,3,4].
//How many different ways do you know to solve this problem?

public class rotateArray {

	public static void rotateArrayValue(int[] array,int k)
	{
		System.out.println("Original Array :");
		for(int i = 0 ; i < array.length;i++)
		{
			System.out.print(array[i]+",");
		}
		System.out.println();
		//Reverse 0 - k
		reverseAArray(array,0,k);
		//Reverse k - array.length
		reverseAArray(array,k,array.length);
		//Reverse 0 array - length
		reverseAArray(array,0,array.length);
		System.out.println("new Array;");
		for(int i = 0 ; i < array.length;i++)
		{
			System.out.print(array[i]+",");
		}
	}
	
	private static int[] reverseAArray(int[] array,int start,int end)
	{
		int temp;
		for(int i =start; i < start+(end-start)/2 ; i++)
		{
			temp = array[i];
			array[i] = array[end-1];
			array[end-1] = temp;
			end--;
		}
		return array;
	}
}
