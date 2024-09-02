import java.util.Scanner;

    public class Test {

        static int power(int a, int b) {
            int result = 1;
            for (int i = 1; i <= b; i++) {
                result *= a;

            }
            return result;
        }

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            System.out.print("Ilk sayi : ");
            int a = scan.nextInt();
            System.out.print("Ikinci sayi :");
            int b = scan.nextInt();
            System.out.print("Us Hesabi : " + power(a, b));
        }
    }


