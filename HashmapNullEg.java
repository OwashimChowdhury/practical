package collection;

import java.util.HashMap;
import java.util.Map;

public class HashmapNullEg {

	public static void main(String[] args) {
		//creating hashmap
		HashMap<Integer,String> map=new HashMap<Integer,String>();
		//putting values
		map.put(101, "mango");
		map.put(108, "orange");
		map.put(105, "banana");
		map.put(103, "grapse");
		map.put(105, "banana");

		map.put(null, null);//null key,value
		map.put(102, null);
		map.put(null, "apple");
		map.putIfAbsent(102, "custardApple");//if null then insert
		map.putIfAbsent(101, "watermelon");//if null then insert

		for (Map.Entry en:map.entrySet()) {//for each loop to get key value
			System.out.println(en.getKey()+" "+en.getValue());
		}
		
		map.remove(103);//remove 103
		System.out.println(map);
	}

}
