package first1;

public class First {
public static void main(String[] args) {
	int n=343,r,sum=0,temp;
	temp=n;
	while(n>0) {
		r=n%10;
		sum=sum*10+r;
		n=n/10;
	
	}
	if(sum==temp) {
		System.out.println("number is palindrome"+sum);
	}else
	{System.out.println("number is not palindrome"+sum
			);	
	}

}
}
