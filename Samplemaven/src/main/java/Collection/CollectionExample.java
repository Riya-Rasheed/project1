package Collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class CollectionExample 
{
	public static void main(String args[])
	{
		List<String> list1 = new ArrayList();
		list1.add("Riya");
		list1.add("25");
		System.out.println(list1);
		System.out.println(list1.size());
		System.out.println(list1.isEmpty());
		
		System.out.println("Non generic collection");
		ArrayList l1 = new ArrayList();
		l1.add("Hanz");
		l1.add("28");
		l1.add("Dharul");
		
		
		
		System.out.println("Iterator");
		Iterator<String>it = l1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		it.remove();
		
		System.out.println("Contains Method");
		
		System.out.println(l1.contains("28"));
		
		System.out.println("Generic collection");
		ArrayList <String> l2= new ArrayList <String>();
		l2.add("Hanz");
		l2.add("28");
		l2.add("Dharul");
		l2.add(null);
		l2.add(null);
		l2.remove("Hanz");
		l2.remove(2);
		l2.add(2,"Rasheed");
		System.out.println(l2);
		
		for(int i=0;i<l2.size();i++)
		{
			System.out.println(l2.get(i));
		}
	
		System.out.println("foreach loop");
		
			for(String i:l2)
			{
				System.out.println(i);
			}
	}

}
