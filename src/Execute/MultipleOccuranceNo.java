package Execute;

import java.util.ArrayList;
import java.util.HashMap;

public class MultipleOccuranceNo {

	public static ArrayList<Integer> multipletimes(int [] a) {
	    HashMap<Integer,Integer> hasvalue = new HashMap<Integer,Integer>();
	    ArrayList<Integer> result = new ArrayList<Integer>();
	    for(int i:a) {
	        if(hasvalue.containsKey(i)) {
	            int nooftimes =(int) hasvalue.get(i);
	            if(nooftimes == 1)
	            	result.add(i);
	            hasvalue.put(new Integer(i), new Integer(++nooftimes));
	       } else {
	           hasvalue.put(new Integer(i), new Integer(1));
	       }
	   }
	   return result;
	}
}
