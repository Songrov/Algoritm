package lesson9;

    public class Fibo {
        public static int fibonacci(int n) {
            if (n == 0) {
                return 0;
            } else if (n == 1) {
                return 1;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }
        }

        public static void main(String[] args) {
            int n = 10; // Порядковый номер числа Фибоначчи, которое хотим получить
            int result = fibonacci(n);
            System.out.println("Число Фибоначчи с номером " + n + ": " + result);
        }
    }


