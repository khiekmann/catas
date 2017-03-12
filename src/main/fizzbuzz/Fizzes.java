package fizzbuzz;

import java.util.LinkedList;


/**
 * Created by HiekmaHe on 12.03.2017.
 */
public class Fizzes
{
	private LinkedList<Fizz> fizzes = new LinkedList();

	public void add(int divisor, String specialResponse)
	{
		fizzes.add(new Fizz(divisor, specialResponse));
	}

	public String respondTo(int number)
	{
		return String.valueOf(number);
	}
}
