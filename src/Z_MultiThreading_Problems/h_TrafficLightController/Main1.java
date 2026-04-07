package Z_MultiThreading_Problems.h_TrafficLightController;

public class Main1 {
    public static void main(String[] args) {
        TrafficLightController1 traffic = new TrafficLightController1(10);

        Thread north = new Thread(traffic::northSignal);
        Thread east = new Thread(traffic::eastSignal);
        Thread south = new Thread(traffic::southSignal);
        Thread west = new Thread(traffic::westSignal);

        north.start();
        east.start();
        south.start();
        west.start();

    }
}
