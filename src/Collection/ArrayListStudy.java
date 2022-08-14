package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListStudy {

	public static void main(String[] args) {
         ArrayList al = new ArrayList();
		
		al.add("Rutuja");
		al.add("Bagal");
		al.add(1234);
        al.add(98.7);
        
        System.out.println(al);
       System.out.println(al.contains(1234));
     //  System.out.println(al.remove(3));
       System.out.println(al);
       System.out.println(al.isEmpty());
       
       
      //System.out.println("==================");
      System.out.println("====Using For Loop====");
      
      for(int i=0;i<=al.size()-1;i++)
      {
    	  System.out.println(al.get(i));
      }      
      
      //System.out.println("==================");
      System.out.println("====Using For each Loop====");
      
      for(Object r:al)
      {
    	  System.out.println(r);
      }      
    System.out.println("==== Iterator ====");
                Iterator it = al.iterator(); 
                
         while(it.hasNext())
         {
        	 System.out.println(it.next());
         }
         
         
         System.out.println("==== list Iterator ====");
         ListIterator li = al.listIterator();
         
         while(li.hasNext())
        {
 	 System.out.println(li.next());
       }
         
        


	}

}
