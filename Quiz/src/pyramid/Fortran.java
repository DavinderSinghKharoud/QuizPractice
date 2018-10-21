package pyramid;

public class Fortran {
static int bump(int i) {
	return i+2;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(bump(34));

		for(int x=0;x<5;x=bump(x)) {
	System.out.println(x+" ");
	}

}
	}
