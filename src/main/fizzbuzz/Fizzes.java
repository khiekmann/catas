package fizzbuzz;

import java.util.LinkedList;


/**
 * Created by HiekmaHe on 12.03.2017.
 */
public class Fizzes
{
	private final LinkedList<Fizz> fizzes;
	private final String separator;

	public Fizzes()
	{
		this("");
	}

	public Fizzes(String separator)
	{
		this.fizzes = new LinkedList();
		this.separator = separator;
	}

	public void add(int divisor, String specialResponse)
	{
		fizzes.add(new Fizz(divisor, specialResponse));
	}

	public String respondTo(int number)
	{
		String response = new String();
		for ( Fizz fizz : fizzes ) {
			try {
				fizz.respondTo(number);
			} catch (FizzException e) {
				response += e.response();
			}
		}

		if (response.length() == 0) {
			response = String.valueOf(number);
		}

		return response + separator;
	}
}
