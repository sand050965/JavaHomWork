
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;

public class HW2_2 {
	public static void main(String[] args){
		
		BigDecimal total = new BigDecimal(0);
		BigDecimal div = new BigDecimal(15);
		ArrayList<BigDecimal> collection = new ArrayList<BigDecimal>();
		BigDecimal avg;

		for(int i=0;i<15;i++){
			BigDecimal num = new BigDecimal(Math.random()*10+1).setScale(3, BigDecimal.ROUND_HALF_UP);
			collection.add(num);
			for (int j=0;j<i;j++){
				if(collection.get(i)==collection.get(j)){
					collection.remove(i);
					i--;
					break;		
				}
			}
			Collections.sort(collection);
		}	
	System.out.print("±Æ§Ç«á:");
	
	for(int i=0; i < collection.size(); i++){
		System.out.print(collection.get(i)+" ");	
	}
		
	
	for(int i=0; i<collection.size(); i++){
		total = total.add(collection.get(i));
	}
	avg = total.divide(div, 3, BigDecimal.ROUND_HALF_UP);
	System.out.print("\n¥­§¡:"+avg);
		
	}
}
