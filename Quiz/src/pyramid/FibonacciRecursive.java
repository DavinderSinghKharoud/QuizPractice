package pyramid;

public class FibonacciRecursive {
	static int n1=0,n2=1,n3;
public static void fibo(int a) {
	
	if(a>0) {
		n3=n1+n2;
		n1=n2;
		n2=n3;
		System.out.print(n3+" ");
		fibo(a-1);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.print(n1+" "+n2+" ");
int b=10;
fibo(b-2);
	}

}
