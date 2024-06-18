package collection;

import java.util.HashSet;

/*Collections Prop's:-
-------------------
(1)it's growable in nature

(2)accepts both heterogenous/homogeneous data

(3)lots of utility methods

Set:-
-----
(1)Not Allows duplicates

(2)Insertion order is not stored-random*/
public class HashSetEx {

	public static void main(String[] args) {

		HashSet hs = new HashSet();

		hs.add(1234);

		hs.add("string");

		hs.add('c');

		hs.add(3.14f);

		hs.add("apple");

		System.out.println(hs);

		hs.add(1234);

		hs.add("string");

		hs.add('c');

		hs.add(3.14f);

		hs.add("apple");

		System.out.println(hs);
	}

}
