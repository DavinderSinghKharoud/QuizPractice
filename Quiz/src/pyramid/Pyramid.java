package pyramid;

public class Pyramid {

	public static void display(String a) {
		
		int j=a.length();
		for(int k=0;k<a.length();k++) {
		
			for(int i=j;i>0;i--) {
			System.out.print(" ");
			
		}
			for(int l=0;l<=k;l++) {
				System.out.print(a.charAt(l)+" ");
			}
			System.out.println(" ");
		j--;
		
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
display("Guru");
	}

}
