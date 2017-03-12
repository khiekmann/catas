package fizzbuzz;

/**
 * Created by HiekmaHe on 12.03.2017.
 */
public class FizzException extends Throwable
{
	private final String response;

	public FizzException(String specialResponse)
	{
		this.response = specialResponse;
	}

	public String response() {
		return response;
	}
}
