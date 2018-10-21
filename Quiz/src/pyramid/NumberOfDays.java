package pyramid;

public class NumberOfDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int month=1;
String monthName;
int year=2016;
switch(month) {
case 1: monthName="January";
int days=31;
System.out.println(days);
break;
case 2: monthName="February";

if(year%2==0 || (year%4==0 && year%100!=0) ) {
	days=29;
}
else {
	days=28;
}
System.out.println(days); break;

}	}

}
