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

// �M��Map�覡�@: �q�LMap.entrySet�M��key�Mvalue(���ˡA�ר�O�e�q�j��)
// 		�g�k(1):
	    Set<Entry<Integer, String>> entrys = map.entrySet();
		for(Entry<Integer, String> entry:entrys) {
			System.out.println(entry.getKey()+entry.getValue());
		}
		
// 		�g�k(2):
//	    for (Map.Entry<Integer, String> entry : map.entrySet()) {
//	        System.out.println(entry.getKey() + entry.getValue());
//	    }
		
		
// �M��Map�覡�G: �q�LMap.entrySet�ϥ�iterator�M��key�Mvalue
//		Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
//		while(it.hasNext()) {
//	        Map.Entry<Integer,String> entry = it.next();
//	        int key = entry.getKey();
//	        String value = entry.getValue();
//	        System.out.println(key + value);
//	    }
		

// �M��Map�覡�T:�q�LMap.keySet�M��key�Mvalue(���M�ϥΡA�G������)
//		�g�k(1):
//		Set<Integer> set = map.keySet(); 
//		for (Integer k:set) { 
//		    System.out.println(k + map.get(k)); 
//		}

		
//		  �g�k(2):
//		 for (Integer key : map.keySet()) {
//		     System.out.println(key + map.get(key));
//		 }


// �M��Map�覡�|: �q�LMap.values()�M���Ҧ���value�A������M��key
//		for (String v : map.values()) {
//		     System.out.println(v);
//		}
	

		
		
		
	}
}


	
