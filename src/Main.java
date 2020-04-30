public class Main {
    public static void main(String[] args) {
        FactorialCalculator factorialCalculator = new FactorialCalculator();
        FibonacciCalculator fibonacciCalculator = new FibonacciCalculator();

        long silnia = 10;
        long fibonacci = 10;

        System.out.println("Silnia z liczby: " + silnia);
        factorialCalculator.setArgument(silnia);
        factorialCalculator.compareResults();

        System.out.println("Wyraz ciągu Fibonacciego numer. " + fibonacci);
        fibonacciCalculator.setElement(fibonacci);
        fibonacciCalculator.compareResults();
    }
}
