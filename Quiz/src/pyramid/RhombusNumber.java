package pyramid;

public class RhombusNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=7;
for(int i=1;i<=num;i++) {
	for(int j=num-i;j>0;j--) {
		System.out.print(" ");
	}
	for(int k=i;k>0;k--) {
		System.out.print(k);
	}
	for(int l=2;l<=i;l++) {
		System.out.print(l);
	}
	System.out.println();
}
for(int i=1;i<=num-1;i++) {
	for(int j=1;j<=i;j++) {
		System.out.print(" ");
	}
	for(int k=num-i;k>0;k--) {
		System.out.print(k);
	}
	for(int l=2;l<=num-i;l++) {
		System.out.print(l);
	}
	System.out.println();
}


	}

}
