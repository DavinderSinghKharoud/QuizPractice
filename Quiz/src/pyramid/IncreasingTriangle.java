package pyramid;

public class IncreasingTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=6;
int temp=num;
for(int i=1;i<=num;i++) {
	for(int j=num-i;j>0;j--) {
		System.out.print(" ");
	}
	for(int k=1;k<=i;k++) {
		System.out.print("@");
	}
	System.out.println();
}
	}

}
