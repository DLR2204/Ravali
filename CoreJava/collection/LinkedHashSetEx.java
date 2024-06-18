package collection;

import java.util.LinkedHashSet;

/*Collections Prop's:-
-------------------
(1)it's growable in nature

(2)accepts both heterogenous/homogeneous data

(3)lots of utility methods

Set:-
-----
(1)Not Allow duplicates

(2)Insertion order is preserved*/
public class LinkedHashSetEx {

	public static void main(String[] args) {

		LinkedHashSet lhs = new LinkedHashSet();

		lhs.add("string");

		lhs.add(12345);

		lhs.add('c');

		lhs.add(3.14f);

		lhs.add("apple");

		lhs.add("string");

		lhs.add(12345);

		lhs.add('c');

		lhs.add(3.14f);

		lhs.add("apple");
		System.out.println(lhs);
	}

}
