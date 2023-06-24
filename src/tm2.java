import java.util.ArrayList;
import java.util.List;

public class tm2 {

        public static void main(String[] args) {
            List<Integer> fibonacciSequence = generateFibonacci(4500);
            List<Integer> evenFibonacciSequence = getEvenFibonacci(fibonacciSequence, 10, 4500);

            System.out.println("Deret bilangan Fibonacci genap:");
            System.out.println(evenFibonacciSequence);
            System.out.println("\nJumlah bilangan Fibonacci genap: " + evenFibonacciSequence.size());
            System.out.println("Total bilangan Fibonacci genap: " + sumEvenFibonacci(evenFibonacciSequence));
        }

        public static List<Integer> generateFibonacci(int n) {
            List<Integer> fibonacci = new ArrayList<>();
            fibonacci.add(0);
            fibonacci.add(1);

            while (fibonacci.get(fibonacci.size() - 1) < n) {
                int nextFibonacci = fibonacci.get(fibonacci.size() - 1) + fibonacci.get(fibonacci.size() - 2);
                fibonacci.add(nextFibonacci);
            }

            return fibonacci;
        }

        public static List<Integer> getEvenFibonacci(List<Integer> fibonacciSequence, int start, int end) {
            List<Integer> evenFibonacci = new ArrayList<>();

            for (int num : fibonacciSequence) {
                if (num >= start && num <= end && num % 2 == 0) {
                    evenFibonacci.add(num);
                }
            }

            return evenFibonacci;
        }

        public static int sumEvenFibonacci(List<Integer> fibonacciSequence) {
            int sum = 0;

            for (int num : fibonacciSequence) {
                sum += num;
            }

            return sum;
        }
    }


