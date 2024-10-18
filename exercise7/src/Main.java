public class Main {
    public static void main(String[] args) {
        int S = 3665;

        int hours = 0, minutes = 0, seconds = 0;

        if (S >= 3600) {
            hours = S / 3600;
            S %= 3600;
        }

        if (S >= 60) {
            minutes = S / 60;
            S %= 60;
        }

        seconds = S;

        System.out.println(hours + ":" + minutes + ":" + seconds);
    }
}