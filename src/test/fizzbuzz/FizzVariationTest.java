package fizzbuzz;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by HiekmaHe on 12.03.2017.
 *
 * http://ccd-school.de/coding-dojo/function-katas/fizzbuzz/
 *
 */
public class FizzVariationTest
{

	@Test
	public void givenFizzBuzzWhen53ThenBuzzFizz() {
		// arrange
		Fizzes fizzes = new Fizzes();
		fizzes.add(3, "Fizz");
		fizzes.add(5, "Buzz");

		// act
		String response = fizzes.respondTo(53);

		// assert
		assertEquals("BuzzFizz", response);
	}

	@Test
	public void givenFizzBuzzWhen35ThenFizzBuzz() {
		// arrange
		Fizzes fizzes = new Fizzes();
		fizzes.add(3, "Fizz");
		fizzes.add(5, "Buzz");

		// act
		String response = fizzes.respondTo(53);

		// assert
		assertEquals("FizzBuzz", response);
	}

	@Test
	public void givenFizzBuzzWhen50ThenFizz() {
		// arrange
		Fizzes fizzes = new Fizzes();
		fizzes.add(3, "Fizz");
		fizzes.add(5, "Buzz");

		// act
		String response = fizzes.respondTo(50);

		// assert
		assertEquals("Buzz", response);
	}

	@Test
	public void givenFizzBuzzWhen13ThenFizz() {
		// arrange
		Fizzes fizzes = new Fizzes();
		fizzes.add(3, "Fizz");
		fizzes.add(5, "Buzz");

		// act
		String response = fizzes.respondTo(13);

		// assert
		assertEquals("Fizz", response);
	}

	@Test
	public void givenFizzWhen13ThenFizz() {
		// arrange
		Fizzes fizzes = new Fizzes();
		fizzes.add(3, "Fizz");

		// act
		String response = fizzes.respondTo(13);

		// assert
		assertEquals("Fizz", response);
	}
}