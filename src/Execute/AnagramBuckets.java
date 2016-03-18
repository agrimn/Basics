package Execute;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class AnagramBuckets {

	
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
