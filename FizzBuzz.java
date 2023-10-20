
public class FizzBuzz {

    public void run() {
        int i = 0;
        int n = 100;
        while (i<=100) {
            System.out.println(i++);
        }
        if (n%3 ==0) {
            System.out.println("Fizz");
        }
        if (i % 5 ==0) {
            System.out.println("Buzz");
        }
        if (i % 15 ==0) {
            System.out.println("FizzBuzz");
        }
    }

    public static void main(String[] args)
    {
        FizzBuzz hw = new FizzBuzz();
        hw.run();
    }
}
