package Z_MultiThreading_Problems.b_Odd_Even_Printer_optimized;

public class Main {
    public static void main(String[] args) {
        Counter counter = new Counter(10);

        Thread evenPrinter = new Thread(new Printer(counter, 0), "Even Thread");
        Thread oddPrinter = new Thread(new Printer(counter, 1), "Odd Thread");

        evenPrinter.start();
        oddPrinter.start();
    }
}
