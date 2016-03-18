package Execute;

import java.util.ArrayList;

public class PythogareanTriplets {

	public static ArrayList<ArrayList<Integer>> pythogrenTriplets(int []e) {

		//This is pretty similar to the 3 Sum problem but not the same, Check the conditions
	    int[] as = new int[e.length];
	    ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	    for(int i =0 ; i < e.length;i++) {
	        as[i] = e[i]*e[i];
	     }
	     java.util.Arrays.sort(as);
	     for(int i = 0; i < as.length;i++) {
	         int a = as[i];
	         int start = 0;
	         int end = i-1;  
	         while(start<end) {
	             int b = as[start];
	             int c = as[end];
	             if(a == b+c) {
	                 ArrayList<Integer> triplet = new ArrayList<Integer>();
	                 triplet.add(new Integer((int) Math.sqrt(a)));
	                 triplet.add(new Integer((int) Math.sqrt(b)));
	                 triplet.add(new Integer((int) Math.sqrt(c)));
	                 result.add(new ArrayList(triplet));
	                 start++;
	                 end--;
	             } else if( a > b+c) {
	            	 start++;
	             } else {
	                 end--;
	             }
	        }
	     }
	     return result;
	}              
}

//Algo for 3 Sum problem
//		 sort(S);
//		 for i=0 to n-3 do
//		    a = S[i];
//		    start = i+1;
//		    end = n-1;
//		    while (start < end) do
//		       b = S[start]
//		       c = S[end];
//		       if (a+b+c == 0) then
//		          output a, b, c;
//		          // Continue search for all triplet combinations summing to zero.
//		           end = end - 1
//		       else if (a+b+c > 0) then
//		          end = end - 1;
//		       else
//		          start = start + 1;
//		       end
//		    end
//		 end
