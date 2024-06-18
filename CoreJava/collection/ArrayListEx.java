package collection;

import java.util.ArrayList;

import oops.Employee;

/*Collections Prop's:-
 -------------------
(1)it's growable in nature

(2)accepts both heterogenous/homogeneous data

(3)lots of utility methods

List:-
-----
(1)Allow duplicates

(2)Insertion order is preserved*/

public class ArrayListEx {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add(123);

		al.add(true);

		al.add("Ravalika");

		al.add('c');

		al.add(3.14f);

		Employee emp1 = new Employee("Ravalika", 102, "india", 23978429);

		Employee emp2 = new Employee("Sri", 101, "hyd", 93874234);

		al.add(emp1);
		
		al.add(emp2);
		
		System.out.println(al);

		al.add(123);

		al.add(true);

		al.add("Ravalika");

		al.add('c');

		al.add(3.14f);

		al.add(4, "sri");

		System.out.println(al);
	}

}
