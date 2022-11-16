package parameterised;

public class Array {
	public static void main(String[] args) {
		
	
String ar[]=new String [5];
	
	ar[0]="NASHIK";
	ar[1]="DHULE";
	ar[2]="PUNE";
	ar[3]="THANE";
	ar[4]="SAKRI";
	
	//print data which is not present
	try {
		System.out.println(ar[5]);
	}
catch(ArrayIndexOutOfBoundsException a) {
	System.out.println("idiat their is no data still u are trying to fetch itmeans u are waste fello");
}

}
}