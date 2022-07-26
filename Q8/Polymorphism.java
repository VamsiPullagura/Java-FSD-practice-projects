package Question8;

public class Polymorphism {
	public int sum(int x , int y) {
		return x+y;
	}
	
	public int sum(int x,int y,int z) {
		
		return x+y+z;
	}
	
	public static void main(String[] args) {
		
		Polymorphism  m=  new Polymorphism();
		System.out.println("Sum: "+m.sum(5, 6));
		System.out.println("Sum: "+m.sum(5, 7, 8));
		
	}

}
