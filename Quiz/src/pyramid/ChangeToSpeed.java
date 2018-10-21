package pyramid;

public class ChangeToSpeed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int distance=2500;
float km=(float) (distance/1000.0);
int hour=5;
int  minutes=56;
int seconds=23;
float totalsec=(float)((hour*60)+minutes)*60+seconds;
float mpersec=distance/totalsec;
float totalhour=(float)(hour+(float)(minutes/60.0)+(float)(seconds/3600.0));
float miles=(float)distance/1609;
float milesperhour=miles/totalhour;
float kmperhour=km/totalhour;
System.out.println("meteres per second"+" "+mpersec);
System.out.println("km per hour"+" "+kmperhour);
	System.out.println("miles per hour"+" "+milesperhour);
	}

}
