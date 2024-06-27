package com.tnsif.dayeighteen;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAPIDemo {

	public static void main(String[] args) {
		//Acquire a stream - stream of values
		Stream<Integer> numStream = Stream.of(1,5,3,7,2,8,2,5);
		//Terminal operation count() - count the values 
		System.out.println("Total Values : "+numStream.count());
		
		//IllegalStateException
		//System.out.println("Total Values : "+numStream.count());
		
		//Acquire a stream - stream of values
		numStream=Stream.of(1,5,3,7,2,8,2,5);
		//finding distinct values - intermediate operation distinct()
		Stream<Integer> distinctNums=numStream.distinct();
		//counting distinct values
		long cnt=distinctNums.count();
		System.out.println("Total Distinct Values : "+cnt);
		
		//skip
		//Acquire a stream - stream of values
		numStream=Stream.of(1,5,3,7,2,8,2,5);
		//IllegalArgumentException
		//cnt=numStream.skip(-2).count();
		
		cnt=numStream.skip(3).count();
		System.out.println("Total Values after skipping 3 : "+cnt);
		
		//Limit
		//Acquire a stream - stream of values
		numStream=Stream.of(1,5,3,7,2,8,2,5);
		numStream=numStream.limit(5);
		System.out.println("Total values using limit(5) : "+numStream.count());
		
		//Terminal operation Collect
		numStream=Stream.of(1,5,3,7,2,8,2,5);
		List<Integer> numList=numStream.collect(Collectors.toList());
		System.out.println(numList);
		
		numStream=Stream.of(1,5,3,7,2,8,2,5);
		List<Integer> distictNums=numStream.limit(3).collect(Collectors.toList());
		System.out.println(distictNums);
		
		//forEach - perform operation on each value of stream
		numStream=Stream.of(1,5,3,7,2,8,2,5);
		//method reference
		numStream.forEach(System.out::println);
		
	}

}
