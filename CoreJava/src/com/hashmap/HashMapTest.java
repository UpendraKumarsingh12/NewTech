package com.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<Integer,String>map= new HashMap<>();
		map.put(1,"bhagwatipur");
		map.put(2,"Jonhi");
		map.put(3,"tola");
		map.put(4,"najirganj");
		map.put(5,"visambhar");
		map.put(6,"bhagwatipur");
		/*for(Map.Entry e:map.entrySet()) {
			System.out.println(e);
		}
*/
		Set<Entry<Integer, String>>set=map.entrySet();
		for(Entry<Integer,String>entry:set) {
			System.out.println(entry.getKey()+""+entry.getValue());
		}
		
	}

}
