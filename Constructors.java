package Constructor;
class EmpInfo{
	int id;
	String name;

void display() {
	System.out.println(id+" "+name);
	}
}
class Std{
	int id;
	String name;

	Std(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}

public class Constructors {
	public static void main(String[] args) {
		EmpInfo emp1=new EmpInfo();
		emp1.display();
		Std std1=new Std(3,"Vamshi");
		std1.display();
		
	}

}

