package fizzbuzz;

import java.util.LinkedList;


/**
 * Created by HiekmaHe on 12.03.2017.
 */
public class Fizzes
{
	private final LinkedList<Fizz> fizzes;
	private final String separator;
	private String response;

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
		response = new String();
		responseEitherSpecialOr(number).finallyAppendSeperator();
		return response;
	}

	private Fizzes responseEitherSpecialOr(int number)
	{
		setResponseToSpecialIfTriggeredFor(number);
		ifResponseEmptySetTo(number);
		return this;
	}

	private void setResponseToSpecialIfTriggeredFor(int number)
	{
		for ( Fizz fizz : fizzes ) {
			ifResponseSpecialThenAppend(fizz, number);
		}
	}

	private void ifResponseSpecialThenAppend(Fizz fizz, int number)
	{
		try {
			fizz.respondTo(number);
		} catch (FizzException e) {
			response += e.response();
		}
	}

	private void ifResponseEmptySetTo(int number)
	{
		if (reponseEmpty()) {
			response = String.valueOf(number);
		}
	}

	private boolean reponseEmpty()
	{
		return response.length() == 0;
	}

	private void finallyAppendSeperator()
	{
		response += separator;
	}
}
