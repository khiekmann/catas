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
	public void testOneToHundredWithLineSeparator() {
		// arrange
		Fizzes fizzes = new Fizzes();
		fizzes.add(3, "Fizz");
		fizzes.add(5, "Buzz");
		String expectedResponse = "12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz1617Fizz19BuzzFizz2223FizzBuzz26Fizz2829FizzBuzz3132Fizz34BuzzFizz3738FizzBuzz41Fizz4344FizzBuzz4647Fizz49BuzzFizz5253FizzBuzz56Fizz5859FizzBuzz6162Fizz64BuzzFizz6768FizzBuzz71Fizz7374FizzBuzz7677Fizz79BuzzFizz8283FizzBuzz86Fizz8889FizzBuzz9192Fizz94BuzzFizz9798FizzBuzz";
		StringBuilder actualResponse = new StringBuilder();

		// act
		for ( int i = 1 ; i < 101 ; i++ ) {
			actualResponse.append(fizzes.respondTo(i));
		}

		// assert
		assertEquals(expectedResponse, actualResponse.toString());
	}

	@Test
	public void testOneToHundred() {
		// arrange
		Fizzes fizzes = new Fizzes();
		fizzes.add(3, "Fizz");
		fizzes.add(5, "Buzz");
		String expectedResponse = "12Fizz4BuzzFizz78FizzBuzz11Fizz1314FizzBuzz1617Fizz19BuzzFizz2223FizzBuzz26Fizz2829FizzBuzz3132Fizz34BuzzFizz3738FizzBuzz41Fizz4344FizzBuzz4647Fizz49BuzzFizz5253FizzBuzz56Fizz5859FizzBuzz6162Fizz64BuzzFizz6768FizzBuzz71Fizz7374FizzBuzz7677Fizz79BuzzFizz8283FizzBuzz86Fizz8889FizzBuzz9192Fizz94BuzzFizz9798FizzBuzz";
		StringBuilder actualResponse = new StringBuilder();

		// act
		for ( int i = 1 ; i < 101 ; i++ ) {
			actualResponse.append(fizzes.respondTo(i));
		}

		// assert
		assertEquals(expectedResponse, actualResponse.toString());
	}

	@Test
	public void givenFizzBuzzWhen30ThenFizzBuzz() {
		// arrange
		Fizzes fizzes = new Fizzes();
		fizzes.add(3, "Fizz");
		fizzes.add(5, "Buzz");

		// act
		String response = fizzes.respondTo(30);

		// assert
		assertEquals("FizzBuzz", response);
	}

	@Test
	public void givenFizzBuzzWhen15ThenFizzBuzz() {
		// arrange
		Fizzes fizzes = new Fizzes();
		fizzes.add(3, "Fizz");
		fizzes.add(5, "Buzz");

		// act
		String response = fizzes.respondTo(15);

		// assert
		assertEquals("FizzBuzz", response);
	}

	@Test
	public void givenFizzBuzzWhen10ThenBuzz() {
		// arrange
		Fizzes fizzes = new Fizzes();
		fizzes.add(3, "Fizz");
		fizzes.add(5, "Buzz");

		// act
		String response = fizzes.respondTo(10);

		// assert
		assertEquals("Buzz", response);
	}

	@Test
	public void givenFizzBuzzWhen5ThenBuzz() {
		// arrange
		Fizzes fizzes = new Fizzes();
		fizzes.add(3, "Fizz");
		fizzes.add(5, "Buzz");

		// act
		String response = fizzes.respondTo(5);

		// assert
		assertEquals("Buzz", response);
	}

	@Test
	public void givenFizzBuzzWhen6ThenFizz() {
		// arrange
		Fizzes fizzes = new Fizzes();
		fizzes.add(3, "Fizz");
		fizzes.add(5, "Buzz");

		// act
		String response = fizzes.respondTo(6);

		// assert
		assertEquals("Fizz", response);
	}

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
	public void givenFizzBuzzWhen2Then2() {
		// arrange
		Fizzes fizzes = new Fizzes();
		fizzes.add(3, "Fizz");
		fizzes.add(5, "Buzz");

		// act
		String response = fizzes.respondTo(2);

		// assert
		assertEquals(String.valueOf(2), response);
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