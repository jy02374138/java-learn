import java.util.Date;
import java.util.Locale;
import java.text.SimpleDateFormat;
import java.text.DateFormatSymbols;
import java.lang.StringBuffer;



public class DateDemo{
	
	public static void main(String[] args){
		Date d = new Date();
		System.out.println(d.toString());
		SimpleDateFormat f = new SimpleDateFormat("yyyyƒÍMM‘¬dd»’-EE");
		Object str = f.format(d);
		System.out.println(str);
		
		Locale l = new Locale("FK");
		DateFormatSymbols fs = DateFormatSymbols.getInstance();
		String[] a = fs.getMonths();
		for (int i=0; i<a.length; i++) {
		 System.out.println(a[i]);	
		}		
	}
	
}