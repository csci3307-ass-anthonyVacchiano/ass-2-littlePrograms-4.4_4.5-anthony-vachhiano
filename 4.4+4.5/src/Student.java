
public class Student {
	
	private String name;
	private double average;
	
	public Student(String name, double average)
	{
		this.name =name;
		
		if (average > 0.0)
			if (average <= 100.0)
				this.average = average;
	}




public void setname(String name){
	this.name=name;
}

public String getname(){
	return name;
}

public void setaverage(double studentaverage){
if (average > 0.0)
	if (average <= 100.0)
		this.average = average;
}

public double getaverage()
{
	return average;
}
public String getlettergrade()
{
	String lettergrade = "";
	if (average >= 90.0)
		lettergrade = "A";
	else if (average >= 80.0)
		lettergrade = "B";
	else if (average >= 70.0)
		lettergrade = "C";
	else if (average >= 60.0)
		lettergrade = "D";
	else 
		lettergrade = "F";
	return lettergrade;
}
}

