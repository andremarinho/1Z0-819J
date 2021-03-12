import java.time.LocalTime;

public class Q40 {

	 public static void main(String[] args) {
         LocalTime time = LocalTime.of(16, 40);
         String amPm = time.getHour() >= 12 ? (time.getHour() == 12) ? "PM" : "AM";
         System.out.println(amPm);
     }
}
