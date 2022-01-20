package s0509;


import org.junit.Test;


public class FibonacciTest {

	@Test
	public void test() {
		System.out.println(Fibonacci.getFibonacci(-1).toString().equals("-1"));
		System.out.println(Fibonacci.getFibonacci(-100).toString().equals("-1"));
		System.out.println(Fibonacci.getFibonacci(-50).toString().equals("-1"));
		System.out.println(Fibonacci.getFibonacci(0).toString().equals("0"));
		System.out.println(Fibonacci.getFibonacci(1).toString().equals("1"));
		System.out.println(Fibonacci.getFibonacci(2).toString().equals("1"));
		System.out.println(Fibonacci.getFibonacci(3).toString().equals("2"));
		System.out.println(Fibonacci.getFibonacci(4).toString().equals("3"));
		System.out.println(Fibonacci.getFibonacci(5).toString().equals("5"));
		System.out.println(Fibonacci.getFibonacci(8).toString().equals("21"));
		System.out.println(Fibonacci.getFibonacci(10).toString().equals("55"));
		System.out.println(Fibonacci.getFibonacci(15).toString().equals("610"));
		System.out.println(Fibonacci.getFibonacci(20).toString().equals("6765"));
		System.out.println(Fibonacci.getFibonacci(30).toString().equals("832040"));
		System.out.println(Fibonacci.getFibonacci(40).toString().equals("102334155"));
		System.out.println(Fibonacci.getFibonacci(50).toString().equals("12586269025"));
		System.out.println(Fibonacci.getFibonacci(70).toString().equals("190392490709135"));
		System.out.println(Fibonacci.getFibonacci(100).toString().equals("354224848179261915075"));
		System.out.println(Fibonacci.getFibonacci(150).toString().equals("9969216677189303386214405760200"));
		
	}

}
