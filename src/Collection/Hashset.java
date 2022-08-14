package Collection;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
           HashSet hs=new HashSet();
           hs.add("Rutuja");
   		   hs.add("Bagal");
   		   hs.add(1234);
           hs.add(98.7);
           System.out.println(hs);
           System.out.println(hs.clone());
           System.out.println(hs.size());
           System.out.println(hs.remove(98.7));
           System.out.println(hs);


           
	
	}

}
