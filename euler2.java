
public class Euler2 {
public double sum_of_even_fib_nums(double num) {
  double fibonacciNumberOne = 1.0;
  double fibonacciNumberTwo = 2.0;
  if(num == 1)
    return fibonacciNumberOne;
  if(num == 2)
    return fibonacciNumberOne + fibonacciNumberTwo;
  double sum = 2.0;
  while(fibonacciNumberTwo < num) {
    double temp = fibonacciNumberTwo;
    fibonacciNumberTwo = fibonacciNumberOne + fibonacciNumberTwo;
    fibonacciNumberOne = temp;

    if(fibonacciNumberTwo % 2 == 0) {
      sum += fibonacciNumberTwo;
    }
  }
  return sum;
}

public static void main(String[] args) {
  Euler2 e2 = new Euler2();
  System.out.println(e2.sum_of_even_fib_nums(4000000));
}
}
