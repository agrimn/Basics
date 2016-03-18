package Execute;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDigitsThrice {
	// Given a collection of integers find values that are present exactly three times
	public static ArrayList<Integer> findDigitThrice(int[] a) {
	    HashMap<Integer,Integer> check = new HashMap<Integer,Integer>();
	    ArrayList<Integer> solutions = new ArrayList<Integer>();
	    for(int i : a) {
	        if(check.containsKey(i)) {
	            int presence = check.get(new Integer(i));
	            presence++;
	            check.put(new Integer(i),presence);
	         } else {
	             check.put(new Integer(i), 1);
	         }
	     }     
	    Set value = check.entrySet(); 
	    Iterator itr = value.iterator();
	       while(itr.hasNext()) {
	    	   Map.Entry m = (Map.Entry) itr.next();
	    	   if((int) m.getValue() == 3){
	    		   solutions.add(new Integer((int) m.getKey()));
	    	   }
	       }
	       return solutions;
	}
}
