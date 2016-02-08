package Execute;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;


public class Anagram {
	
	
//	To Check if two strings are Anagrams of each other
	
	public static void anagram(String str1, String str2)
	{

	    if(str1.length() != str2.length())
	    {
	        System.out.println(" The Strings are not anagrams");
	         return;
	        }
	    else
	    {
	        HashMap<Character,Integer> val1 = new HashMap<Character,Integer>();
	        HashMap<Character,Integer> val2 = new HashMap<Character,Integer>();
	        for (int i =0; i < str1.length();i++)
	        {
	            char c1 = str1.charAt(i);
	            char c2 = str2.charAt(i);
	            if(val1.get(c1) != null)
	            {
	                int count1 = val1.get(c1);
	                val1.put(c1,++count1);
	            }
	            else
	            {
	                val1.put(c1,1);
	            }
	            if(val2.get(c2) != null)
	            {
	                int count2 = val2.get(c2);
	                val2.put(c2,++count2);
	            }
	            else
	            {
	                 val2.put(c2,1);
	            }	        
	    }
	        if(val1.equals(val2))
	        {
	             System.out.println("They are anagrams");
	        }
	        else
	        {
	            System.out.println("They are not anagrams");
	        }
	    }       
	}  

//	1.) Given an array, find the maximum difference between two array elements given the second element comes after the first. 
//
//	For example. 
//
//	array = [1,2,3,4,5,6,7] 
//
//	We can take the difference between 2 and 1 (2-1), but not the different between 1 and 2 (1-2). 
	
	public static int maxDiff(int arr[], int arr_size)
	{
	  int max_diff = arr[1] - arr[0];
	  int min_element = arr[0];
	  int i;
	  for(i = 1; i < arr_size; i++)
	  {      
	    if(arr[i] - min_element > max_diff)                              
	      max_diff = arr[i] - min_element;
	    if(arr[i] < min_element)
	         min_element = arr[i];                    
	  }
	  return max_diff;
	} 
	
//	Input - List<String> ["star", "rats", "ice", "cie", "arts"] 
//			print all anagrams in buckets: 
//			["star", "rats", "arts"] 
//			["ice", "cie"] 
//
//			The signature of unimplemented method is given:
//
//
	public static void anagramBuckets(List<String> input)
	{
		HashMap<Integer,List<String>> group = new HashMap<Integer,List<String>>();
		for(String str:input)
		{
			char[] charArray = str.toCharArray();
			HashMap<Character,Integer> strHash = new HashMap<Character,Integer>();
			for(char ch:charArray)
			{
				if(strHash.containsKey(ch))
				{
					int value = strHash.get(ch);
					strHash.put(ch, new Integer(value));
				}
				else
				{
					strHash.put(ch, new Integer(1));
				}
			}
			int hashcode = strHash.hashCode();
			
			if(group.containsKey(hashcode))
			{
				List<String> bucket = group.get(hashcode);
				bucket.add(str);
				group.put(hashcode,bucket);
			}
			else
			{
				List<String> temp = new ArrayList<String>();
				temp.add(str);
				group.put(hashcode,temp);
			}
		}
		ArrayList<List<String>> print = new ArrayList<List<String>>(group.values());
		for(List<String> bucket:print)
		{
			System.out.print("{");
			for(String printString:bucket)
			{
				System.out.println("\""+printString+"\"");
			}
			System.out.println("}");
		}
	}  
}
