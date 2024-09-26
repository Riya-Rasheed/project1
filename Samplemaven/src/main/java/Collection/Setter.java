package Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
public class Setter 
{
	public static void main(String[] args) 
	{
		Set <Integer> s1 = new HashSet <Integer>();
		s1.add(1);
		s1.add(2);
		s1.add(3);
		System.out.println(s1);
		
		HashSet <Integer> s2 = new HashSet <Integer>();
		s2.add(5);
		s2.add(7);
		System.out.println(s2);
		
		Iterator <Integer> it = s2.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		s2.remove(7);
		System.out.println(s2);
		s2.add(90);
		s2.add(80);
		s1.addAll(s2);
		System.out.println(s1);
		s1.removeAll(s2);
		System.out.println(s2);
		System.out.println(s2.contains(80));
		System.out.println(s1.size());
	}

}
