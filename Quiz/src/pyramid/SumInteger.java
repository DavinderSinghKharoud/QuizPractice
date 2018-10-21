package pyramid;

public class SumInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=565;
int sum=0;
while(num>0) {
	int mod=num%10;
	sum+=mod;
	num/=10;
}
System.out.println(sum);
	}

}
