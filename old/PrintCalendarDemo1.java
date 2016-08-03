import java.util.Scanner;

public class PrintCalendarDemo1{
	
	public static void main(String[] args){
		int year;
		int month;
		int days = 0;
		boolean isRn; //平年false闰年true
		Scanner input = new Scanner(System.in);
		
		System.out.println("********************使用万年历************************");
		System.out.println("请输入年：");
		year = input.nextInt();
		System.out.println("请输入月");
		month = input.nextInt();
		
		isRn = (year%400==0) || (year%4==0 && year%100!=0);
		if(isRn){
			System.out.println(year + "年是闰年");
		}else{
			System.out.println(year + "年是平年");
		}
		
		switch(month){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				days = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				days = 30;
				break;
			case 2:
				days = isRn ? 29 : 28;
				break;
		}
		if(days>0){
			System.out.println(month + "月份是" + days + "天");
		}else{
			System.out.println("输入月份有误！");
		}
	}
}