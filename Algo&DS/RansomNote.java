import java.util.*;

//To be Corrected
public class RansomNote {

	Map<String, Integer> magazineMap;
    Map<String, Integer> noteMap;
    
    String magazine;
    String note;
    public RansomNote(String magazine, String note) {
    	
    	magazineMap = new Hashtable<String, Integer>();
    	noteMap = new Hashtable<String, Integer>();
    	this.magazine = magazine;
    	this.note = note;
    }
    
    public boolean solve() {
    	String[] magazineKeys = magazine.split(" ");
        String[] noteKeys = magazine.split(" ");
        
        for(int i=0; i<magazineKeys.length; i++)
        {
        	magazineMap.put(magazineKeys[i], 1);
        	
        }
        for(int i=0; i<noteKeys.length; i++)
        {
        	noteMap.put(noteKeys[i], 1);
        	
        }
        
       Set<String> noteKeySet =  noteMap.keySet();
       
       for(String key: noteKeySet)
       {
    	   if(!magazineMap.containsKey(key))
    		   return false;
       }
    	return true;
    	
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        
        // Eat whitespace to beginning of next line
        scanner.nextLine();
        
        RansomNote s = new RansomNote(scanner.nextLine(), scanner.nextLine());
        scanner.close();
        
        boolean answer = s.solve();
        if(answer)
            System.out.println("Yes");
        else System.out.println("No");
      
    }
}




