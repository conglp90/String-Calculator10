import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {

	public static int add(String input) {
		// TODO Auto-generated method stub
		int kq=0;
		ArrayList<Integer> valueList = new ArrayList<Integer>() ;
		if(input==null||input.isEmpty())
			return kq;
		Matcher matcher=Pattern.compile("-?[0-9]+").matcher(input);
		while (matcher.find()) {
			valueList.add(toInt(matcher.group(0)));
		}
		for (Integer integer : valueList) {
			kq+=integer;
		}
		return kq;
	}

	private static int toInt(String input) {
		return Integer.parseInt(input);
	}
	
}
