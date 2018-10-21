package first1;

public class Fiibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i=0,j=1,num=8,k,l=0;
System.out.println(i+" "+j);
for(k=2;k<num;k++) {
	l=i+j;
	i=j;
     j=l;
     System.out.println(l);
}
	}

}
