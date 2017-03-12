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
	public void givenFizzBuzzWhen3ThenFizz() {
		// arrange
		Fizzes fizzes = new Fizzes();
		fizzes.add(3, "Fizz");
		fizzes.add(5, "Buzz");

		// act
		String response = fizzes.respondTo(3);

		// assert
		assertEquals("Fizz", response);
	}

	@Test
	public void givenFizzBuzzWhen1Then1() {
		// arrange
		Fizzes fizzes = new Fizzes();
		fizzes.add(3, "Fizz");
		fizzes.add(5, "Buzz");

		// act
		String response = fizzes.respondTo(1);

		// assert
		assertEquals(String.valueOf(1), response);
	}

	@Test
	public void givenBuzzWhen15ThenBuzz() throws FizzException
	{
		// arrange
		Fizz buzz = new Fizz(5, "Buzz");

		// act
		// assert
		assertException(buzz, 15);
	}

	@Test
	public void givenBuzzWhen10ThenBuzz() throws FizzException
	{
		// arrange
		Fizz buzz = new Fizz(5, "Buzz");

		// act
		// assert
		assertException(buzz, 10);
	}

	@Test
	public void givenBuzzWhen5ThenBuzz() throws FizzException
	{
		// arrange
		Fizz buzz = new Fizz(5, "Buzz");

		// act
		// assert
		assertException(buzz, 5);
	}

	@Test
	public void givenBuzzWhen2Then1() throws FizzException
	{
		// arrange
		Fizz buzz = new Fizz(5, "Buzz");

		// act
		String response = buzz.respondTo(2);

		// assert
		assertEquals(String.valueOf(2), response);
	}

	@Test
	public void givenBuzzWhen1Then1() throws FizzException
	{
		// arrange
		Fizz buzz = new Fizz(5, "Buzz");

		// act
		String response = buzz.respondTo(1);

		// assert
		assertEquals(String.valueOf(1), response);
	}

	@Test
	public void givenFizzWhen2Then2() throws FizzException
	{
		// arrange
		Fizz fizz = new Fizz(3, "Fizz");

		// act
		String response = fizz.respondTo(2);

		// assert
		assertEquals(String.valueOf(2), response);
	}

	@Test
	public void givenFizzWhen1Then1() throws FizzException
	{
		// arrange
		Fizz fizz = new Fizz(3, "Fizz");

		// act
		String response = fizz.respondTo(1);

		// assert
		assertEquals(String.valueOf(1), response);
	}

	@Test
	public void givenFizzWhen9ThenFizz() throws FizzException
	{
		// arrange
		Fizz fizz = new Fizz(3, "Fizz");

		// act
		// assert
		assertException(fizz, 9);
	}

	@Test
	public void givenFizzWhen6ThenFizz() throws FizzException
	{
		// arrange
		Fizz fizz = new Fizz(3, "Fizz");

		// act
		// assert
		assertException(fizz, 6);
	}

	@Test
	public void givenFizzWhen3ThenFizz() throws FizzException
	{
		// arrange
				Fizz fizz = new Fizz(3, "Fizz");

		// act
		// assert
		assertException(fizz, 3);
	}

	@Test
	public void sanity() {
		assertTrue(true);
	}

	private void assertException(Fizz fizz, int number)
	{
		Throwable t = null;
		try {
			fizz.respondTo(number);
		} catch (FizzException fe) {
			t = fe;
		}
		assert(t != null);
	}
}