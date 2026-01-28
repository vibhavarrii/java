package com.in28minutes.api.j;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
//sequence list , set,map

public class SequenceCollectionRunner {
	public static void main(String[] args) {
		var courseDetails = new ArrayList<>();
		courseDetails.add("spring security");
		courseDetails.addFirst("spring boot");
		courseDetails.addLast("spring boot in ai");
		courseDetails.add(" cloud computing with ai");
		courseDetails.add("cloud computing with azure");
		System.out.println("list : "+ courseDetails);
		System.out.println("first element"+courseDetails.getFirst());
		System.out.println("first element"+courseDetails.getLast());
		System.out.println("first element"+courseDetails.removeFirst());
		System.out.println("first element"+courseDetails.removeLast());
		var reversedCourseDetails = courseDetails.reversed();
		System.out.println("reversed List "+reversedCourseDetails);
		
		var courses = List.of("java","aws","spring","azure");
		var courseDetailSet = new LinkedHashSet<>(courses);
		System.out.println("first element "+courseDetailSet.getFirst());
		System.out.println("first element "+courseDetailSet.getLast());
		courseDetailSet.addFirst("python");
		courseDetailSet.addLast("sql");
		System.out.println(courseDetailSet);
		System.out.println("reversed:"+courseDetailSet.reversed());
		
		var courses1 = new LinkedHashMap<Integer, String>();
		courses1.put(1, "Spring");
        courses1.put(2, "Spring Boot");
        courses1.put(3, "Spring AI");

        System.out.println("Map: " + courses1);

        System.out.println("Adding Elements");
        courses1.putFirst(10, "Spring Security");
        courses1.putLast(20, "Spring Cloud");

        System.out.println("Map: " + courses1);

        System.out.println("sequencedKeySet: " + courses1.sequencedKeySet());
        System.out.println("sequencedValues: " + courses1.sequencedValues());
        System.out.println("sequencedEntrySet: " + courses1.sequencedEntrySet());
        System.out.println("First Entry: " + courses1.firstEntry());
        System.out.println("Last Entry: " + courses1.lastEntry());
        System.out.println("First Poll Entry:: " + courses1.pollFirstEntry());
        System.out.println("Map:: " + courses1);

        System.out.println("Last Poll Entry:: " + courses1.pollLastEntry());
        System.out.println("Map:: " + courses1);

        System.out.println("Reversed:: " + courses1.reversed());
		
		
		
		
	}
}
