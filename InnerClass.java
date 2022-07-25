package ic;

public class InnerClass {
	private String msg1="heyyy hi !";
	class Inner1{
		void hello() {
			System.out.println(msg1+" let us learn inner class now !");
		}
	}
	private String msg2="inner class";
	void display() {
		class Inner2{
			void show(){
				System.out.println(msg2);
			}
		}
	Inner2 I=new Inner2();
	I.show();
	}
	public static void main(String[] args) {
		InnerClass i1=new InnerClass();
		InnerClass.Inner1 in=i1.new Inner1();
		in.hello();
		InnerClass i2=new InnerClass();
		i2.display();
		
		

	}

}