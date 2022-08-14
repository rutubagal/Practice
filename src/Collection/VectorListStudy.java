package Collection;

import java.util.Enumeration;
import java.util.Vector;

public class VectorListStudy {

	public static void main(String[] args) {

		Vector v= new Vector();
		v.add("Rutuja");
		v.add("Bagal");
		v.add(1234);
        v.add(98.7);
        
        System.out.println(v.capacity());

        
        System.out.println("=======================");
       Enumeration e = v.elements();
       
       while(e.hasMoreElements())
       {
    	   System.out.println(e.nextElement());
       }
        
        }

}
