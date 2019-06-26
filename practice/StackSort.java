package practice.org;
import java.util.ListIterator; 
import java.util.Stack; 
  
public class StackSort 
{ 
    static void sortedInsert(Stack<Integer> s, int x) 
    { 
     
        if (s.isEmpty() || x > s.peek()) 
        { 
            s.push(x); 
            System.out.println("pushed: "+x);
            return; 
        } 
       
        int temp = s.pop(); 
        sortedInsert(s, x); 
       
        s.push(temp); 
        System.out.println("pushed: "+temp);
    } 
       
    static void sortStack(Stack<Integer> s) 
    {  
        if (!s.isEmpty()) 
        { 
            int x = s.pop(); 
            System.out.println("popped: "+x);
            sortStack(s); 
       
            sortedInsert(s, x); 
        } 
    } 
      
    // Driver method  
    public static void main(String[] args)  
    { 
        Stack<Integer> s = new Stack<>(); 
        s.push(30); 
        s.push(-5); 
        s.push(18); 
        s.push(14); 
        s.push(-3); 
       
        System.out.println("Stack elements before sorting: "); 
        System.out.println(s); 
       
        sortStack(s); 
       
        System.out.println(" \n\nStack elements after sorting:"); 
        System.out.println(s); 
       
    } 
}