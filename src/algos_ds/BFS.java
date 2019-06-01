package algos_ds;

import java.util.Iterator;
import java.util.LinkedList;

/*

28/11/2018 -- Tuesday
-- Abhinav
*/

public class BFS {
	
	private int n;
	private LinkedList<Integer>[] list;
	
	public BFS(int vertices)
	{
		n=vertices;
		list=new LinkedList[vertices];
		
		for(int i=0;i<vertices;i++)
		{
			list[i]=new LinkedList<>();
		}
	}
	public void addEdge(int vertex,int value) {
		list[vertex].add(value);
	}
	
	public void bfs(int startVertex)
	{
		boolean[] visited=new boolean[n];
		visited[startVertex]=true;
		LinkedList<Integer> queue=new LinkedList<>();
		queue.add(startVertex);
		
		while(queue.size()!=0)
		{	
			startVertex=queue.poll();
			System.out.println(startVertex+" ");
			
			Iterator<Integer> itr=list[startVertex].listIterator();
			while(itr.hasNext())
			{
				int temp=itr.next();
				if(!visited[temp])
				{
					visited[temp]=true;
					queue.add(temp);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BFS g = new BFS(4); 
		  
        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(1, 2); 
        g.addEdge(2, 3); 
        g.addEdge(2, 0); 
     
        g.addEdge(3, 3); 
  
        System.out.println("Following is Breadth First Traversal "+ 
                           "(starting from vertex 2)"); 
  
        g.bfs(2); 
	}

}
