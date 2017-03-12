package fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


/**
 * Created by HiekmaHe on 12.03.2017.
 *
 * http://ccd-school.de/coding-dojo/function-katas/fizzbuzz/
 *
 */
public class FizzBuzzTest
{

	@Test
	public void givenFizzWhen3ThenFizz() {
		// arrange
		Fizz fizz = new Fizz();

		// act
		String response = fizz.respondTo(3);

		// assert
		assertEquals("Fizz", response);
	}

	@Test
	public void sanity() {
		assertTrue(true);
	}
}
