package methods;

public class Methods {

	public int addval(int x,int y) {
		int res=x+y;
		return res;
	}

	public int mulval(int a,int b) {
		b=a*b;
		return b;
	}

	int add(int x,int y) {
		return x+y;
	}
	int add(int x,int y,int z) {
		return x+y+z;
	}
	float add(float x,float y) {
		return x+y;
	}
	

public static void main(String[] args) {
	Methods Meth=new Methods();
	int res1=Meth.addval(4, 8);
	System.out.println("Method Execution Result:"+res1);
	Methods b=new Methods();
	int res2=b.mulval(4,5);
	System.out.println("Call by Value:"+res2);
	Methods c=new Methods();
	int result =c.add(6, 9);
	int res4=c.add(8, 2,5);
	float res5=c.add(10.11f, 13.13f);
	System.out.println("Overloading1:"+result);
	System.out.println("Overloading2:"+res4);
	System.out.println("Overloading3:"+res5);
	
	

}

}
