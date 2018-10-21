package pyramid;

public class Quadratic {
public static void main(String[] args) {
	int a=1,b=5,c=1;
	double dinc=b*b-4*a*c;
	double value=(-b+Math.pow(dinc, 0.5))/2.0*a;
	double value1=(-b-Math.pow(dinc, 0.5))/2.0*a;
if(dinc>0) {
	System.out.println(value+" "+value1);
}else if(dinc==0) {
	System.out.println(-b/(2.0*a));
}else {
	System.out.println("no real roots");
}
	
}
}
