package first1;

public class LeapYear {
public static boolean leap(int x) {
	boolean a=x%4==0;
	boolean b=(x%100==0 && x%400==0);
    boolean c=(x%100)!=0;	
	return a&&(b||c);
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(leap(2018));
	}

}
