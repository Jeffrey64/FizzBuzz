
public class FizzBuzz {

    public static String fizzbuzz(final int number) {
        int i =100;
        if (number / 15 * 15 == number) {
            System.out.println("FizzBuzz");
        } else if (number / 5 * 5 == number) {
            System.out.println("Buzz");
        } else if (number / 3 * 3 == number) {
            System.out.println("Fizz");
        }
        return Integer.toString(i);
        }

    public static void main(String[] args)
    {
        FizzBuzz hw = new FizzBuzz();
    }
}
