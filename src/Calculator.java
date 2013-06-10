import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {

	public static int add(String input) {
		// TODO Auto-generated method stub
		int kq=0;
		if(input==null||input.isEmpty())
			return kq;
		else {
			if(input.contains(","))
			{
				Matcher matcher=Pattern.compile("-?[0-9]+").matcher(input);
				matcher.find();
				int valueOne=toInt(matcher.group(0));
				matcher.find();
				int valueTwo=toInt(matcher.group(0));
				kq=valueOne+valueTwo;
			}
			else
				kq=toInt(input);
		}
			
		return kq;
	}

	private static int toInt(String input) {
		return Integer.parseInt(input);
	}

	
}
