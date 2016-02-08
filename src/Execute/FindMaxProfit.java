package Execute;

public class FindMaxProfit {
	// The trick here is the buyer needs to be before the seller
	// The min value needs to be before the max value
	//Same as the max difference problem solved earlier in Anagram.java
	public static void findMaxProfit(int[] a){
		int min = a[0];
		int max = a[0];
		int newmin = a[0];
		int maxdiff = 0;
		for(int i =1; i < a.length;i++) {
			if(a[i] < min){
				min = a[i];
			} else if(a[i]-min > maxdiff){
				newmin = min;
				max = a[i];
				maxdiff = a[i]-min;
			}
		}
		System.out.print("Max profit :"+(maxdiff));
	}
}
