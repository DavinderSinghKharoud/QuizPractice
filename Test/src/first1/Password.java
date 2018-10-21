package first1;

public class Password {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*1. A password must have at least eight characters.                                             
		2. A password consists of only letters and digits.                                         
		3. A password must contain at least two digits*/
		
		System.out.println(pass("abcd2axc"));
	}
	public static boolean letters(char a) {
		a=Character.toUpperCase(a);
		return (a>='A' && a<='Z');
	}
	public static boolean numeric(char a) {
		return (a>='1' && a<='9');
	}
	
	public static boolean pass(String password) {
		int count=0;
		int numcount=0;
		if(password.length()<8) {
			return false;
		}
		for(int i=0;i<password.length();i++) {
			
			char cha=password.charAt(i);
			if(letters(cha)) {
				count++;
			}else if(numeric(cha)) {
				numcount++;
			}else {
				return false;
			}
		
			
		}
		return	(count>=2 && numcount>=2);	
	}
}
