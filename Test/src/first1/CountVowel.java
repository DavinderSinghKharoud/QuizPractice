package first1;

public class CountVowel {
	public static void ab(String abc) {
		int count=0;
		for(int i=0;i<abc.length();i++) 
		{
		if(abc.charAt(i)=='a' || abc.charAt(i)=='e' || abc.charAt(i)=='i'|| abc.charAt(i)=='o'|| abc.charAt(i)=='u')
		{
			count++;
		}
	}
		System.out.println(count);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ab("asd");
	}

}
