package MultiThreading_Problems.Odd_Even_Printer;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter(10);

        Thread evenPrinter = new Thread(new EvenPrinter(counter), "Even Thread");
        Thread oddPrinter = new Thread(new OddPrinter(counter), "Odd Thread");

        evenPrinter.start();
        oddPrinter.start();
    }
}
