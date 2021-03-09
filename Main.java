import javax.lang.model.util.ElementScanner6;

class Main {
  public static void main(String[] args) {
    System.out.println(factorial(4));
    System.out.println(fib(6));
  }

  public static int factorial(int n) {
    // Base case where the recursion stops
    if (n == 1)
      return 1;

    // recursive call getting us closer to the base case
    else
      return n * factorial(n - 1);

  }

  public static int fib(int m) {

    if (m < 3)
      return 1;

    else
      return fib(m - 1) + fib(m - 2);
  }

}