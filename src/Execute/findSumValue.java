package Execute;

import java.util.HashMap;

public class findSumValue {

	//Write a function that takes a list of numbers and a value, and return a pair of numbers from the list that sum to the given value.
	public static int[] numbers(int[] a, int sum) {
	    HashMap<Integer,Integer> value = new HashMap<Integer,Integer>();
	    for(int i : a) {
	        value.put(new Integer(i).hashCode(),i);
	    }
	    for(int i : a) {
	        int valuetoSearch = sum - i;
	        if(value.containsValue(new Integer(valuetoSearch))) {
	            int[] returnarray = new int[2];
	            returnarray[0] = i;
	            returnarray[1] = valuetoSearch;
	            return returnarray;
	         }
	    }
	    return null;
	}
}
