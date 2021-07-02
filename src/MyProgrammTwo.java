import java.time.LocalTime;

public class MyProgrammTwo {
    public static void main(String[] args) {
        LocalTime one = LocalTime.of(14,15);

        LocalTime now = LocalTime.now();
        System.out.println(one);
        System.out.println(now);
    }
}
