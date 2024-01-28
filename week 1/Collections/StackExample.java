import java.util.*;  

public class StackExample{  
public static void main(String args[]){  
Stack<String> stack = new Stack<String>();  
stack.push("john");  
stack.push("matt");  
stack.push("blake");  
stack.push("misha");  
stack.push("dave");  
stack.pop();  
Iterator<String> itr=stack.iterator();  
while(itr.hasNext()){  
System.out.println(itr.next());  
}  
}  
} 