
public class HW3_1 {
	public static void main(String[] args){
		
		int[] x = {10000,50000,100000};
		
		for(int i = 0; i < x.length; i++){
		long startTime,endTime;
		long startMemory,endMemory;
		startTime = System.currentTimeMillis();
		Runtime.getRuntime().gc();
		startMemory = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		
		
		String A = "a";
		for(int j = 0; j < x[i]; j++){
			A = A + "0";	
		}

		
		endTime = System.currentTimeMillis();
		endMemory = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
	    
		long memory = endMemory-startMemory;

	    
	    System.out.println("String��k�걵" + x[i] + "����F�G" + (endTime-startTime)/1000f + "��");
	    System.out.println("String��k�걵" + x[i] + "���O����ζq(bytes): " + memory + "\n");

	    startTime = System.currentTimeMillis();
		Runtime.getRuntime().gc();
		startMemory = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
		
		StringBuilder AA  = new StringBuilder("a");
		
		for(int j = 0; j<x[i]; j++){
			AA = AA.append("0");
		}
	

		endTime = System.currentTimeMillis();
		endMemory = Runtime.getRuntime().totalMemory()-Runtime.getRuntime().freeMemory();
	    
	    long Memeory = endMemory - startMemory;
	    
	    System.out.println("StringBuilder�걵" + x[i] + "����F�G" + (endTime-startTime)/1000f + "��");
	    System.out.println("StringBuilder��k�걵" + x[i] + "���O����ζq(bytes): " + Memeory);
	    System.out.println("==========================================================");

		}
	}
}
