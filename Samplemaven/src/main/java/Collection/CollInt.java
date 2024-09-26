package Collection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class CollInt {

	public static void main(String[] args) 
	{
		System.out.println("Integer Type");
		ArrayList <Integer> l2 = new ArrayList <Integer>();
		ArrayList <Integer> l3 = new ArrayList <Integer>();
		l2.add(3);
		l2.add(40);
		l2.add(70);
		l3.add(4);
		l3.add(5);
		l2.addAll(l3);
		System.out.println(l2);
		System.out.println("After Sorting");
		Collections.sort(l2);
		System.out.println(l2);
		System.out.println("After removing");
		l2.removeAll(l3);
		System.out.println(l2);
		System.out.println("Get method");
		System.out.println(l2.get(1));
		System.out.println("Set method");
		l2.set(1, 20);
		System.out.println(l2);
		Iterator <Integer> it = l2.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		it.remove();
		System.out.println("List after removal");
		System.out.println(l2);
		 

	}

}
