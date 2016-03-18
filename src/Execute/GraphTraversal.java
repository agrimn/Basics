package Execute;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//The node is defined in Node.java prolly should implement this into another project like Tree
public class GraphTraversal {
    public Node root;
    public int[][] adjMatrix;
    private int size;
    public ArrayList nodes = new ArrayList();
	public void setRootNode(Node n)
	{
		this.root=n;
	}
	
	public Node getRootNode()
	{
		return this.root;
	}
	
	public void addNode(Node n)
	{
		nodes.add(n);
	}
	
	//This method will be called to make connect two nodes
	public void connectNode(Node start,Node end)
	{
		if(adjMatrix==null)
		{
			size=nodes.size();
			adjMatrix=new int[size][size];
		}

		int startIndex=nodes.indexOf(start);
		int endIndex=nodes.indexOf(end);
		adjMatrix[startIndex][endIndex]=1;
		adjMatrix[endIndex][startIndex]=1;
	}
    
    private Node getUnivisitedNodes(Node n) {
        int index = nodes.indexOf(n);
        for( int j = 0 ; j < size; j++) {
            if(adjMatrix[index][j] != 0 && ((Node)nodes.get(j)).visited == false) {
                return ((Node) nodes.get(j));
            }
        }
        return null;
    }
    
    private void printNode(Node n) {
        System.out.print(n.value);
    }
    private void clearnodes() {
    	Iterator itr = nodes.iterator();
    	while(itr.hasNext())
    		((Node)itr.next()).visited = false;
    }
    
    public void dfs() {
        Stack s = new Stack();
        s.push(this.root);
        root.visited = true;
        printNode(root);
        while(!s.isEmpty()) {
            Node n = (Node) s.peek();
            Node child = getUnivisitedNodes(n);
            if(child != null) {
                child .visited = true;
                printNode(child);
                s.push(child);
            } else {
                s.pop();
            }
        }
      clearnodes();
     }
    
    public void bfs() {
    	Queue q = new LinkedList();
    	q.add(this.root);
    	root.visited = true;
    	printNode(root);
    	while(!q.isEmpty()) {
    		Node n = (Node) q.remove();
    		Node child = null;
    		while((child = getUnivisitedNodes(n)) != null){
    			child.visited = true;
    			printNode(child);
    			q.add(child);
    		}
    	}	
    	clearnodes();
    }
}
