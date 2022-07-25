package strings;

public class strings {
	public static void main(String[] args) {
		System.out.println("Methods of String");
		String sl=new String("Welcome to Java");
		System.out.println(sl.length());
		String sb=new String("Lets start strings");
		System.out.println(sb.substring(5));
		String s1="Hello";
		String s2="Heldo";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.toUpperCase());
		System.out.println(s2.replace("d", "l"));
		String s3="Java";
		String s4="Java";
		System.out.println(s3.equals(s4));
		System.out.println("\n");
		System.out.println("String Buffer");
		StringBuffer strbf=new StringBuffer("Good Morning!");
		strbf.append("Have a nice day!");
		System.out.println(strbf);
		strbf.insert(0, "Hi ");
		System.out.println(strbf);
		strbf.replace(0, 2, "Hlo");
		System.out.println(strbf);
		strbf.delete(0, 4);
		System.out.println(strbf);

	}



}
