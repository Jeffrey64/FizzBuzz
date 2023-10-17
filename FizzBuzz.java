

    public class FizzBuzz {

    int fizz;
    int buzz;

    public void run() {
    int i = 1;
    while (i<=100) {
        System.out.println(i++);
    }
    }
   
    public static void main(String[] args)
    {
        FizzBuzz hw = new FizzBuzz();
        hw.run();
    }
}
