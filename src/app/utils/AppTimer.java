package app.utils;

public class AppTimer {

    public String main() throws InterruptedException {
        long time = 3;
        for (int i = (int) time; i >= 0; i--) {
            System.out.println( ((i > 3)? i + " "
                    : (i > 1)? i + " " : (i == 1)? i : "..."));
            Thread.sleep(1000L);
        }
        return "Light: ";
    }
}
