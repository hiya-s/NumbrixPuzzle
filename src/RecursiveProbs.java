
public class RecursiveProbs {

	
	public static int numEars(int bunnies) {
		if(bunnies == 1) {
			return 2;
		}
		else {
			return numEars(bunnies - 1);
		}
	}
	
	public static void countdown(int num) {
		if(num == 0) {
			System.out.print("blastoff");
		}
		else {
			System.out.print(num+ " ");
			countdown(num -1);
		}
	}
	
	public static int factorial(int x) {
		if(x == 1) {
			return 1;
		}
		else {
			return x * factorial(x-1);
		}
	}
	
	public static String cheerlead (String str, int i) {
		if(i == 1) {
			return(str);
		}
		else {
			return (str + cheerlead(str, i-1));
		}
			
	}
	
	public static int exponent(int base, int power) {
		if(power == 0) {
			return 1;
		}
		else {
			return ( base * exponent(base, power - 1));
		}
	}
	
	//7 riddle
	public static int fibonacci(int n) {
		if(n == 0) {
			return 0;
		}
		if(n == 1) {
			return 1 + fibonacci(n-1);
		}
		else {
			return fibonacci(n - 1) + fibonacci( n - 2);
		}
	}
	
	public static void printPattern(int x) {
		if(x < 0) {
		}
		else {
			System.out.println(x);
			printPattern(x-5);
		}
		}
	
	public static int countNumA(String x) {
		if(x.indexOf("a") != -1) {
			return 1 + countNumA(x.substring(x.indexOf("a")));
		}
		else {
			return 0;
		}
	}
	
	public static void printAtoBbyc(int a, int b, int c) {
		if(a >= b) {
			
		}
		else {
			System.out.print(a + c);
			printAtoBbyc(a+c, b, c);
		}
		
	}
	
	public static int countOdds(int x) {
		
		if( x/ 10 == 0) {
			if( (x % 10) % 2  != 0) {
				return 1;
			}
			else {
				return 0;
			}
		}
		else {
			
			if( (x % 10) % 2  != 0) {
				return 1 + countOdds(x/10);
			}
			else {
				return countOdds(x/10);
			}
		}
	}
	
	public static int sumDigits(int x) {
		
		if( x/ 10 == 0) {
			
				return x;
			}
		
		else {
			
			if( (x % 10) != 0) {
				return x % 10 + sumDigits(x/10);
			}
			else {
				return sumDigits(x/10);
			}
		}
	}
	
	
}
