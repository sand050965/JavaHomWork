import java.util.Calendar;
import java.util.Scanner;

public class HW3_2 {
	public static void main(String[] args){
		System.out.print("請輸入月份:");
		Scanner m = new Scanner(System.in);
		int month = m.nextInt();
		Calendar calendar = Calendar.getInstance();
		int year = 2021;
		calendar.set(year,month,0);
		int day=calendar.get(Calendar.DAY_OF_MONTH);
		calendar.set(year,month-1,0);
		int initDay=calendar.get(Calendar.DAY_OF_WEEK);
		if(initDay==7){
			initDay=0;
		}
		int w=day%7;
		int week = 0;
		if (w==0){
			week=day/7;
		}
		else if(w!=0){
			week=(day/7)+1;			
		}
		System.out.printf("%14s",year+"年"+month+"月"+"\n");
		System.out.println("======================");
		System.out.printf("%4s","日");
		System.out.printf("%4s","一");
		System.out.printf("%4s","二");
		System.out.printf("%4s","三");
		System.out.printf("%4s","四");
		System.out.printf("%4s","五");
		System.out.printf("%4s","六");
		System.out.println();
		System.out.print("----------------------");
		int x = 1;
		for(int i=0; i<=week; i++){
			if(x <= day){
				System.out.println();
			for(int j=0; j<7; j++){
				if(x<=day){
					if(x==1 && j!=initDay){
						System.out.printf("%3s"," ");
					}
					else if(x==1 && j==initDay){
						System.out.printf("%3s",x);
						x++;
					}
					else if(x!=1){
						System.out.printf("%3s",x);
						x++;
					}
				}
			}
			}			
		}	
		m.close();

	}
	
}

