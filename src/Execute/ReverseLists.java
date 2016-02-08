package Execute;

import java.util.List;

public class ReverseLists {
	public static void reverseList(List<Integer> a)
	{
		int left = 0; int right = a.size()-1;
		while(left < right)
		{
			int value = a.get(left);
			int swap = a.get(right);
			a.set(left,swap);
			a.set(right,value);
			left++;
			right--;
		}
		System.out.println(a);
	} 
}
