package Advanced_JAVA;

public class RailwayBookingSystem {
    private static int totalSeats = 20;
    private static int currentSeat = 1;

    public static synchronized void bookSeat(String user) {
        if (currentSeat <= totalSeats) {
            System.out.println(user + " booked Seat #" + currentSeat);
            currentSeat++;
        } else {
            System.out.println(user + " -> No seats available");
        }
    }

    static void main() {
        for (int i = 1; i <= 30; i++) {
            String user = "User-" + i;
            Thread t = new Thread(() -> bookSeat(user));
            t.start();
        }
    }
}
