package pyramid;

import java.util.Scanner;

public class BreakInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("input a six digit number");
int num=s.nextInt();
int n1=num/100000;
int n2=num/10000%10;
int n3=num/1000%10;
int n4 = num / 100 % 10;
int n5 = num / 10 % 10;
int n6 = num % 10;

System.out.println(n1+" "+n2+" "+n3+" "+n4+" "+n5+" "+n6);
	}

}
