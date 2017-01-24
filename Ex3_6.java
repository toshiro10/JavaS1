
public class Ex3_6 {
	public static void main(String[] args) {
		   
	       int N;            // One of the integers whose divisors we have to count.
	       int maxDivisors;  // Maximum number of divisors seen so far.
	       int i;
	       int[] save; 
	       
	       save = new int[10001];
	       
	       maxDivisors = 1;  // Start with the fact that 1 has 1 divisor.
	       save[1] = 1;

	       /* Process all the remaining values of N from 2 to 10000, and store
	          all the divisor counts in the array.  Update the value of maxDivisor
	          whenever we find a value of N that has more divisors than the current
	          value.
	       */
	       
	       for ( N = 2;  N <= 10000;  N++ ) {
	       
	           int D;  // A number to be tested to see if it's a divisor of N.
	           int divisorCount;  // Number of divisors of N.
	           
	           divisorCount = 0;
	           
	           for ( D = 1;  D <= N;  D++ ) {  // Count the divisors of N.
	              if ( N % D == 0 )
	                 divisorCount++;
	           }
	           
	           save[N] = divisorCount; 
	           
	           if (divisorCount > maxDivisors) {
	              maxDivisors = divisorCount;
	           }
	       
	       }
	       
	       System.out.println("Among integers between 1 and 10000,");
	       System.out.println("The maximum number of divisors was " + maxDivisors);
	       System.out.println("Numbers with that many divisors include:");
	       for ( i = 1; i <= 10000; i++ ) {
	           if ( save[i] == maxDivisors ) {
	               System.out.println( i );
	           }
	       }
	   
	   } // end main()
}
