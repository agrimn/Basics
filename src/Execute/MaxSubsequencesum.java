package Execute;

public class MaxSubsequencesum {
	
	//Kdane's algorithm
	//The algorithm contains both positive and negative integers
	public static int maxsubsequence(int[] a) {
	    int maxsum_sofar = 0;
	    int maxsum_here = 0 ;
	    for(int i = 0 ; i < a.length;i++) {
	        maxsum_here += a[i];
	        if(maxsum_here < 0)
	            maxsum_here = 0;
	        if(maxsum_sofar<maxsum_here)
	            maxsum_sofar = maxsum_here;
		}
	    return maxsum_sofar;
	}
	
	//If the Algorithm contains only negaitve numbers we use this:
	public static int maxsubsequence_fornegative(int[] a) {
	    int maxsum_sofar = a[0] ;
	    int maxsum_here = a[0];
	    for(int i =1; i < a.length;i++) {
	        maxsum_here += a[i];
	        if(maxsum_here < a[i])
	           maxsum_here = a[i];
	        if(maxsum_here> maxsum_sofar)
	            maxsum_sofar = maxsum_here;
	    }
	   return maxsum_sofar;      
	}
	
	//If you are suppose to return the subarray itself:
	public static int[] maxsubsequence_fornegative_returnsubarray(int[] a) {
	    int maxsum_sofar = a[0] ;
	    int maxsum_here = a[0];
	    int start = 0 ;
	    int end = 0;
	    for(int i =1; i < a.length;i++) {
	        maxsum_here += a[i];
	        if(maxsum_here < a[i]) {
	        	maxsum_here = a[i];
	        }
	        if(maxsum_here> maxsum_sofar) {
	            maxsum_sofar = maxsum_here;
	            end = i;
	        }
	        if(maxsum_sofar == maxsum_here && maxsum_here == a[i])
	        	start = i;
	    }
	    int result[] = new int[end-start+1];
	    int l = 0;
	    for(int k = start; k <= end; k++){
	    	result[l] = a[k];
	    	l++;
	    }
	   return result;      
	}
}
