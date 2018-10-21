package pyramid;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("enter any string");
String user=s.next();
if(user.length()>1) {
	System.out.println("enter single aphabet letter");
}else if(user.charAt(0)=='a' || user.charAt(0)=='e' || user.charAt(0)=='i' || user.charAt(0)=='o' 
		|| user.charAt(0)=='u'){
	System.out.println("it is a vowel");
}else {
	System.out.println("it is not a vowel");
}
	}

}
