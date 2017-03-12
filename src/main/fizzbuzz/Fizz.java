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

	public String respondTo(int number) throws SpecialResponseException
	{
		throwExceptionIfMultipleOf(number);
		throwExceptionIfDevisorIsContainedIn(number);
		return String.valueOf(number);
	}

	private void throwExceptionIfMultipleOf(int number) throws SpecialResponseException
	{
		if (multipleOf(number)) {
			throwSpecialResponse();
		}
	}

	private void throwSpecialResponse() throws SpecialResponseException
	{
		throw new SpecialResponseException(specialResponse);
	}

	private void throwExceptionIfDevisorIsContainedIn(int number) throws SpecialResponseException
	{
		String strNumber = String.valueOf(number);
		for ( int i = 0 ; i < strNumber.length() ; i++ ) {
			int digit = Character.getNumericValue(strNumber.charAt(i));
			if (digit == divisor) {
				throwSpecialResponse();
			}
		}
	}

	private boolean multipleOf(int number)
	{
		return ((number % divisor) == 0);
	}
}
