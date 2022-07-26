package Q6;

public class MyException {
	static void check(int age) throws Exception
	{
		if(age<18)
			System.out.println("Not Valid Age For  Voting");
		else
			System.out.println("Valid Age for Voting");
	}

	static void test() throws Exception
	{
		check(20);
	}
	
	public static void main(String[] args) {
		
		 try {
			test();
		} catch (Exception e) {
			//\\TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 //handled using try and catch
		
	}

}
