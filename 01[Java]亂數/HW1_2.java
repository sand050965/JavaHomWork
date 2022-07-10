
import java.math.BigDecimal;
import java.text.DecimalFormat;

public class HW1_2 {
	

	public static void main(String[] args){
		
			
		BigDecimal avg;
//		BigDecimal sum;		
		BigDecimal total = new BigDecimal(0);
		BigDecimal div = new BigDecimal(15);
		BigDecimal arr[] = new BigDecimal [15];
		for(int i = 0; i<15; i++){
			BigDecimal var = new BigDecimal(Math.random()*10 + 1).setScale(3, BigDecimal.ROUND_HALF_UP);
			arr[i]=var;
			for (int j=0; j<i; j++){
				if(arr[i]==arr[j]){
					i--;
					break;
				}
			}
		}	
		
		System.out.print("°}¦C: ");	
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
	
		for(int i=0; i<arr.length; i++){
			total = total.add(arr[i]);
		}
//		sum = total.setScale(1, BigDecimal.ROUND_HALF_UP);
		DecimalFormat df = new DecimalFormat("#.0"); 
		
		avg = total.divide(div, 3, BigDecimal.ROUND_HALF_UP);
		
		System.out.println("Á`©M: " + df.format(total));

	
		System.out.println("¥­§¡: "+avg);
	}
}