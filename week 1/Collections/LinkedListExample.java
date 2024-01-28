import java.util.*;  
    
public class LinkedListExample{  
    public static void main(String args[]){  
    	LinkedList<String> al=new LinkedList<String>();  
    	al.add("ball");  
   	al.add("court");  
    	al.add("ball");  
    	al.add("disc");  
    
	Iterator<String> itr=al.iterator();  
    	while(itr.hasNext()){  
    		System.out.println(itr.next());  
    	}  
    	}  
    }  