import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Date;
import java.util.Locale;

public class HackersCalender {


    public static String day(int date) {


        return LocalDate.parse("date",DateTimeFormatter.ofPattern("DD/MM/YYYY")).getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.CANADA);
    }


    public static void main(String[] args) {
        HackersCalender.day(06/11/2015);

    }

}
