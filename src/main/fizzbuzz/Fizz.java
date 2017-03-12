package fizzbuzz;

/**
 * Created by HiekmaHe on 12.03.2017.
 */
public class Fizz
{

	private final int divisor;
	private String specialResponse;

	public Fizz(int divisor, String specialResponse)
	{
		this.divisor = divisor;
		this.specialResponse = specialResponse;
	}

	public String respondTo(int number)
	{
		String response = String.valueOf(number);
		if (multipleOf(number)) {
			response = specialResponse;
		}
		return response;
	}

	private boolean multipleOf(int number)
	{
		return ((number % divisor) == 0);
	}
}
