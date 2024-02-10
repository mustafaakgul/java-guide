package org.example.codes.conditionals;
//prime number method
public class Third {
	public static void main(String[] args) {
		System.out.println("The first 50 primes numbers are\n");
		printPrimeNumbers(50);
	}
		public static void printPrimeNumbers(int number_of_primes){
			final int number_of_primes_per_line=10;
			int count=0;
			int number=2;
			while(count<number_of_primes){
				if(isPrime(number)){
					count++;
					if(count%number_of_primes_per_line==0){
						System.out.printf("%-5s\n",number);
					}
					else
						System.out.printf("%-5s\n",number);
				}
				number++;
			}
		}
		public static boolean isPrime(int number){
			for (int divisor = 2; divisor <= number/2; divisor++) {
				if(number%divisor==0){
					return false;
				}
		}
			return true;
	}
}
