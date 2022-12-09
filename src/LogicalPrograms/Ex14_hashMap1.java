package LogicalPrograms;

import java.util.HashMap;
import java.util.Set;

//1: put   -> to add key, value info hashmap
//2: containsKey --> to verify particular key present or not
//3: get     --> to get value of particular key
//4: keySet -> to get keys from map object


public class Ex14_hashMap1 
{
	public static void main(String[] args) 
	{
		HashMap<Integer,String> mp=new HashMap<Integer,String>();
		mp.put(101, "ramesh");
		mp.put(102, "ganesh");
		mp.put(103, "mahesh");
		
		System.out.println(mp.containsKey(101));		//true
		
		System.out.println(mp.get(102));	 	//ganesh
		
		System.out.println("----get all keys----");
		Set<Integer> allKeys=mp.keySet();
		for(Integer key:allKeys)
		{
			System.out.println(key);
		}
		
		System.out.println("------get all keys & values---------");
		for(Integer key:allKeys)
		{
			System.out.println(key+": "+mp.get(key));
		}
		
		
	}

}
