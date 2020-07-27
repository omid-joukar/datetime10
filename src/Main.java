import java.text.SimpleDateFormat;
import java.time.YearMonth;
import java.util.Calendar;

/**
 * Created by KPS on 7/27/2020.
 */
public class Main {
    public static void main(String[] args) {
            YearMonth ym = YearMonth.of(2020, 7);

            String firstDay = ym.atDay(1).getDayOfWeek().name();
            String lastDay = ym.atEndOfMonth().getDayOfWeek().name();
            System.out.println();
            System.out.println(firstDay);
            System.out.println(lastDay);
            System.out.println();
        }
    }

