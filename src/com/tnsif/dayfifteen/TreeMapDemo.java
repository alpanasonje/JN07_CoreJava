package com.tnsif.dayfifteen;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		// emailId, name
		TreeMap<String, String> personMap = new TreeMap<String, String>();
		personMap.put("sonje.alpana@gmail.com", "Alpana Sonje");
		personMap.put("Aniket@gmail.com", "Aniket");
		personMap.put("pawarnayan@gmail.com", "Nayan Pawar");
		personMap.put("prashant@gmail.com", "Prashant");

		System.out.println(personMap);
		System.out.println("-------------------------------------------------------");
		personMap.put("sonje.alpana@gmail.com", "Alpana Deepak Sonje");
		System.out.println(personMap);

		personMap.put("asonje@tnsif.org", "Alpana Deepak Sonje");
		System.out.println(personMap);
		// personMap.put(null, "Alpana Deepak Sonje");

		Set<String> emailIdSet = personMap.keySet();
		System.out.println(emailIdSet);

		Collection<String> names = personMap.values();
		System.out.println(names);
		System.out.println(personMap.get("asonje@tnsif.org"));
		System.out.println(personMap.get("asonje123@tnsif.org"));

		Set<Entry<String, String>> persons = personMap.entrySet();
		Iterator<Entry<String, String>> p = persons.iterator();
		while (p.hasNext()) {
			Map.Entry<String, String> entry = p.next();
			System.out.println(entry);
		}
	}

}
