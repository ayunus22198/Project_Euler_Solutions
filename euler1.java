public class Euler1 {
public int sum_of_multiples(double num) {
  int sum = 0;
  for(int i = 0;i<num;i++) {
    if(i%3==0 || i%5==0) {
      sum += i;
    }
  }
  return sum;
}

public static void main(String[] args) {
  Euler1 e1 = new Euler1();
  System.out.prdoubleln(e1.sum_of_multiples(1000));
}
}
