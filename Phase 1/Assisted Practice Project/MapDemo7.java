package com.AssistedProjects;
import java.util.TreeMap;
import java.util.Hashtable;
import java.util.HashMap;
import java.util.Map;
public class MapDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<String,Integer> hashmap= new HashMap<>();
         hashmap.put("ashwin", 1000);
         hashmap.put("pravin", 2000);
         hashmap.put("vijay", 3000);
         System.out.println(hashmap);
         System.out.println("The elements of Hashmap are ");  
	      for(Map.Entry m:hashmap.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }

     
	      TreeMap<String,Integer> treemap= new TreeMap<>();
         treemap.put("bhavik", 2000);
         treemap.put("sushant", 3000);
         treemap.put("vishal", 4000);
         System.out.println(treemap);
         
         Hashtable<String,Integer> hashtable= new Hashtable<>();
         hashtable.put("vishal2", 9000);
         hashtable.put("spider", 97000);
         hashtable.put("pankaj", 87656);
         System.out.println(hashtable);
	}

}
