package NewPackageVid;
import java.util.Scanner;

public class FistJava {
	
	
	public static void main (String args[])
	{
	StudentDetails Sd= new StudentDetails();
	 StudentDetails Sd1= new StudentDetails();
	 Sd1.insertrecord(1, "vid");
	 Sd.insertrecord(2, "xyz");
	 Sd.displayrecord();
	 Sd1.displayrecord();
	}
	
}

class StudentDetails
{
	int rollnum;
	String name;
	
	void insertrecord(int r, String n)
	{
		rollnum=r;
		name=n;
	}
	
	void displayrecord()
	{
		System.out.println("student rollnumber is \t" +rollnum+ "\t and name is" +name);
	}
	
	
}
	

