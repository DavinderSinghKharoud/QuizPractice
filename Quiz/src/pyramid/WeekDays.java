package pyramid;

import java.util.Scanner;

public class WeekDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter any number to get day");
int num=s.nextInt();
if(num==1) {
	System.out.println("monday");
}else if(num==2) {
	System.out.println("tuesday");
}else if(num==3) {
	System.out.println("wednesday");
}else if(num==4) {
	System.out.println("thursday");
}else if(num==5) {
	System.out.println("friday");
}else if(num==6) {
	System.out.println("saturday");
}else if(num==7) {
	System.out.println("sunday");
}
	}

}
