/*
 * Name: Afnan Mir
 * Date Completed:8/15/2019
 * Period: 4
 */
 
 /**
 * Tester for Primes Class
 */
 public class PrimesTester
{
	public static void main(String[] args)
	{
		Primes somePrimes = new Primes();
		System.out.println("Default Prime object");
		System.out.println(somePrimes);
		System.out.println("Upper Bound: " + somePrimes.getUpperBound());
		System.out.println("4th prime: " + somePrimes.nthPrime(4));
		System.out.println("7 prime?: " + somePrimes.isPrime(7));
		System.out.println("7 composite?: " + somePrimes.isComposite(7));
		somePrimes.changeUpperBound(50);
		System.out.println(somePrimes);
		int[] primes = somePrimes.getPrimesWithin(40,50);
		System.out.print("Primes between 40 and 50: ");
		for(int p: primes)
			System.out.print(p + " ");
		System.out.println();
		
		System.out.println("*******************");
		
		
		Primes myPrimes = new Primes(53);
		System.out.println(myPrimes);
		System.out.println("Upper Bound: " + myPrimes.getUpperBound());
		System.out.println("10th prime: " + myPrimes.nthPrime(10));
		System.out.println("15 prime?: " + myPrimes.isPrime(15));
		System.out.println("15 composite?: " + myPrimes.isComposite(15));
		myPrimes.changeUpperBound(200);
		System.out.println(myPrimes);
		int[] primes2 = myPrimes.getPrimesWithin(50,97);
		System.out.print("Primes between 50 and 97: ");
		for(int p: primes2)
			System.out.print(p + " ");
		System.out.println();
	}
}