package Collection;

import java.util.LinkedList;

public class LinkedListStudy {

	public static void main(String[] args) {

		LinkedList ll=new LinkedList();
		
		ll.add("Rutuja");
		ll.add("Bagal");
		ll.add(1234);
        ll.add(98.7);
        
        System.out.println(ll);
        System.out.println(ll.get(0));
        System.out.println(ll.containsAll(ll));
        System.out.println(ll.isEmpty());
        System.out.println(ll.peek());
        System.out.println(ll);
        System.out.println(ll.peekLast());
        System.out.println(ll.poll());
        System.out.println(ll);
        System.out.println(ll.pop());
        System.out.println(ll);


        
        

		
	}

}
