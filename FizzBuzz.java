
public class FizzBuzz {

    public void run() {
        int i = 1;
        while (i<=100) {
            System.out.println(i++);
        }
        if (i == 1) {
            System.out.println("Fizz");
        }
        if (i == 5) {
            System.out.println("Buzz");
        }
        if (i ==15) {
            System.out.println("FizzBuzz");
        }
    }

    public static void main(String[] args)
    {
        FizzBuzz hw = new FizzBuzz();
        hw.run();
    }
}
