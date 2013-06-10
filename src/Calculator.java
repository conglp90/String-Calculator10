import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {

	public static int add(String input) {
		// TODO Auto-generated method stub
		int kq=0;
		if(input==null||input.isEmpty())
			return kq;
		kq=toInt(input);
		return kq;
	}

	private static int toInt(String input) {
		return Integer.parseInt(input);
	}
	
}
