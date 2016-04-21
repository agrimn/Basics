package Execute;

public class SegmentsAndPoints{

	public static String isPossible(int [] p, int [] l, int [] r) {
		int[] segmentsOccupied = new int[p.length];
		String value = null;
		for(int i = 0 ; i < p.length ; i++) {
			for(int k = 0 ; k < l.length;k++){
				if(p[i] >= l[k] && p[i] <= r[k]){
					segmentsOccupied[i] = 1;
					break;
				}
			}
		}
		for(int i = 0 ; i < p.length;i++){
			if(segmentsOccupied[i] == 0)
				value =  "Impossible";
		}
		value = "Possible";
		return value;
	}
}
