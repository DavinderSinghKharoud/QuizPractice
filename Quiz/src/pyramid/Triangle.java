package pyramid;

public class Triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=4;
int temp=num;
for(int i=1;i<=num;i++) {
	for(int k=temp;k>0;k--) {
  		System.out.print(" ");  		
  	}
	for(int j=1;j<=i;j++) {
		  	
		  	System.out.print(i+" ");
		  	
	}
	System.out.println();
	temp--;
}
	}

}
