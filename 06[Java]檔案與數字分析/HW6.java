import java.io.*;
import java.math.BigDecimal;
import java.util.*;


public class HW6 {
	
	
	public static void main(String[] args) throws IOException {
		
		try {
			
			String readPath = "D:\\00951460\\Desktop\\新人培訓\\01[第一週]java html練習題與模組\\1. Java練習題\\作業六 - 檔案與數字分析\\cars.csv";
			String writePath = "D:\\00951460\\Desktop\\新人培訓\\01[第一週]java html練習題與模組\\1. Java練習題\\作業六 - 檔案與數字分析\\cars2.csv";
			
			BufferedReader bfr = new BufferedReader(new FileReader(readPath));
			BufferedWriter bfw = new BufferedWriter(new FileWriter(writePath));
			
			List<Map<String, String>> list = new ArrayList<Map<String, String>>();		
			String content;
			String[] str = null;
			String[] cars = bfr.readLine().split(",");			

			while ((content = bfr.readLine()) != null) {
					str = content.split(",");
					Map<String, String> map = new HashMap<String, String>();
					map.put("Manufacturer", str[0]);
					map.put("Type", str[1]);
					map.put("Min.Price", str[2]);
					map.put("Price", str[3]);
					list.add(map);	
			}
			
//a針對manufacture欄位進行排序
			Collections.sort(list, new Comparator<Map<String, String>>() {
				public int compare(Map<String, String> p1, Map<String, String> p2) {
					
					return (p2.get("Price")).compareTo(p1.get("Price"));
				} 
			});
			
			
			
			bfw.write("Manufacturer,Type,Min.Price,Price\n");
			for (Map<String, String> map1 : list) {
				bfw.write(map1.get("Manufacturer") + ",");
				bfw.write(map1.get("Type") + ",");
				bfw.write(map1.get("Min.Price") + ",");
				bfw.write(map1.get("Price") + "\n");
			}
			bfw.flush();	
			
//b針對manufacture欄位進行排序
			Collections.sort(list,	new Comparator<Map<String, String>>() {
					public int compare(Map<String, String> m1, Map<String, String> m2) {
						return (m1.get("Manufacturer")).compareTo(m2.get("Manufacturer"));
					} 
				});
            
			for(int i = 0; i<cars.length; i++){
				System.out.printf("%-20s", cars[i]);
			}
			System.out.println();
//			System.out.println("Manufacturer        Type                Min.Price           Price");
			
			
			BigDecimal sumPrice = new BigDecimal(list.get(0).get(cars[3]));
            BigDecimal sumMinPrice = new BigDecimal(list.get(0).get(cars[2]));
			BigDecimal totalPrice = new BigDecimal(0);
            BigDecimal totalMinPrice = new BigDecimal(0);
		    
            
            
			for (int i = 0; i < list.size(); i++) {
	            totalMinPrice = totalMinPrice.add(new BigDecimal(list.get(i).get(cars[2])));
	            totalPrice = totalPrice.add(new BigDecimal(list.get(i).get(cars[3])));
                for (int j = 0; j < cars.length; j++) {
                    System.out.printf("%-20s", list.get(i).get(cars[j]));           
                 }
                
                System.out.println();
	            if(i != list.size()-1 && list.get(i).get(cars[0]).equals(list.get(i + 1).get(cars[0]))){
	                 sumPrice = sumPrice.add(new BigDecimal(list.get(i + 1).get(cars[3])));
	                 sumMinPrice = sumMinPrice.add(new BigDecimal(list.get(i + 1).get(cars[2])));
	                 continue;             
	             }
	             else if(i != list.size()-1 && !(list.get(i).get(cars[0]).equals(list.get(i + 1).get(cars[0])))){
	                 System.out.printf("%-99s","小計  " );
	                 System.out.printf("%-20s", sumMinPrice);
	                 System.out.printf("%-20s", sumPrice);  
	                 sumPrice = new BigDecimal(list.get(i+1).get(cars[3]));
	                 sumMinPrice = new BigDecimal(list.get(i+1).get(cars[2]));
	             }
	             else if(i == list.size()-1){

	            	 System.out.printf("%-99s",  "小計 " );
	                 System.out.printf("%-20s", sumMinPrice );
	                 System.out.printf("%-20s", sumPrice );
	                 System.out.println();
	                 System.out.printf("%-99s",  "合計 " );
	                 System.out.printf("%-20s", totalMinPrice );
	                 System.out.printf("%-20s", totalPrice );
	             
	             }
	             System.out.println();
	             
            }

		
			bfr.close();
			bfw.close();


		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}    
}
