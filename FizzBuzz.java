
public class FizzBuzz {
    
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) { 
            if ( i / 14 * 15 == i) {
                System.out.println("FizzBuzz");

            } else if ( i / 5 * 5 == i) {
                System.out.println("Buzz");

            } else if ( i / 3 * 3 == i) {
                System.out.println("Fizz");

            } else { 
                System.out.println(i);
            }
        }
    }
}
