package practice.org;

import java.util.Stack;

public class DeapthFirstSearch {

	private boolean[] visited;
	private int[] edgeTo; //used to track the predecessor while the traversal. Might change depending upon the order of the elements appear in the adjacency list of a given node.
	private int s; //Source vertex
	
	public DeapthFirstSearch(Graph G, int source)
	{
		s = source;
		visited = new boolean[G.size()];
		edgeTo = new int[G.size()];
		for(int i=0; i<G.size(); i++)
		{
			visited[i] = false;
		}
		dfs(G, source);
	}
	
	private void dfs(Graph G, int v)
	{
		visited[v] = true;
		for(int w : G.adj(v))
		{
			if(!visited[w])
			{
				dfs(G, w);
				edgeTo[w] = v;
			}
		}
	}
	
	/*
	 * Determines if there exists a path to the given vertex v from the source
	 */
	public boolean hasPathTo(int v) 
	{
		return visited[v];
	}
	
	/*
	 * Returns the path to the given vertex from the source
	 */
	public Iterable<Integer> pathTo(int v)
	{
		if(!visited[v]) return null;
		
		Stack<Integer> path = new Stack<Integer>();
		for(int x=v; x!=s; x=edgeTo[x])
		{
			path.push(x);
		}
		path.push(s);
		
		return path;
	}
	
}
