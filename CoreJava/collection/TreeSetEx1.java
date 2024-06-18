package collection;

import java.util.TreeSet;

public class TreeSetEx1 {

	public static void main(String[] args) {
		
		TreeSet<String> ts = new TreeSet<String>();

		ts.add("zoo");

		ts.add("orange");

		ts.add("berry");

		ts.add("carrot");

		ts.add("apple");

		System.out.println(ts);
		
		for(String obj :ts) {
			System.out.println(obj);
		}
	}
}
