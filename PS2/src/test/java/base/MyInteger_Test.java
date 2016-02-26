package base;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyInteger_Test {

	// Tests for isEven(), isOdd(), and isPrime() methods
	@Test
	public void isEvenTest() {
		MyInteger x = new MyInteger(84);
		MyInteger y = new MyInteger(37);	
		assertTrue(x.isEven());
		assertFalse(y.isEven());
	}

	@Test
	public void isOddTest() {
		MyInteger x = new MyInteger(53);
		MyInteger y = new MyInteger(98);	
		assertTrue(x.isOdd());
		assertFalse(y.isOdd());

	}

	@Test
	public void isPrimeTest() {
		MyInteger x = new MyInteger(971);
		MyInteger y = new MyInteger(545);	
		assertTrue(x.isPrime());
		assertFalse(y.isPrime());

	}

	// Tests for isEven(int), isOdd(int), and isPrime(int) static methods
	@Test
	public void isEvenIntTest(){
		assertTrue(MyInteger.isEven(66));
		assertFalse(MyInteger.isEven(77));
	}
	
	@Test
	public void isOddIntTest() {
		assertTrue(MyInteger.isOdd(3));
		assertFalse(MyInteger.isOdd(40));
	}
	
	@Test
	public void isPrimeIntTest() {
		assertTrue(MyInteger.isPrime(613));
		assertFalse(MyInteger.isPrime(832));
	}

	// Tests for isEven(MyInteger), isOdd(MyInteger), and isPrime(MyInteger) static methods
	@Test
	public void isEvenMyIntegerTest() {
		MyInteger x = new MyInteger(16);
		MyInteger y = new MyInteger(37);	
		assertTrue(x.isEven());
		assertFalse(y.isEven());
	}
	
	@Test
	public void isOddMyIntegerTest() {
		MyInteger x = new MyInteger(77);
		MyInteger y = new MyInteger(100);	
		assertTrue(x.isOdd());
		assertFalse(y.isOdd());
	}
	
	@Test
	public void isPrimeMyIntegerTest() {
		MyInteger x = new MyInteger(719);
		MyInteger y = new MyInteger(90);	
		assertTrue(x.isPrime());
		assertFalse(y.isPrime());
	}
	
	
	// Tests for equals(int) and equals(MyInteger) methods
	@Test
	public void eaualsIntTest() {
		MyInteger num = new MyInteger(75);
		assertTrue(num.equals(75));
		assertFalse(num.equals(46));
	}
	
	public void equalsMyIntegerTest() {
		MyInteger num1 = new MyInteger(5);
		MyInteger num2 = new MyInteger(5);
		MyInteger num3 = new MyInteger(10);
		assertTrue(num1.equals(num2));
		assertFalse(num1.equals(num3));
	}
	
}
