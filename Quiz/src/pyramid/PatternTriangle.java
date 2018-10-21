package pyramid;

public class PatternTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=10,temp=1;
for(int i=1;i<=num;i++) {
	for(int j=1;j<=i;j++) {
		System.out.print(j);
	}
	System.out.println();
}

for(int i=1;i<=num;i++) {
	for(int j=1;j<=i;j++) {
		System.out.print(i);
	}
	System.out.println();
}
for(int i=1;i<=num;i++) {
	for(int j=1;j<=i;j++) {
		System.out.print(temp+" ");
		temp++;
	}
	System.out.println();
}
	}

}
