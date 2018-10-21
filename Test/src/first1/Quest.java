package first1;

public class Quest {
	public static int indexOfFirstOccurrence(String[] stringArray, String target)
	{
	for (int i = 0; i < stringArray.length; i++) {
	if (stringArray[i].equals(target)) {
	return i;
	}
	}
	return -1;
	}


	
	public static void printInReverse(String[] stringArray) {
		for (int i = stringArray.length-1 ; i >= 0; i--) {
		System.out.println(stringArray[i]);
		}
	}

	public static void main(String[] args) {
		String a[]= {"java","coding"};
		int k=indexOfFirstOccurrence(a,"java");
		System.out.println(k);
		printInReverse(a);
		

}}
