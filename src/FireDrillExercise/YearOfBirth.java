package FireDrillExercise;
import java.time.LocalDate;
import java.time.Period;
import java.util.Date;
public class YearOfBirth {
    public static int getAge(String date){
        String[] splittedString = date.split("/");
        LocalDate birthday = LocalDate.of(Integer.parseInt(splittedString[2]),Integer.parseInt(splittedString[1]),Integer.parseInt(splittedString[0]));
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthday,currentDate);
        return period.getYears();
    }

    public static void main(String[] args) {
       int age = getAge("28/4/2007");
        System.out.println(age);
    }


    }


