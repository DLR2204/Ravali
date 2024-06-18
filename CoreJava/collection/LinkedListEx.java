package collection;

import java.util.LinkedList;
/*Collections Prop's:-
-------------------
(1)it's growable in nature

(2)accepts both heterogenous/homogeneous data

(3)lots of utility methods

List:-
-----
(1)Allow duplicates

(2)Insertion order is preserved*/
public class LinkedListEx {
	
	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		
		ll.add(123);

		ll.add(true);

		ll.add("Ravalika");

		ll.add('c');

		ll.add(3.14f);

		System.out.println(ll);

		ll.add(123);

		ll.add(true);

		ll.add("Ravalika");

		ll.add('c');

		ll.add(3.14f);
		
		System.out.println(ll);
		
		
		
	}

}
