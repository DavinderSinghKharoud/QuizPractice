package first1;

public class PentagonalNumbers {
public static void s(int n) {
	int sum=12;
	int j=7;
	for(int i=1;i<=n;i++) {
		
		j+=3;
		sum+=j;
		System.out.println(sum);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(1+" "+5+" "+12);
		
		s(20);
		//from internet
		int count = 1;
		for(int i = 1; i <= 50; i++){
			System.out.printf("%-6d",getPentagonalNumber(i));
			if(count % 10 == 0) System.out.println();
			count++;
		}
	}
	public static int getPentagonalNumber(int i) {
		return (i * (3 * i - 1))/2;
	}
}
