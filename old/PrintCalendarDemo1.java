import java.util.Scanner;

public class PrintCalendarDemo1{
	
	public static void main(String[] args){
		int year;
		int month;
		int days = 0;
		boolean isRn; //ƽ��false����true
		Scanner input = new Scanner(System.in);
		
		System.out.println("********************ʹ��������************************");
		System.out.println("�������꣺");
		year = input.nextInt();
		System.out.println("��������");
		month = input.nextInt();
		
		isRn = (year%400==0) || (year%4==0 && year%100!=0);
		if(isRn){
			System.out.println(year + "��������");
		}else{
			System.out.println(year + "����ƽ��");
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
			System.out.println(month + "�·���" + days + "��");
		}else{
			System.out.println("�����·�����");
		}
	}
}