package learn;

import java.util.*;

public class jiheLearing {

/*  Collection、List(ArrayList、LinkedList、Iterator)、Set(HashSet、TreeSet)类等
	各自特点如下（后续补充）
	foreach循环
*/
//	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
	
		int[] x = {1,2,3,4,5,6,7,8,9};
		
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for (int k=0;k<x.length;k++) {
		    int v = x[k];
			map.put(k, v);
		}
		
/*		遍历方法1
		Set keySet = map.keySet();
		Iterator it = keySet.iterator();
		while(it.hasNext()) {
			Object key = it.next();
			Object value = map.get(key);
			System.out.println(key+":"+value);
		}
		*/
//		遍历方法2
		for (int i=0;i<x.length;i++) {
		   System.out.println(i+":"+map.get(i));
		}
/*		遍历方法3	
		Set entrySet = map.entrySet();
		Iterator it = entrySet.iterator();
		while(it.hasNext()) {
			Map.Entry entry = (Map.Entry)(it.next());
			Object key = entry.getKey();
			Object value = entry.getValue();
			System.out.println(key+":"+value);
		}
		*/
	}
	
}
