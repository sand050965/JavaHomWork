
public class HW1_1 {
	public static void main(String[] args){

		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		int total = 0;
		while(total <= 20){
			int i = (int) (Math.random() *6 +1);
			
				if(i==1){
					a++;
				}
				else if(i==2){
					b++;
				}
				else if(i==3){
					c++;	
				}
				else if(i==4){
					d++;
				}	
				else if(i==5){
					e++;
				}
				else if(i==6){
					f++;	
				}
			total++;
		}
		System.out.println("1:"+a+"��");
		System.out.println("2:"+b+"��");
		System.out.println("3:"+c+"��");
		System.out.println("4:"+d+"��");
		System.out.println("5:"+e+"��");
		System.out.println("6:"+f+"��");

	
	}
}
