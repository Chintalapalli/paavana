package com.learn;

import java.util.*;
import java.util.stream.Stream;

public class Java8Programs {

	public static void main(String[] args) {
		Map<Integer,String> valMap = new HashMap();
		valMap.put(1, "paavana");
		valMap.put(2, "Chintalapalli");
		valMap.put(3, "Kumar");
		valMap.put(4, "pavana");
		
		//Stream stream = MapToStream(valMap);
		//Stream stream = MapKeyToStream(valMap);
		Stream stream = MapValueToStream(valMap);
		System.out.println("Stream: " + Arrays.toString(stream.toArray()));

	}
	//Complete Map converted into Stream
	private static Stream MapToStream(Map valMap) {
		return valMap.entrySet().stream();
	}
	
	// Map key only converted into Stream
	private static Stream MapKeyToStream(Map valMap) {
		return valMap.keySet().stream();
	}
	
	// Map Value only converted into Stream
	private static Stream MapValueToStream(Map valMap) {
		return valMap.values().stream();
	}
	
}