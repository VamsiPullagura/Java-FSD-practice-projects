package regularexpressions;
import java.util.regex.*;
public class regularexpressions {

	public static void main(String[] args) {
		String pattern="[a-z]+";
		String check="Welcome Guys,This Is Vamshi";
		Pattern p=Pattern.compile(pattern);
		Matcher c=p.matcher(check);
		while(c.find()) {
			System.out.println(check.substring(c.start(), c.end()));
		}

	}

}
