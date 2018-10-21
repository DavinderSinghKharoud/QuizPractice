package pyramid;

public class PascalTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row=4,one=1;
		for(int i=0;i<=row;i++) {
			for(int j=1;j<=row-i;j++) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				  	if(i==0 || k==0) {
				  		one=1;
				  	}else {
				  		one=one*(i-k+1)/k;
				  	}
				  	System.out.print(one+" ");
				  	
				  	
			}
			System.out.println();
			
		}
	}

}
