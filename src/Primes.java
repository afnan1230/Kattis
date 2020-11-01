/*
 * Name: Afnan Mir
 * Date Completed: 8/15/2019
 * Period: 4
 */
/**
 *Creates a list of numbers specifying if prime or not prime
 */
 public class Primes {
 	private boolean[] nums;
 	private int size;
 	public static final int DEFAULT_UPPER_BOUND = 100;
 	/**
 	 *creates a list of prime numbers up to a specified upper bound
 	 *@param upperBound bound to go up to
 	 */
 	public Primes(int upperBound){
 		size = upperBound;
 		nums = new boolean[size+1];
 		for(int i=2;i<=size;i++){
 			nums[i] = true;
 		}
 		computePrimes();
 	}
 	/**
 	 *creates a list of prime numbers up to a default bound of 100
 	 */
 	public Primes(){
 		size = DEFAULT_UPPER_BOUND;
 		nums = new boolean[size+1];
 		for(int i=2;i<=size;i++){
 			nums[i] = true;
 		}
 		computePrimes();
 	}
 	/**
 	 *returns if the specified number is prime or not
 	 *@param x the number you want to if its prime or not
 	 *@return whether the number is prime
 	 */
 	public boolean isPrime(int x){
 		return nums[x];
 	}
 	/**
 	 *returns if the specified number is composite or not
 	 *@param x the number you want to if its composite or not
 	 *@return whether the number is composite
 	 */
 	public boolean isComposite(int x){
 		return !(isPrime(x));
 	}
 	/**
 	 *find the nth prime number
 	 *@param n specific number prime number you want
 	 *@return the nth prime number 
 	 */
 	public int nthPrime(int n){
 		int count = 0;
 		for(int i=2;i<=size;i++){
 			if(nums[i]){
 				count++;
 				if(count == n){
 					return i;
 				}
 			}
 		}
 		return 0;
 	}
 	/**
 	 *return a list of prime numbers in a certain range of numbers
 	 *@param min lower bound for the range to search
 	 *@param max the upper bound for the range to search
 	 *@return list of prime numbers in a specified range
 	 */
 	public int[] getPrimesWithin(int min, int max){
 		int count = 0;
 		for(int i=min; i<=max;i++){
 			if(nums[i]){
 				count++;
 			}
 		}
 		int[] prime = new int[count];
 		int j =0;
 		for(int i=min; i<=max ;i++){
 			if(nums[i]){
 				prime[j] = i;
 				j++;
 			}
 		}
 		return prime;
 	}
 	/**
 	 *return the prime numbers up to the upper bound
 	 *@return array of prime numbers up to the upper bound
 	 */
 	public String toString(){
 		String ret = "primes through "+ size +": ";
 		for (int i=2;i<=size;i++){
 			if(nums[i]){
 				ret += i+ " ";
 			}
 		}
 		return ret;
 	}
 	/**
 	 *return upper bound for list of prime numbers
 	 *@return upper bound for the list of prime numbers
 	 */
 	public int getUpperBound(){
 		return size;
 	}
 	/**
 	 *figure out which values up to the upper bound are prime or composite
 	 */
 	private void computePrimes(){
 		for(int i=2;i<=size;i++){
 			if(nums[i]){
 				for(int j= i+i; j<=size; j+=i){
 					nums[j] = false;
 				}
 			}
 		}
 	}
 	/**
 	 *changes upper bound for the list of prime numbers
 	 *@param x what the upper bound will be changed to
 	 */
 	public void changeUpperBound(int x){
 		nums = new boolean[x+1];
 		size = x;
 		for(int i =0; i<=x;i++){
 			nums[i] = true;
 		}	
 		computePrimes();	
 	}		
 	
 	
 }