package collection;

import java.util.TreeMap;

import oops.Employee;

public class TreeMapEx {

	public static void main(String[] args) {
		TreeMap tm = new TreeMap();

		tm.put(100, "apple");

		tm.put(987, "haritha");

		tm.put(200, "sita");

		tm.put(876, "gita");

		System.out.println(tm);
		
		Employee emp1 = new Employee("Ravalika",102,"india",23978429);
		
		Employee emp2 = new Employee("Sri",101,"hyd",93874234);
		
		tm.put(123, emp1);
		
		tm.put(120, emp2);
		
		
		
		System.out.println(tm.get(120));
	}

}
