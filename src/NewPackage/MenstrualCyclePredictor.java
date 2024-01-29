import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
public class MenstrualCyclePredictor {

        public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter your last period: ");
                String lastPeriod = scanner.nextLine();
                System.out.println("Enter your menstrual cycle length: ");
                int menstrualCycleLength = scanner.nextInt();
                System.out.println("Enter your current date: ");
                String currentDate = scanner.nextLine();
        }
        public static void trackCycle(String lastPeriod, int menstrualCycleLength, String currentDate){

                LocalDate last = LocalDate.parse(lastPeriod);
                LocalDate current = LocalDate.parse(currentDate);

                int daysBetween = (int) ChronoUnit.DAYS.between(last, current);
                int nextPeriod = menstrualCycleLength - daysBetween;

                int fertileStart = menstrualCycleLength - 20;
                int fertileEnd = menstrualCycleLength - 11;

                int ovulation = (fertileStart - 1) + (fertileEnd - fertileStart) / 2;
                int nextFertile = fertileStart - daysBetween;
                int nextOvulation = ovulation - daysBetween;

                int currentDay = daysBetween + 1;

             System.out.println("Days left for the next period: " + nextPeriod);
             System.out.println("Days left for the next fertile phase: " + nextFertile);
             System.out.println("Days left for the next ovulation: " + nextOvulation);
             System.out.println("Current cycle day: " + currentDay);
        }
}
