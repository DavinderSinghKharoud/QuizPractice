package pyramid;

public class MinutesYearsDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int min=3456789;
int years=min/525600;
float days=(min/60/24)%365;
System.out.println("years"+years+"days"+days);
	}

}
