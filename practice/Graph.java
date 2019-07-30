package practice.org;

public class Graph {

	private final int V;
	private Bag<Integer>[] adj;
	
	//Initialize a graph with n vertices
	public Graph(int n)
	{
		V = n;
		adj = (Bag<Integer>[]) new Bag[n];
		for(int i=0; i<n; i++)
		{
			adj[i] = new Bag<Integer>();
		}
	}
	
	public void addEdge(Integer u, Integer v)
	{
		adj[u].add(v);
		adj[v].add(u);
	}
	
	public Iterable<Integer> adj(Integer v)
	{
		return adj[v];
	}
	
	public int size()
	{
		return V;
	}
}
