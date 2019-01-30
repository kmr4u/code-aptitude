
public class QuickUnion {

	private int[] id;
	
	public QuickUnion(int n)
	{
		for(int i=0; i<n; i++)
			id[i]=i;
	}
	
	private int root(int i)
	{
		while(i != id[i])
			i = id[i];
		
		return i;
	}
	
	public boolean connected(int p, int q)
	{
		return root(p) == root(q);
	}
	
	public void union(int p, int q)
	{
		int iroot = root(p);
		int jroot = root(q);
		
		id[iroot] = jroot;
		
	}
}

