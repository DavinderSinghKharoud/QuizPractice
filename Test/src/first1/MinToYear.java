package first1;
import java.util.Scanner;
public class MinToYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int min=3456789;
int days=min/1440;
int years=(int)min/525600;
int i;
if(years*525600<min) {
int remain=min-years*525600;
 i=remain/1440;
 System.out.println("no of years"+" "+years+" "+"and no of days "+i);
}
else 
{
	System.out.println(years+" "+"S");
	
}
//From Internet
double minutesInYear = 60 * 24 * 365;

Scanner input = new Scanner(System.in);

System.out.print("Input the number of minutes: ");

double minn = input.nextDouble();

long yearss = (long) (minn / minutesInYear);
int dayss = (int) (minn / 60 / 24) % 365;

System.out.println((int) minn + " minutes is approximately " + yearss + " years and " + dayss + " days");
	}

}
