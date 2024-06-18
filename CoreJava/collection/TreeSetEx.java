package collection;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;
/*Collections Prop's:-
-------------------
(1)it's growable in nature

(2)accepts both heterogenous/homogeneous data

(3)lots of utility methods

Set:-
-----
(1)Not Allow duplicates

(2)Insertion order is storing - alphabetical order*/
public class TreeSetEx {

	public static void main(String[] args) {

		TreeSet ts = new TreeSet();

		ts.add("z");	//	(97)a-b(98) = -(-1)

		ts.add("o");

		ts.add("b");

		ts.add("c");

		ts.add("a");

		System.out.println(ts);
		
		
		Iterator itr = ts.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
	}
}

class MyOrder implements Comparator{

	public int compare(Object o1, Object o2) {
		
		return -((String) o1).compareTo((String) o2);
	}									//z.compareTo(o)
	
}
