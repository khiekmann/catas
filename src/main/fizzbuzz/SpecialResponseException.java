package fizzbuzz;

/**
 * Created by HiekmaHe on 12.03.2017.
 */
public class SpecialResponseException extends Throwable
{
	private final String response;

	public SpecialResponseException(String specialResponse)
	{
		this.response = specialResponse;
	}

	public String response() {
		return response;
	}
}
