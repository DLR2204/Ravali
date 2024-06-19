package java8;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZonalTime {
	
	public static void main(String[] args) {
		
//		Set<String> set = ZoneId.getAvailableZoneIds();
//		
//		for(String name :set) {
//			System.out.println(name);
//		}
		
		ZoneId zone = ZoneId.of("US/Eastern");
		
		ZonedDateTime time = ZonedDateTime.now(zone);
		
		System.out.println(time);
		
	}

}
