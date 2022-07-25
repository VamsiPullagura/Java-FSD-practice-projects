package TypeCasting;

public class TypeCasting {

	public static void main(String[] args) {
		byte p=5;
		short q=p;		// this is implicit type casting 
		System.out.println("Value of p="+p);
		System.out.println("Value of q="+q);

		short r=5;
		byte s =(byte)r;		// this is explicit type casting 
        System.out.println("Value of r="+r);
        System.out.println("Value of s="+s);
			
			float x = 100.10f;
			int y = (int)x;			// this is explicit type casting 	
			System.out.println("Value of x="+x);
			System.out.println("Value of y="+y);


	}

}
