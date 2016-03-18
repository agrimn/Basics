package Execute;

public class CeilingInArray {
	public static int findCeiling(int[] a, int key) {
	        
	        int result = findceil(a,key,0,a.length);
	        return result;
	}
	
	private static int findceil(int[]a, int key, int start, int end) {
	
	    int mid = (start+end)/2;
	    if(key < a[0])
	    	return a[0];
	    if(start > end || mid == a.length)
	        return -1;
	    if(a[mid] == key)
	        return key;
	    else if( a[mid] > key) {
	        if(start <= mid-1 && a[mid-1] <= key)
	           return a[mid];
	       return findceil(a,key,start, mid-1);
	    }
	    else if(a[mid] < key) {
	        if(mid+1 <= end && mid+1 < a.length && a[mid+1] >= key) 
	          return a[mid+1];
	      return findceil(a,key,mid+1,end);
	   }
	    return -1;
	}
}
