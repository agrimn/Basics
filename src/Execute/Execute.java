package Execute;
import java.util.ArrayList;
import java.util.List;

import chapterOne.One;

public class Execute {
	
	public static void main(String [] args) {		
//		String a = "agrim";
//		String b  = "mirga";
//		Anagram.anagram(a,b);
		
//		int[] a = {1,6,23,71,331,843};
//		BinarySearch.binaySearchValue(a,1);
		
//		int[] a = {16,46,23,71,331,843};
//		int sum = 94;
//		boolean result = ContinousSquenceSum.addUp(a, sum);
//		boolean result = ContinousSquenceSum.findSum(a, sum);
//		System.out.println(result);
		
//		List<String> input = new ArrayList<String>();
//		input.add("cat");
//		input.add("bat");
//		input.add("tac");
//		Anagram.anagramBuckets(input);
		
//		String r = "ra p p ar";
//		System.out.println(Palindrome.isPalindrome(r));
		
//		List<Integer> a= new ArrayList<Integer>();
//		a.add(2);
//		a.add(4);
//		a.add(8);
//		a.add(34);
//		ReverseLists.reverseList(a);
		
		//RotateArray
//		int[] a= {1,2,3,5,6,7,8,0};
//		int k = 3;
//		rotateArray.rotateArrayValue(a, k);
		
		//FindAnagrams
//		FindAnagrams.run();
		
		//Find Max Profit
//		int[] a= {5,21,4,6,7,8,4,3,7,9};
//		FindMaxProfit.findMaxProfit(a);
		
		LinkedListCustom i = new LinkedListCustom();
		i.add(new Integer(4));
		i.add(new Integer(54));
		i.add(new Integer(68));
		i.add(new Integer(0));
		i.add(new Integer(46));
		System.out.println(i.getValue(2));
		System.out.println(i.remove(2));
		System.out.println(i.getValue(2));
		System.out.println(i.find(new Integer(68)));
	}

}
