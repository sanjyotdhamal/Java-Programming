package com.mit.hashing;

import java.util.Hashtable;
import java.util.Set;
import java.util.Map.Entry;

public class HashtableDemo {
	public static void main(String[] args) {
		Hashtable<Integer,String> hashTableObj=new Hashtable<Integer, String>();;
		hashTableObj.put(1, "xyz");
		hashTableObj.put(2, "abc");
		hashTableObj.put(30, "myname");
		
		System.out.println(hashTableObj);
		
		//Traversing the hashtable
		Set<Entry<Integer,String>> enterSet = hashTableObj.entrySet();
		
		for(Entry<Integer,String> entry : enterSet) {
			System.out.println(entry.getValue());
		}
	}
}
