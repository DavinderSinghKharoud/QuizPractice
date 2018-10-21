package pyramid;

public class RoundTheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
double num=1256.732;
int num1=3254;
double round=Math.round(num*1000);
round=round/1000;
double round1=Math.round(num1*1000);
round1=round1/1000;
if(round==round1) {
	System.out.println("they are same up to three decimal places");
}
else {
	System.out.println("they are not same");
}
	}

}
