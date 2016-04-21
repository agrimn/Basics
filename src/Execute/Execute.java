package Execute;
import java.util.ArrayList;
import java.util.List;

public class Execute {
	
	public static void main(String [] args) {		
//		String a = "agrim";
//		String b  = "mirga";
//		Anagram.anagram(a,b);
		
//		int[] a = {1,6,23,71,331,843};
//		BinarySearch.binaySearchValue(a,1);
		
//		int[] a = {16,46,23,71,331,843};
//		int sum = 94;
//		boolean result = ContinousSquenceSum.addUp(a, sum);
//		boolean result = ContinousSquenceSum.findSum(a, sum);
//		System.out.println(result);
		
//		List<String> input = new ArrayList<String>();
//		input.add("cat");
//		input.add("bat");
//		input.add("tac");
//		AnagramBuckets.anagramBuckets(input);
		
//		String r = "ra p p ar";
//		System.out.println(Palindrome.isPalindrome(r));
		
//		List<Integer> a= new ArrayList<Integer>();
//		a.add(2);
//		a.add(4);
//		a.add(8);
//		a.add(34);
//		ReverseLists.reverseList(a);
		
		//RotateArray
//		int[] a= {1,2,3,5,6,7,8,0};
//		int k = 3;
//		rotateArray.rotateArrayValue(a, k);
		
		//FindAnagrams
//		FindAnagrams.run();
		
		//Find Max Profit
//		int[] a= {5,21,4,6,7,8,4,3,7,9};
//		FindMaxProfit.findMaxProfit(a);
		
//		LinkedListCustom i = new LinkedListCustom();
//		i.add(new Integer(4));
//		i.add(new Integer(54));
//		i.add(new Integer(68));
//		i.add(new Integer(0));
//		i.add(new Integer(46));
//		System.out.println(i.getValue(2));
//		System.out.println(i.remove(2));
//		System.out.println(i.getValue(2));
//		System.out.println(i.find(new Integer(68)));
		
		//Find if two numbers add to the given Sum
//		int[] a= {1,2,3,5,6,7,8,0};
//		int sum = 6;
//		int[] value = findSumValue.numbers(a, sum);
//		System.out.println("numbers are :"+value[0]+" "+ value[1]);
		
		// Given a collection of integers find values that are present exactly three times
//		int[] a= {1,2,3,5,6,2,1,2,3,2,3};
//		System.out.println(FindDigitsThrice.findDigitThrice(a));
		
		// Find Pythogeran triplets in a the given array a2=b2+c2;
//		int[] a= {8,12,3,15,6,17,4,5,2,13};
//		System.out.println(PythogareanTriplets.pythogrenTriplets(a));
		
		//Find max sum of a subarray in an array		
//		int[] a = {5,-2,3,-3,-10};
//		int[] result = MaxSubsequencesum.maxsubsequence_fornegative_returnsubarray(a);
//		for( int i : result)
//		System.out.println(i);
		
		//Find Cieling
//		int[] a = {1,4,8,12,45,78};
//		System.out.println(CeilingInArray.findCeiling(a, 90));
		
		//Max Priority Queuexx
//		MaxPriorityQueue q = new MaxPriorityQueue(10);
//		q.add(10);
//		q.add(4);
//		q.add(1);
//		q.add(3);
//		q.add(2);
//		q.add(9);
//		q.add(12);
//		q.printQ();
//		q.deleteMax();
//		System.out.println();
//		q.printQ();
//		q.deleteMax();
//		System.out.println();
//		q.printQ();
		
		//Check if a number occurs multips times:
//		int[] a = {5,-2,3,3,-10,-2,-2,-10,10,-10,10};
//		System.out.println(MultipleOccuranceNo.multipletimes(a));
		
		//Lets create nodes as given as an example in the article
//		Node nA=new Node(2);
//		Node nB=new Node(1);
//		Node nC=new Node(3);
//		Node nD=new Node(5);
//		Node nE=new Node(8);
//		Node nF=new Node(9);
//
//		//Create the graph, add nodes, create edges between nodes
//		GraphTraversal g=new GraphTraversal();
//		g.addNode(nA);
//		g.addNode(nB);
//		g.addNode(nC);
//		g.addNode(nD);
//		g.addNode(nE);
//		g.addNode(nF);
//		g.setRootNode(nA);
//		
//		g.connectNode(nA,nB);
//		g.connectNode(nA,nC);
//		g.connectNode(nA,nD);
//		
//		g.connectNode(nB,nE);
//		g.connectNode(nB,nF);
//		g.connectNode(nC,nF);
//		
//		
//		//Perform the traversal of the graph
//		System.out.println("DFS Traversal of a tree is ------------->");
//		g.dfs();
//		System.out.println();
//		System.out.println("BFS Traversal of a tree is ------------->");
//		g.bfs();
		
		int [] p = {0,1};
		int [] l = {-1,0};
		int [] r = {0, 0};
		System.out.println(SegmentsAndPoints.isPossible(p,l,r));
	}

}
