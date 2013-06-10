import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {

	public static int add(String input) {
		// TODO Auto-generated method stub
		int kq=0;
		if(input==null||input.isEmpty())
			return kq;
		
		int value1, value2;
		Matcher matcher=Pattern.compile("-?[0-9]+").matcher(input);
		matcher.find(); 
		value1=Integer.parseInt(matcher.group(0));
		if(matcher.find())
			value2=Integer.parseInt(matcher.group(0));
		else 
			value2 =0;
		kq=value1+value2;
		return kq;
	}

	private static int toInt(String input) {
		return Integer.parseInt(input);
	}
	
}
