import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HW2_1 {
	public static void main(String[] args){
		int dice1,dice2,dice3;
		int [] arr = new int[100];
		int sum = 0;

		for(int i=0; i<100; i++){
			dice1 = (int)(Math.random()*6+1);
			dice2 = (int)(Math.random()*6+1);
			dice3 = (int)(Math.random()*6+1);
			sum = dice1+dice2+dice3;
			arr[i] = sum;
		}
		
		Arrays.sort(arr);	
		

		
		Map<Integer,String> map = new LinkedHashMap<Integer,String>();
		for(int i=0; i<arr.length; i++){
			if(!map.containsKey(arr[i])) {
				map.put(arr[i], "*");
			}else {
				map.put(arr[i], map.get(arr[i])+"*");
			}
		}

// 遍歷Map方式一: 通過Map.entrySet遍歷key和value(推薦，尤其是容量大時)
// 		寫法(1):
	    Set<Entry<Integer, String>> entrys = map.entrySet();
		for(Entry<Integer, String> entry:entrys) {
			System.out.println(entry.getKey()+entry.getValue());
		}
		
// 		寫法(2):
//	    for (Map.Entry<Integer, String> entry : map.entrySet()) {
//	        System.out.println(entry.getKey() + entry.getValue());
//	    }
		
		
// 遍歷Map方式二: 通過Map.entrySet使用iterator遍歷key和value
//		Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
//		while(it.hasNext()) {
//	        Map.Entry<Integer,String> entry = it.next();
//	        int key = entry.getKey();
//	        String value = entry.getValue();
//	        System.out.println(key + value);
//	    }
		

// 遍歷Map方式三:通過Map.keySet遍歷key和value(普遍使用，二次取值)
//		寫法(1):
//		Set<Integer> set = map.keySet(); 
//		for (Integer k:set) { 
//		    System.out.println(k + map.get(k)); 
//		}

		
//		  寫法(2):
//		 for (Integer key : map.keySet()) {
//		     System.out.println(key + map.get(key));
//		 }


// 遍歷Map方式四: 通過Map.values()遍歷所有的value，但不能遍歷key
//		for (String v : map.values()) {
//		     System.out.println(v);
//		}
	

		
		
		
	}
}


	
