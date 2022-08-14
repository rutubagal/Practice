package Collection;

import java.util.ArrayList;

public class IntArrayList {

	public static void main(String[] args) {

		ArrayList<Integer> al=new ArrayList();
		 
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		System.out.println(al);
		System.out.println(al.contains(30));
		System.out.println(al.isEmpty());
		
		System.out.println("===========For Loop==========");
		
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.println(al.get(i));
		}
		
		System.out.println("===========for each ==========");
		
		for(Integer M:al)
		{
			System.out.println(M);
		}



		
	}

}
