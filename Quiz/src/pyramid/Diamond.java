package pyramid;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=8;
		int temp=num;
		int inc=1;
		int dec=num;
		for(int i=1;i<=num;i++) {
			for(int k=temp;k>0;k--) {
		  		System.out.print(" ");  		
		  	}
			for(int j=1;j<=i;j++) {
				  	
				  	System.out.print("*"+" ");
				  	
			}
			System.out.println();
			temp--;
		}
		for(int i=1;i<=num;i++) {
			for(int k=1;k<=i+1;k++) {
		  		System.out.print(" ");  		
		  	}
			for(int j=dec-1;j>=1;j--) {
				  	
				  	System.out.print("*"+" ");
				  	
			}
			System.out.println();
			dec--;
		}		
		
		
	}

}
