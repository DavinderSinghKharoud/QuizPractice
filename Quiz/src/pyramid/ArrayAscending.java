package pyramid;

public class ArrayAscending {
static void ascending(int a[]) {
	
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]>a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	for(int k=0;k<a.length;k++) {
		System.out.println(a[k]);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b[]= {3,9,5,6,1,2,8,9};
ascending(b);
	}

}
