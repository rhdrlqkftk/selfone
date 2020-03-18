import java.util.*;

public class Main{
	public static boolean isleapyear(int year) {
		return year%100!=0 && year%4==0 || year%400==0 ? true : false;
	}
	public static int getLastDay(int year, int month) {
		int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		return isleapyear(year) && month==2 ? 29 : days[month-1];
	}
	public static void main(String[] args) {

		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		
		int year = calendar.get(Calendar.YEAR);
		int month = calendar.get(Calendar.MONTH);

		int days = getLastDay(year, month); 
	
		System.out.println(days + " days");

	}
}