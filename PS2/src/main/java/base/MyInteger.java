package base;

// Class named MyInteger
class MyInteger {

	/* int data field named iValue that stores the int value represented by this
	 * object.
	 */
	private int iValue;

	// A constructor that creates a MyInteger object for the specified iValue.
	public MyInteger(int iValue) {
		this.iValue = iValue;
	}

	// A get method that returns iValue
	public int getiValue() {
		return iValue;
	}

	/* Methods isEven(), isOdd(), and isPrime() that return true if iValue is
	 * even, odd, or prime, respectively.
	 */
	public boolean isEven() {
		if (iValue % 2 == 0) {
			return true;
		}
		return false;
	}

	public boolean isOdd() {
		if (iValue % 2 != 0) {
			return true;
		}
		return false;
	}

	public boolean isPrime() {
	    for(int i=2;i<iValue;i++) {
	        if(iValue%i==0)
	            return false;
	    }
	    return true;
	}

	/*
	 * Static methods isEven(int), isOdd(int), and isPrime(int) that return true
	 * if the specified value is even, odd, or prime, respectively.
	 */
	public static boolean isEven(int num) {
		return (num % 2 == 0);
	}

	public static boolean isOdd(int num) {
		return (num % 2 != 0);
	}

	public static boolean isPrime(int num) {		
	    for(int i=2;i<num;i++) {
	        if(num%i==0)
	            return false;
	    }
	    return true;
		
		
	}

	/*
	 * Static methods isEven(MyInteger), isOdd(MyInteger), and
	 * isPrime(MyInteger) that return true if the specified value is even, odd,
	 * or prime, respectively.
	 */
	public boolean isEven(MyInteger num)

	{
		return num.isEven();
	}

	public boolean isOdd(MyInteger num) {
		return num.isOdd();

	}

	public boolean isPrime(MyInteger num) {
		return num.isOdd();

	}

	/*
	 * Methods equals(int) and equals(MyInteger) that return true if the value
	 * in the object is equal to the specified value.
	 */
	public boolean equals(int num) {
		return (iValue == num);

	}

	public boolean equals(MyInteger num) {
		return (iValue == num.iValue);
	}

}



	class MyIntegerEncapsulation {
 		public static void main(String[] args) {
 			MyInteger encap = new MyInteger(3);

 			System.out.println("The number is " + encap.getiValue());
 			System.out.println("Is the number even? " + encap.isEven());
 			System.out.println("Is the number odd? " + encap.isOdd());
 			System.out.println("Is the number prime? " + encap.isPrime());
 			System.out.println("Is the number 20 prime? " + encap.isPrime(20));

 			MyInteger encap2 = new MyInteger(32);
 			System.out.println("The second number is " + encap2.getiValue());
 			System.out.println("Is the second number even? " + encap2.isEven());
 			System.out.println("Is the second number odd? " + encap2.isOdd());
 			System.out.println("Is the second number 4 even? " + encap2.isEven(4));
 			System.out.println("Is the second number 5 odd? " + encap2.isOdd(5));
 			System.out.println("Is the second number prime? " + encap2.isPrime());
 			System.out.println("Is the second number 11 prime? " + encap2.isPrime(11));
 			System.out.println("Is the second number equal to the first number? " + encap2.equals(encap));
 		}
	}
	