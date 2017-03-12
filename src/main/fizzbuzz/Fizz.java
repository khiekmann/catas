package fizzbuzz;

/**
 * Created by HiekmaHe on 12.03.2017.
 */
public class Fizz
{

	private final int divisor;

	public Fizz(int divisor)
	{
		this.divisor = divisor;
	}

	public String respondTo(int number)
	{
		String response = String.valueOf(number);
		if (multipleOf(number)) {
			response = "Fizz";
		}
		return response;
	}

	private boolean multipleOf(int number)
	{
		return ((number % divisor) == 0);
	}
}
