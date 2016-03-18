package Execute;

public class MaxPriorityQueue {

    int[] q;
    int N;
    
    public MaxPriorityQueue(int n) {
        N = 0;
        q = new int[n+1];
    }
    
    private boolean less(int i , int j) {
        if(q[i] < q[j])
            return true;
        else
            return false;
   }
   
   private void xchange(int i , int j) {
       int swap = q[i];
       q[i] = q[j];
       q[j] = swap;
   }
   
   private void swim(int k) {
       while(k > 1 && less(k/2,k)) {
           xchange(k/2,k);
           k = k/2;
       }
   }
   
   private void sink(int k) {
       while(2*k < N) {
           int j = 2*k;
           if(less(j,k) && less(j+1,k))
               break;
           if(less(j,j+1) && less(k,j+1)) {
               xchange(j+1,k);
               k = j+1;
           }else if(less(j+1,j) && less(k,j)) {
               xchange(j,k);
               k = j;
           }
     }
  }
  
  private void resize(int n) {
      int [] temp = new int[n];
      int l = 0 ;
      for(int i: q) {
          temp[l] = i;
          l++;
      }
      q = temp;
  }
      
  
  public void add(int x) {
      N++;
      if(N > q.length) 
          resize(2*N);
      else 
          q[N] = x;
      swim(N);
  }
  
  public int max() {
	    return q[1];
  }
  
  public void deleteMax() {
      if(N != 0) {
          xchange(1, N);
          N--;
          sink(1);
          q[N+1] = 0;
      }
  }   
  
  public void printQ() {
	  for(int i :q) {
		  System.out.print(i+" ");
	  }
  }
}