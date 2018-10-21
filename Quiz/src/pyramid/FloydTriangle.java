package pyramid;

public class FloydTriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=4;
		int temp=num;
		String zero="0";
		String one="1";
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				if(i%2==0) {
				if(j%2==0) {
					System.out.print(one+" ");
				}else {
					System.out.print(zero+" ");
				}
			}//else statement for first for(i)statement
				else {
				if(j%2==0) {
					System.out.print(zero+" ");
				}else {
					System.out.print(one+" ");
				}
			}
				
			
			} System.out.println();
		}
	}

}
