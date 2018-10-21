package first1;

public class SumOfInterger {

	public static long count(long n) {
		int sum=0;
		while(n>0) {
			sum+=n%10;
			n/=10;
		}
	return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(count(3451));
	}

}
