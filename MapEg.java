package collection;
//non generic
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map map=new HashMap();
//putting key, values
map.put(1, "pallabi");
map.put(8, "Rahul");
map.put(2, "sweta");
map.put(7, "karan");
Set set=map.entrySet();//Returns a Set view of the mappings contained in this map
Iterator i=set.iterator();//iterator
while(i.hasNext()) {//while loop
	Map.Entry en=(Map.Entry)i.next();
	System.out.println(en.getKey()+" "+en.getValue());//Returns the key and value corresponding to this entry
}

	}

}
