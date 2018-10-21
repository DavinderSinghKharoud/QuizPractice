package first1;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,n=12323,r=2;
boolean stat=true;
for(i=2;i<n/2;i++) {
	if(n%i==0) {
		stat=false;
		break;
	}
}
if(stat)
{
	System.out.println("prime");}
else{
	System.out.println("not prime");
}
	}

}
